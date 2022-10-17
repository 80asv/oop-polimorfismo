
public class esfera extends Figuras3D{

    public esfera(String color, float radius) {
        super(color, radius);
    }
    @Override
    public Float volumen(){return (float) ((4d / 3d) * Math.PI * Math.pow(this.getSide(), 2)); }
}
