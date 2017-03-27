
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
	/*
	public void(){
		
	}
	
	public void(){
		
	}
	
	public void(){
		
	}*/
}
