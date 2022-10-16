
import java.util.Scanner;
public abstract class Figura {
    
    public static void main(String []args){

        CalcArea Circulo = new CalcArea();
        CalcArea Triangulo = new CalcArea();
        CalcArea Cuadrado = new CalcArea();
        CalcArea rombo = new CalcArea();
        CalcArea pentagono= new CalcArea();
        CalcArea trapecio= new CalcArea();
        
        CalcVolumen cubo= new CalcVolumen();
        CalcVolumen cono= new CalcVolumen();
        CalcVolumen esfera= new CalcVolumen();
        CalcVolumen piramide= new CalcVolumen();
        CalcVolumen cilindro= new CalcVolumen();
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("1.Figuras 2D\n2.Figuras3D " );
        int p = lector.nextInt();
        
        switch(p){
        
            case 1:
        System.out.println("1.Área Círculo\n2.Área Triángulo \n3.Área Cuadrado \n4.Area Rombo  \n5.Area Pentagono \n6.Area Trapecio" );
        int op = lector.nextInt();
        
        
        switch(op){
            case 1:
                System.out.println("El resultado del area del circulo es: "+Circulo.area(4));
                break;
            case 2:
                System.out.println("El area del triangulo es: "+Triangulo.area(12, 12));
                        
                break;
            case 3:
                System.out.println("El resultado del area del cuadrado es: "+Cuadrado.area(3, 3));
                break;

            case 4:
                System.out.println("El resultado del area del rombo es: "+rombo.area(3, 3));
                break;
                
             case 5:
                System.out.println("El resultado del area del pentagono es: "+pentagono.area(2, 3));
                break;
                
               case 6:
                System.out.println("El resultado del area del trapecio es: "+trapecio.area(2, 4, 2));
                break;
                
                
            default:
                System.out.println("¡ERROR!");
                break;
    
    }
        break;
        
            case 2: 
                System.out.println("1.Volumen Cubo\n2.Volumen Piramide \n3.Volumen Esfera \n4.Volumen Cilindro  \n5.Volumen Cono" );
        int opcion2 = lector.nextInt();
              switch(opcion2){
            case 1:
                System.out.println("El resultado del volumen del cubo es: "+cubo.volumen(4));
                break;
            case 2:
                System.out.println("El resultado del volumen de la Piramide es : "+piramide.volumen(5,10));
                        
                break;
            case 3:
                System.out.println("El resultado del volumen de la Esfera es : "+esfera.volumen(5));
                break;

            case 4:
                System.out.println("El resultado del volumen del Cilindro es: : "+cilindro.volumen(10, 20));
                break;
                
             case 5:
                System.out.println("El resultado del volumen del Cono: "+cono.volumen(10, 5));
                break;
              
            default:
                System.out.println("¡ERROR!");
                break;  
                
        }
        }
    }}
    
