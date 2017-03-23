
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
		
	}
	public void(){
		
	}
	
	public void(){
		
	}
	
	public void(){
		
	}
	
	public void(){
		
	}
	
	public void(){
		
	}
	
	public void(){
		
	}
	
	public void(){
		
}
