package calidad.practica4.Practiica4;

public class App {

	private Integer nProfesores = 4;
	private Integer tamArray = 4;
	String alumno;
		
	public Integer getnProfesores() {
		return nProfesores;
	}

	public Integer getTamArray() {
		return tamArray;
	}

	public String[] listarAlumnos() {
		String[] alumno = {"Juan", "maria", "Jaume", "Jesus"};
		System.out.println("se han listado: " + alumno.toString());
		
		return alumno;
	}
	
	public String[] listarProfesores() {
		String[] profesores = {"Jose luis", "Miguel Angel", "Raquel", "Llanes"};
		System.out.println("se han encontrado: " + profesores.toString());
		
		return profesores;
	}
	
	public boolean comprobarProfesores() {
		return nProfesores.equals(tamArray);
	}
	
}
