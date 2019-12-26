package Modelo;

public class Estudiante {

    String nombre;
    String apellido;
    int codigo;
    private Curso curso1;
    private Curso curso2;
    private Curso curso3;
    private Curso curso4;
    private Curso curso5;
    private Curso[] cursos = new Curso[5];

    public Estudiante (String nombre,String apellido,int codigo){
    }

    public boolean asignarCurso (Curso curso){
        return true;
    }

    public double calcularPromedio (){
        return 0.0;
    }

    public boolean pensumIncluyeCurso (String codigoCurso){
        return true;
    }

    public boolean estudianteEstaPrueba(){
        return true;
    }

    public boolean tieneCursosCompletos (String codigoCurso){
        return true;
    }

    public void buscarCurso (String codigoCurso){
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public Curso getCurso1() {
        return curso1;
    }

    public Curso getCurso2() {
        return curso2;
    }

    public Curso getCurso3() {
        return curso3;
    }

    public Curso getCurso4() {
        return curso4;
    }

    public Curso getCurso5() {
        return curso5;
    }
}
