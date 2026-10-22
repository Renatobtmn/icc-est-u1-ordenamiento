package models;

//una clase estudiante
// con dos atributos
//cpn constructor lleno
// con getters y setters

public class Estudiante {
    private String nombre;
    private double nota ;
    
    // constructor lleno
    public Estudiante(String name,double nota){
        this.nombre=name;
        this.nota=nota;

    

    }

    // constructor vacio
    public Estudiante(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", nota=" + nota + "]";
    }
    

}

