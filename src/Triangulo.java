
public  class Triangulo extends Figura2D {
    
    private float height;

    public Triangulo(float base, String color, float height) {
        super(base, color);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public Float area() { return this.getSide() * this.getHeight() * (0.5f); }
}
