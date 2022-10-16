
public  class Triangulo extends Figura2D {
    
    private float altura;
    private float base;

    public Triangulo(float altura, float base) {
    
        this.altura = altura;
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}
