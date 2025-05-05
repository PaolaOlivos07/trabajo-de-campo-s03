package Caso2;


public class CitaMedica {
	
	private String paciente;
	private String doctor;
	private String hora;
	
	
	public CitaMedica() {
		
	}
	
    public CitaMedica(String paciente, String doctor, String hora) {
        super();
		this.paciente = paciente;
		this.doctor = doctor;
		this.hora = hora;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
    
	public void mostrar(){
	    System.out.println("Paciente: "+ paciente+", Doctor: "+doctor+", Hora: "+hora);

    }
	  

	

}
