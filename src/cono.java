
public class cono extends Figuras3D{
    private float height;

    public cono(String color, float baseRadius, float height) {
        super(color, baseRadius);
        this.height = height;
    }

    public float getHeight() {return height;}
    public void setHeight(float height) {this.height = height;}
    
    public Float volumen(){ return (float) ((1d / 3d) * Math.PI * Math.pow(this.getSide(), 2) * this.getHeight()); }
}
