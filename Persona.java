import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Persona {
	private String nombre,
				   rfc,
				   nivelEducativo,
				   ruta,
				   linea,
				   texto;
	
	private double sueldoMensual,
				   aguinaldo,
				   primaVacacional,
				   medicos,
				   funerarios,
				   sggm,
				   hipotecarios,
				   donativos,
				   aportacionRetiro,
				   transporte,
				   colegiatura;
	private Persona[] persona;
	
	public Persona() {
		this.nombre = "";
		this.rfc = "";
		this.nivelEducativo = "";
		this.ruta="";
		this.linea="";
		this.texto="";
		this.sueldoMensual = 0;
		this.aguinaldo = 0;
		this.primaVacacional = 0;
		this.medicos = 0;
		this.funerarios = 0;
		this.sggm = 0;
		this.hipotecarios = 0;
		this.donativos = 0;
		this.aportacionRetiro = 0;
		this.transporte = 0;
		this.colegiatura = 0;
	}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getNivelEducativo() {
		return nivelEducativo;
	}
	public void setNivelEducativo(String nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}
	public double getSueldoMensual() {
		return sueldoMensual;
	}
	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	public double getAguinaldo() {
		return aguinaldo;
	}
	public void setAguinaldo(double aguinaldo) {
		this.aguinaldo = aguinaldo;
	}
	public double getPrimaVacacional() {
		return primaVacacional;
	}
	public void setPrimaVacacional(double primaVacacional) {
		this.primaVacacional = primaVacacional;
	}
	public double getMedicos() {
		return medicos;
	}
	public void setMedicos(double medicos) {
		this.medicos = medicos;
	}
	public double getFunerarios() {
		return funerarios;
	}
	public void setFunerarios(double funerarios) {
		this.funerarios = funerarios;
	}
	public double getSggm() {
		return sggm;
	}
	public void setSggm(double sggm) {
		this.sggm = sggm;
	}
	public double getHipotecarios() {
		return hipotecarios;
	}
	public void setHipotecarios(double hipotecarios) {
		this.hipotecarios = hipotecarios;
	}
	public double getDonativos() {
		return donativos;
	}
	public void setDonativos(double donativos) {
		this.donativos = donativos;
	}
	public double getAportacionRetiro() {
		return aportacionRetiro;
	}
	public void setAportacionRetiro(double aportacionRetiro) {
		this.aportacionRetiro = aportacionRetiro;
	}
	public double getTransporte() {
		return transporte;
	}
	public void setTransporte(double transporte) {
		this.transporte = transporte;
	}
	public double getColegiatura() {
		return colegiatura;
	}
	public void setColegiatura(double colegiatura) {
		this.colegiatura = colegiatura;
	}
}
