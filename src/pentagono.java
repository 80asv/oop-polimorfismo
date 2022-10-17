
public class pentagono extends Figura2D {
    private float apothem;

    public pentagono(float side, String color, float apothem) {
        super(side, color);
        this.apothem = apothem;
    }

    public Float getApothem() {return apothem;}
    public void setApothem(Float apothem) {this.apothem = apothem;}

    @Override
    public Float area(){ return this.getSide() * 5 * this.getApothem() * (0.5f);}
}
