package PA_Penyewaanvillaa;

import static PA_Penyewaanvillaa.Lantai.maxFloor;
import static PA_Penyewaanvillaa.Lantai.minFloor;

public class Liat implements Lantai{
    private static int floor;
    private static boolean Masuk;

    public Liat(){
        Liat.floor = 1;
    }
    
    @Override
    public void masuk() {
        Masuk = true;
        System.out.println("Silahkan Masuk");
        System.out.println("Selamat menikmati villa");
    }

    @Override
    public void naik() {
            if (Masuk = true){
            if (Liat.floor == maxFloor) {
                System.out.println("Tidak ada lantai selanjutnya");
            } 
            else {
                Liat.floor += 1;
                System.out.println("Selamat menikmati lantai ke-" + this.getfloor() + " dari villa kami");
            }
        }
        else{
            System.out.println("Masuk dulu dong");
        }
    }

    @Override
    public void turun() {
        if (Masuk = true){
            if (Liat.floor == minFloor) {
                System.out.println("Tidak ada lantai bawah tanah");
            } 
            else {
                Liat.floor -= 1;
                System.out.println("Selamat menikmati lantai ke-" + this.getfloor() + " dari villa kami");
            }
        }
        else {
            System.out.println("Masuk dulu dong");
        }
    }

    @Override
    public void keluar() {
        Masuk = false;
        System.out.println("Semoga tertarik");
    }
    
    public int getfloor(){
        return Liat.floor;
    }
    
}
