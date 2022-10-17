
public class rombo extends Figura2D{
    private float angle;

    public rombo(float side, String color, float angle) {
        super(side, color);
        this.angle = angle;
    }

    public float getAngle() {return angle;}
    public void setAngle(float angle) {this.angle = angle;}

    @Override
    public Float area() { return (float) (this.getSide() * this.getSide() * Math.sin(this.getAngle())); }

}