package PA_Penyewaanvillaa;

public class Calon {
    private final Lantai liat;
    
    public Calon(Lantai liat) {
        this.liat = liat;
    }
    
    void in(){
        this.liat.masuk();
    }
    
    void out(){
        this.liat.keluar();
    }
    
    void up(){
        this.liat.naik();
    }
    
    void down(){
        this.liat.turun();
    }
}
