
public class Deducciones {
	private double ingresoAnual,
					aguinaldoExcento,
					aguinaldoGravado,
					primaVacacionalExcenta,
					primaVacacionalGravada,
					totalIngresosGravados,
					maximoDeducirColegiatura,
					totalDeduccionesSnR,
					deduccionesPermitidas,
					montoSobreElCualSeCalculaISR,
					cuotaFija,
					porcentExedenteLimInf,
					LimInf,
					pagoExcedenteLimInf,
					totalAPagar;
	private Persona a;

	public Deducciones(Persona a){
		this.a=a;
		
	}

	public double ingresoAnual(){
		this.ingresoAnual=this.a.getSueldoMensual()*12;
		return  this.ingresoAnual;
	}
	public double aguinaldoExcento(){
		this.aguinaldoExcento=this.a.getSueldoMensual()/2;
		return this.aguinaldoExcento;
	}
	public double aguinaldoGravado(){
		if((this.a.getAguinaldo()-this.aguinaldoExcento)<0){
			this.aguinaldoGravado=0;
		}
		else{
			this.aguinaldoGravado=this.a.getAguinaldo()-this.aguinaldoExcento;
		}

		return this.aguinaldoGravado;
	}
	public double primaVacacionalExcenta(){
		this.primaVacacionalExcenta=15*80.04;
		return this.primaVacacionalExcenta;
	}
	public double primaVacacionalGravada(){
		if((this.a.getPrimaVacacional()-this.primaVacacionalExcenta)<0){
			this.primaVacacionalExcenta=0;
		}
		else{
			this.primaVacacionalExcenta=this.a.getPrimaVacacional()-this.primaVacacionalExcenta;
		}
		return this.primaVacacionalExcenta;
	}
	public double totalIngresosGravados(){
		this.totalIngresosGravados=this.ingresoAnual+this.aguinaldoGravado+this.primaVacacionalGravada;
		return this.totalIngresosGravados;
	}
	public double maximoDeducirColegiatura(){
		if(this.a.getNivelEducativo().equals("Preescolar")){
			this.maximoDeducirColegiatura=14200;
		}
		else if(this.a.getNivelEducativo().equals("Primaria")){
			this.maximoDeducirColegiatura=12900;
		}
		else if(this.a.getNivelEducativo().equals("Secundaria")){
			this.maximoDeducirColegiatura=19900;
		}
		else if(this.a.getNivelEducativo().equals("Profesional Tecnico")){
			this.maximoDeducirColegiatura=17100;
		}
		else if(this.a.getNivelEducativo().equals("Bachillerato")){
			this.maximoDeducirColegiatura=2500;
		}
		else{
			this.maximoDeducirColegiatura=0;
		}

		return this.maximoDeducirColegiatura;
	}
	public double totalDeduccionesSnR(){
		if (a.getColegiatura()<this.maximoDeducirColegiatura){
			this.totalDeduccionesSnR=a.getMedicos()+a.getFunerarios()+a.getSggm()+a.getHipotecarios()+a.getDonativos()+a.getTransporte()+a.getColegiatura();
		}
		else {
			this.totalDeduccionesSnR=a.getMedicos()+a.getFunerarios()+a.getSggm()+a.getHipotecarios()+a.getDonativos()+a.getTransporte()+this.maximoDeducirColegiatura;
		}
		return this.totalDeduccionesSnR;
	}
	public double deduccionesPermitidas(){
		this.deduccionesPermitidas=(this.ingresoAnual+this.totalDeduccionesSnR)*0.1;
		return this.deduccionesPermitidas;
	}
	public double montoSobreElCualSeCalculaISR(){
		this.montoSobreElCualSeCalculaISR=this.totalIngresosGravados-this.deduccionesPermitidas;
		return this.montoSobreElCualSeCalculaISR;
	}

