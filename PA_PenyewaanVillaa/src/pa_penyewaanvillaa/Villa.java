package PA_Penyewaanvillaa;

public abstract class Villa {
    protected String kodeVilla, namaPemesan, tglPesan;
    protected int NIK;
    protected final String noHP = "0821-3322-4477";
    protected final int harga = 500000;

    public Villa(String kodeVilla, String namaPemesan, int NIK, String tglPesan) {
        this.kodeVilla = kodeVilla;
//        this.alamat = alamat;
        this.namaPemesan = namaPemesan;
        this.NIK = NIK;
        this.tglPesan = tglPesan;
    }

    public String getKodeVilla() {
        return kodeVilla;
    }

    public void setKodeVilla(String kodeVilla) {
        this.kodeVilla = kodeVilla;
    }

//    public String getAlamat() {
//        return alamat;
//    }
//
//    public void setAlamat(String alamat) {
//        this.alamat = alamat;
//    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }
    
     public int getNIK() {
        return NIK;
    }

    public void setNIK(int NIK) {
        this.NIK = NIK;
    }
    
    public String getTglPesan() {
        return tglPesan;
    }

    public void setTglPesan(String tglPesan) {
        this.tglPesan = tglPesan;
    }
    
    void display(){}
}

