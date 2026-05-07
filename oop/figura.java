/*
Juan Peña Rivera
11/02/2026

Clase abstracta Figura 
Subclases Circulo, Rectangulo y Cuadrado

*/
abstract class Figura {
    
    // Atributo nombre protegido para que las subclases puedan usarlo
    protected String nombre;

// Constructor para asignar nombre
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public abstract String toString();
    
    public abstract double area();
}

 class Circulo extends Figura {
     
     // Atributo del círculo
    private double radio;
    
     // Constructor recibe nombre y radio
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public String toString() {
        return "Circulo: " + nombre + " | Radio " + radio;
    }
}

class Rectangulo extends Figura {
    private double ancho;
    private double alto;
    
    public Rectangulo(String nombre, double ancho, double alto) {
        super(nombre);
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public double area() {
        return ancho * alto;
    }
    
    @Override
    public String toString() {
        return "Rectangulo: " + nombre + " | Ancho = " + ancho + " | Alto = " + alto;
    }
}

class Cuadrado extends Rectangulo {
    
    // Atributo del cuadrado
    private double lado;
    
     // Constructor recibe nombre y lado
    public Cuadrado(String nombre, double lado) {
        super(nombre, lado, lado);
        this.lado = lado;
    }
    @Override
    public String toString() {
        return "Cuadrado: " + nombre + " | lado " + lado;
    }
}

public class Main {
    
    public static void mostrarFigura(Figura f) {
        System.out.println(f);
        System.out.println("Area = " + f.area());
        System.out.println();
    }
    
    public static void main(String[] args) {
        Figura f1 = new Circulo("C1", 3);
        Figura f2 = new Cuadrado("Q1", 4);
        Figura f3 = new Rectangulo("R1", 5, 8);
        
        mostrarFigura(f1);
        mostrarFigura(f2);
        mostrarFigura(f3);
    }
}
