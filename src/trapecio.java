

public class trapecio extends Figura2D {
    private float minorBasis, majorBasis;

    public trapecio(float height, String color, float minorBasis, float majorBasis) {
        super(height, color);
        this.minorBasis = minorBasis;
        this.majorBasis = majorBasis;
    }

    public Float getMinorBasis() {
        return minorBasis;
    }

    public void setMinorBasis(Float minorBasis) {
        this.minorBasis = minorBasis;
    }

    public Float getMajorBasis() {
        return majorBasis;
    }

    public void setMajorBasis(Float majorBasis) {
        this.majorBasis = majorBasis;
    }
    
    @Override
    public Float area() { return (float) (((this.getSide() + this.getMinorBasis()) / 2d) * this.getSide()); }
}
