package Modelo;

public class Curso {

    private String codigoCurso;
    private String nombreDeCurso;
    private int creditos;
    private double nota;

    public Curso (String codigoCursoDeCurso, String nombreDeCurso, int creditos){
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int nuevosCreditos) {
    }

    public double getNota (){
        return 0.0;
    }

    public void setNota (double NuevaNota){
    }

    public String getNombreDeCurso() {
        return nombreDeCurso;
    }

    public String getDescripcion(){
        return "";
    }

    public boolean estaCalificado(){
        return true;
    }
}