	public double cuotaFija(){
		if(this.montoSobreElCualSeCalculaISR< 5952.84){
			this.cuotaFija = 0;
		}
		else if ( this.montoSobreElCualSeCalculaISR>5952.85 && this.montoSobreElCualSeCalculaISR<50524.92){
			this.cuotaFija = 114.29;
		}
		else if ( this.montoSobreElCualSeCalculaISR>50524.93 && this.montoSobreElCualSeCalculaISR<88793.04){
			this.cuotaFija = 2966.91;
		}
		else if ( this.montoSobreElCualSeCalculaISR>88793.05 && this.montoSobreElCualSeCalculaISR<103218){
			this.cuotaFija = 7130.48;
		}
		else if ( this.montoSobreElCualSeCalculaISR>103218.01 && this.montoSobreElCualSeCalculaISR<123580.2){
			this.cuotaFija = 9438.47;
		}
		else if ( this.montoSobreElCualSeCalculaISR>123580.21 && this.montoSobreElCualSeCalculaISR<249243.48){
			this.cuotaFija = 13087.37;
		}
		else if ( this.montoSobreElCualSeCalculaISR>249243.48 && this.montoSobreElCualSeCalculaISR<392841.96){
			this.cuotaFija = 39929.05;
		}
		else if ( this.montoSobreElCualSeCalculaISR>392841.97 && this.montoSobreElCualSeCalculaISR<750000){
			this.cuotaFija = 73703.41;
		}
		else if ( this.montoSobreElCualSeCalculaISR>750000.01 && this.montoSobreElCualSeCalculaISR<1000000){
			this.cuotaFija = 180850.82;
		}
		else if ( this.montoSobreElCualSeCalculaISR>1000000.01 && this.montoSobreElCualSeCalculaISR<3000000){
			this.cuotaFija = 260850.81;
		}
		else if ( this.montoSobreElCualSeCalculaISR>3000000.01){
			this.cuotaFija = 940850.81;
		}
		return this.cuotaFija;
	}
	public double porcentExedenteLimInf(){
		if(this.montoSobreElCualSeCalculaISR< 5952.84){
			this.porcentExedenteLimInf = 1.92;
		}
		else if ( this.montoSobreElCualSeCalculaISR>5952.85 && this.montoSobreElCualSeCalculaISR<50524.92){
			this.porcentExedenteLimInf = 6.4;
		}
		else if ( this.montoSobreElCualSeCalculaISR>50524.93 && this.montoSobreElCualSeCalculaISR<88793.04){
			this.porcentExedenteLimInf = 10.88;
		}
		else if ( this.montoSobreElCualSeCalculaISR>88793.05 && this.montoSobreElCualSeCalculaISR<103218){
			this.porcentExedenteLimInf = 16;
		}
		else if ( this.montoSobreElCualSeCalculaISR>103218.01 && this.montoSobreElCualSeCalculaISR<123580.2){
			this.porcentExedenteLimInf = 17.92;
		}
		else if ( this.montoSobreElCualSeCalculaISR>123580.21 && this.montoSobreElCualSeCalculaISR<249243.48){
			this.porcentExedenteLimInf = 21.36;
		}
		else if ( this.montoSobreElCualSeCalculaISR>249243.48 && this.montoSobreElCualSeCalculaISR<392841.96){
			this.porcentExedenteLimInf = 23.52;
		}
		else if ( this.montoSobreElCualSeCalculaISR>392841.97 && this.montoSobreElCualSeCalculaISR<750000){
			this.porcentExedenteLimInf = 30;
		}
		else if ( this.montoSobreElCualSeCalculaISR>750000.01 && this.montoSobreElCualSeCalculaISR<1000000){
			this.porcentExedenteLimInf = 32;
		}
		else if ( this.montoSobreElCualSeCalculaISR>1000000.01 && this.montoSobreElCualSeCalculaISR<3000000){
			this.porcentExedenteLimInf = 34;
		}
		else if ( this.montoSobreElCualSeCalculaISR>3000000.01){
			this.porcentExedenteLimInf = 35;
		}
		
		return this.porcentExedenteLimInf;
	}
	public double LimInf(){
		if ( this.porcentExedenteLimInf == 1.92){
			this.LimInf = 0.01;
		}
		else if(this.porcentExedenteLimInf == 6.4){
			this.LimInf = 5952.85;
		}
		else if(this.porcentExedenteLimInf == 10.88){
			this.LimInf = 50524.93;
		}
		else if(this.porcentExedenteLimInf == 16){
			this.LimInf = 88793.05;
		}
		else if(this.porcentExedenteLimInf == 17.92){
			this.LimInf = 103218.01;
		}
		else if(this.porcentExedenteLimInf == 21.36){
			this.LimInf = 123580.21;
		}
		else if(this.porcentExedenteLimInf == 23.52){
			this.LimInf = 249243.49;
		}
		else if(this.porcentExedenteLimInf == 30){
			this.LimInf = 392841.97;
		}
		else if(this.porcentExedenteLimInf == 32){
			this.LimInf = 750000.01;
		}
		else if(this.porcentExedenteLimInf == 34){
			this.LimInf = 1000000.01;
		}
		else if(this.porcentExedenteLimInf == 35){
			this.LimInf = 3000000.01;
		}
		return this.LimInf;
	}
	public double pagoExcedenteLimInf(){
		this.pagoExcedenteLimInf = (this.porcentExedenteLimInf/100)*(this.montoSobreElCualSeCalculaISR-this.LimInf);
		return this.pagoExcedenteLimInf;
	}
	public double totalPagar(){
		this.totalAPagar = this.cuotaFija + this.pagoExcedenteLimInf;
		return this.totalAPagar;
	}
}
