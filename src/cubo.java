
public class cubo extends Figuras3D{

    public cubo(String color, float side) {
        super(color, side);
    }
    
    public Float volumen(){return (float) Math.pow(this.getSide(), 3);}
}
