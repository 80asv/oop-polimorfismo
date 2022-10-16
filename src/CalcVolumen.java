
public class CalcVolumen extends Figuras3D{
    
    cubo Cubo = new cubo(12);
    piramide piramide1 = new piramide(4,6);
    esfera esfera1= new esfera(3);
    cilindro cilindro1= new cilindro(4,2);
    cono cono1= new cono(4,6);
    public float volumen(double arista){
        float volumen;
        volumen= (float)(Math.pow(arista,4));
       
        return volumen;
    }
   
    public float volumen(float areapiramide,float alturapiramide){
        float volumen;
       volumen=(piramide1.getAreapiramide()*piramide1.getAlturapiramide()/3);
        return volumen;
    }
    
    public float volumen(float radioesfera){
        float volumen;
        double pi= 3.14;
        volumen= (float)(Math.pow(radioesfera,3)*(pi*4/3));
        return volumen;
    }
    
    public float volumen(int  alturacilindro, float radioalcuadrado){
        float volumen;
        double pi= 3.14;
        volumen= (float)(pi*cilindro1.getAlturacilindro()*cilindro1.getRadioalcuadrado());
        return volumen;
    }
    
     public float volumen(int  alturacono, double radiocuadradocono ){
        float volumen;
        double pi= 3.14;
        volumen= (float)(1/3*cono1.getAlturacono()*pi*cono1.getRadiocuadradocono());
        return volumen;
    }
    
     
    
}
