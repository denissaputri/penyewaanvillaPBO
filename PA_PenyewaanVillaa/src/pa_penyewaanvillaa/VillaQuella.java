package PA_Penyewaanvillaa;

public class VillaQuella extends Villa {
    
    private int hari;

    public VillaQuella(int hari, String kodeVilla,  String namaPemesan, int NIK, String tglPesan) {
        super(kodeVilla,  namaPemesan, NIK, tglPesan);
        this.hari = hari;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    
    public void hargasewa(){
        System.out.println("Harga Sewa Villa /hari : Rp." + super.harga );
    }
    
    public void hargasewa(int hari){
        System.out.println("Total Harga sewa anda  : Rp." + this.hari*super.harga);
    }
    
    @Override
    void display(){
        System.out.println("Call Center    : " + super.noHP);
        System.out.println("Nama Pemesan   : " + this.namaPemesan);
        System.out.println("Tanggal Pesan  : " + this.tglPesan);
        System.out.println("Lama Pemesanan : " + this.hari + " hari");
        hargasewa();
        hargasewa(hari);
    }
}

    
