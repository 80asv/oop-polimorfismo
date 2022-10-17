
public class cilindro extends Figuras3D{ // ni si quiera estaba extendiendo de Figura3D
    
    private float height;

    public cilindro(String color, float base, float height) {
        super(color, base);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public Float volumen(){ return (float) (Math.PI * Math.pow(this.getSide(), 2) * this.getHeight());}
}
