import metodos.CalcVolumen;
public class Figuras3D extends Figura implements CalcVolumen{
    private String color;
    private float side;
    
    public Figuras3D(String color, float side) {
        this.color = color;
        this.side = side;
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public float getSide() {return side;}
    public void setSide(float side) {this.side = side;}

    @Override
    public String color(){return this.color;}

    @Override
    public Float volumen(){ return (float) Math.pow(this.getSide(), 3); }
}
