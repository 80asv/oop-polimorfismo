

public class trapecio extends Figura2D {
    
   private int ladomay,ladomen,altu; 

    public trapecio(int ladomay, int ladomen, int altu) {
        this.ladomay = ladomay;
        this.ladomen = ladomen;
        this.altu = altu;
    }

    public int getLadomay() {
        return ladomay;
    }

    public void setLadomay(int ladomay) {
        this.ladomay = ladomay;
    }

    public int getLadomen() {
        return ladomen;
    }

    public void setLadomen(int ladomen) {
        this.ladomen = ladomen;
    }

    public int getAltu() {
        return altu;
    }

    public void setAltu(int altu) {
        this.altu = altu;
    }
    
    
}
