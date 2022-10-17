import java.util.Scanner;
public class mainClass {
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        // CalcArea Circulo = new CalcArea();
        // CalcArea Triangulo = new CalcArea();
        // CalcArea Cuadrado = new CalcArea();
        // CalcArea rombo = new CalcArea();
        // CalcArea pentagono= new CalcArea();
        // CalcArea trapecio= new CalcArea();
        
        //* Figuras 2d */
        Circulo circulo1 = new Circulo(56, "red");
        Triangulo triangulo1 = new Triangulo(56, "green", 102);
        Cuadrado cuadrado1 = new Cuadrado(12, "blue");
        rombo rombo1 = new rombo(3, "yellow", 45);
        pentagono pentagono1 = new pentagono(2, "grey", 2);
        trapecio trapecio1 = new trapecio(2, "green", 4, 2);

        // CalcVolumen cubo= new CalcVolumen();
        // CalcVolumen cono= new CalcVolumen();
        // CalcVolumen esfera= new CalcVolumen();
        // CalcVolumen piramide= new CalcVolumen();
        // CalcVolumen cilindro= new CalcVolumen();

        //* Figuras 3d */
        OctaedroRegular or1 = new OctaedroRegular("rojo", 56);
        cilindro cilindro1 = new cilindro("rojo", 2, 10);
        cono cono1 = new cono("verde", 20, 45);
        cubo cubo1 = new cubo("amarillo", 34);
        esfera esfera1 = new esfera("gris", 23);
        piramide piramide1 = new piramide("marron", 34, 22);
        
        System.out.println("1.Figuras 2D\n2.Figuras3D " );
        int p = lector.nextInt();
        
        switch(p){
            case 1:
                System.out.println("1.Área Círculo\n2.Área Triángulo \n3.Área Cuadrado \n4.Area Rombo  \n5.Area Pentagono \n6.Area Trapecio" );
                int op = lector.nextInt();
        
                switch(op){
                    case 1:
                        System.out.println("El resultado del area del circulo es: "+circulo1.area()+ " y es de color " + circulo1.getColor());
                        break;
                    case 2:
                        System.out.println("El area del triangulo es: "+triangulo1.area());
                                
                        break;
                    case 3:
                        System.out.println("El resultado del area del cuadrado es: "+cuadrado1.area());
                        break;

                    case 4:
                        System.out.println("El resultado del area del rombo es: "+rombo1.area());
                        break;
                        
                    case 5:
                        System.out.println("El resultado del area del pentagono es: "+pentagono1.area());
                        break;
                        
                    case 6:
                        System.out.println("El resultado del area del trapecio es: "+trapecio1.area());
                        break;
                        
                        
                    default:
                        System.out.println("¡ERROR!");
                        break;
                }
                break;
        
            case 2: 
                System.out.println("1.Volumen Cubo\n2.Volumen Piramide \n3.Volumen Esfera \n4.Volumen Cilindro  \n5.Volumen Cono  \n6.Octaedro Regular" );
                int opcion2 = lector.nextInt();
                switch(opcion2){
                    case 1:
                        System.out.println("El resultado del volumen del cubo es: "+cubo1.volumen());
                        break;
                    case 2:
                        System.out.println("El resultado del volumen de la Piramide es : "+piramide1.volumen());
                                
                        break;
                    case 3:
                        System.out.println("El resultado del volumen de la Esfera es : "+esfera1.volumen());
                        break;

                    case 4:
                        System.out.println("El resultado del volumen del Cilindro es: : "+cilindro1.volumen());
                        break;
                        
                    case 5:
                        System.out.println("El resultado del volumen del Cono es: "+cono1.volumen());
                        break;

                    case 6:
                        System.out.println("El resultado del volumen del Octaedro regular es: "+or1.volumen());
                        break;
                    
                    default:
                        System.out.println("¡ERROR!");
                        break;  
                    
                }
                break;
        }
    }
}
