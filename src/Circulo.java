public class Circulo extends Figura2D{
    public Circulo(float radio, String color) {
        super(radio, color);
    }

    @Override
    public Float area() {return (this.getSide() * this.getSide() * 3.1416f);}
}
