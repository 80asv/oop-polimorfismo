import metodos.CalcArea;
public class Figura2D extends Figura implements CalcArea {

     private float side;
     private String color;

     public Figura2D(float side, String color) {
          this.side = side;
          this.color = color;
     }

     public float getSide() {
          return side;
     }

     public void setSide(float side) {
          this.side = side;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     @Override
     public String color(){return this.color;}
     
     @Override
     public Float area(){ return this.side * this.side; }
}


