
public class Deducciones {
	private double ingresoAnual,
				   aguinaldoExcento,
				   aguinaldoGravado,
				   primaVacacionalExcenta=15*80.4,
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
	Persona a=new Persona();
	
	public void ingresoAnual(){
		this.ingresoAnual=this.a.getSueldoMensual()*12;
	}
	public void aguinaldoExcento(){
		this.aguinaldoExcento=this.a.getAguinaldo()/2;
	}
	public void aguinaldoGravado(){
		if((this.a.getAguinaldo()-this.aguinaldoExcento)<0){
			this.aguinaldoGravado=0;
		}
		else{
			this.aguinaldoGravado=this.a.getAguinaldo()-this.aguinaldoExcento;
		}
	}
	public void primaVacacionalGravada(){
		if((this.a.getPrimaVacacional()-this.primaVacacionalExcenta)<0){
			this.aguinaldoGravado=0;
		}
		else{
			this.primaVacacionalExcenta=this.a.getPrimaVacacional()-this.primaVacacionalExcenta;
		}
	}
	public void totalIngresosGravados(){
		this.totalIngresosGravados=this.ingresoAnual+this.aguinaldoGravado+this.primaVacacionalGravada;
	}
	public void maximoDeducirColegiatura(){
		if(this.a.getNivelEducativo().equals("Preescolar")){
			this.maximoDeducirColegiatura=14200;
		}
		else if(this.a.getNivelEducativo().equals("Primaria")){
			this.maximoDeducirColegiatura=12900;
		}
		else if(this.a.getNivelEducativo().equals("Secundaria")){
			this.maximoDeducirColegiatura=19900;
		}
		else if(this.a.getNivelEducativo().equals("Profesiona Tecnico")){
			this.maximoDeducirColegiatura=17100;
		}
		else if(this.a.getNivelEducativo().equals("Bachillerato")){
			this.maximoDeducirColegiatura=2500;
		}
		else{
			this.maximoDeducirColegiatura=0;
		}
	}
	public void totalDeduccionesSnR(){
		if (a.getColegiatura()<this.maximoDeducirColegiatura){
		this.totalDeduccionesSnR=a.getMedicos()+a.getFunerarios()+a.getSggm()+a.getHipotecarios()+a.getDonativos()+a.getTransporte()+a.getColegiatura();
		}
		else {
			this.totalDeduccionesSnR=a.getMedicos()+a.getFunerarios()+a.getSggm()+a.getHipotecarios()+a.getDonativos()+a.getTransporte()+this.maximoDeducirColegiatura;
		}
	}
	public void deduccionesPermitidas(){
		this.deduccionesPermitidas=(this.ingresoAnual+this.totalDeduccionesSnR)*0.1;
	}
	public void montoSobreElCualSeCalculaISR(){
		this.montoSobreElCualSeCalculaISR=this.totalIngresosGravados-this.deduccionesPermitidas;
	}
	
	public void cuotaFija(){
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
	}
	public void porcentExedenteLimInf(){
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
	}
	public void LimInf(){
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
	}
	public void pagoExcedenteLimInf(){
		this.pagoExcedenteLimInf = (this.porcentExedenteLimInf/100)*(this.montoSobreElCualSeCalculaISR-this.LimInf);
	}
	public void totalPagar(){
		this.totalAPagar = this.cuotaFija + this.pagoExcedenteLimInf;
	}
}
