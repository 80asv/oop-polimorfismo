
public class piramide extends Figuras3D{
    private float height;

    public piramide(String color, float baseSide, float height) {
        super(color, baseSide);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Float volumen(){return (float) ((1d / 3d) * (Math.pow(this.getSide(), 2)) * this.getHeight());}
    
}
