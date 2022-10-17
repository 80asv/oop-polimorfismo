public class OctaedroRegular extends Figuras3D{

    public OctaedroRegular(String color, float side) {
        super(color, side);
    }
    
    public Float volumen() { return (float) (Math.sqrt(1d / 3d) * super.volumen()); }
}
