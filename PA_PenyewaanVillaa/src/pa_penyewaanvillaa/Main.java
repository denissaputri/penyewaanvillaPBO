package PA_Penyewaanvillaa;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {

    public static void main(String[] args) throws IOException {
        
        //untuk input
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        
        //untuk menyimpan data baru
        ArrayList<VillaQuella> data = new ArrayList<>();
        
        //membuat objek
        Admin adm   = new Admin  ("admin","123");
        
        //interface
        Liat survei = new Liat();

        Calon customer = new Calon(survei);

        while(true){
            try{
                System.out.println("|==========================================|");
                System.out.println("|          Penyewaan Villa Quella          |");
                System.out.println("|==========================================|");
                System.out.println("| Menu Login                               |");
                System.out.println("|[1]. admin                                |");
                System.out.println("|[2]. customer                             |");
                System.out.println("|[3]. keluar                               |");
                System.out.println("|==========================================|");
                System.out.print("Pilih >>  ");
                int pilihLogin = Integer.parseInt(input.readLine());
                System.out.println("\n\n");

                if (pilihLogin == 1){
                    String useradm, passadm;

                    System.out.println("");
                    System.out.println("|========================|");
                    System.out.println("|          Admin         |");
                    System.out.println("|========================|");
                    System.out.print("Enter username : ");//username:admin
                    useradm = input.readLine();
                    System.out.print("Enter password : ");//password:123
                    passadm = input.readLine();
                    System.out.println("|========================|");

                    if (useradm.isEmpty()){
                        System.out.println("username & password tidak boleh kosong !");
                    }

                    else if(passadm.isEmpty()){
                        System.out.println("username & password tidak boleh kosong !"); 
                    }                

                    else if(useradm.equals(adm.user) && passadm.equals(adm.pass)){
                        System.out.println("Login Successful");
                        System.out.println("\n\n");

                        int pilihMenu = 0;

                        do{
                            try{
                                System.out.println("|==========================================|");
                                System.out.println("|          Penyewaan Villa Quella          |");
                                System.out.println("|==========================================|");
                                System.out.println("| Menu :                                   |");
                                System.out.println("|[1]. Tambahkan Data                       |");
                                System.out.println("|[2]. Tampilkan Data                       |");
                                System.out.println("|[3]. Ubah Data                            |");
                                System.out.println("|[4]. Hapus Data                           |");
                                System.out.println("|[5]. keluar                               |");
                                System.out.println("|==========================================|");
                                System.out.print("Pilih >>  ");
                                pilihMenu = Integer.parseInt(input.readLine());
                                System.out.println("\n\n");

                                switch (pilihMenu){

                                    case 1:

                                        JFrame frame = new JFrame();
                                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                        Vector<String> rowOne = new Vector<>();
                                        rowOne.addElement("A01");
                                        rowOne.addElement("Villa Shopia");
                                        rowOne.addElement("Komplek A No.10 Puncak, Bogor");

                                        Vector<String> rowTwo = new Vector<>();
                                        rowTwo.addElement("A02");
                                        rowTwo.addElement("Villa Cendana");
                                        rowTwo.addElement("Komplek B No.11 Puncak, Bogor");

                                        Vector<String> rowThree = new Vector<>();
                                        rowThree.addElement("A03");
                                        rowThree.addElement("Villa Nugraha");
                                        rowThree.addElement("Komplek C No.14 Puncak, Bogor");

                                        Vector<String> rowFour = new Vector<>();
                                        rowFour.addElement("A04");
                                        rowFour.addElement("Villa Citra");
                                        rowFour.addElement("Komplek D No.12 Puncak, Bogor");

                                        Vector<String> rowFive = new Vector<>();
                                        rowFive.addElement("A05");
                                        rowFive.addElement("Villa Darus");
                                        rowFive.addElement("Komplek E No.09 Puncak, Bogor");

                                        Vector<Vector> rowData = new Vector<>();
                                        rowData.addElement(rowOne);
                                        rowData.addElement(rowTwo);
                                        rowData.addElement(rowThree);
                                        rowData.addElement(rowFour);
                                        rowData.addElement(rowFive);

                                        Vector<String> columnNames = new Vector<>();
                                        columnNames.addElement("Kode_villa");
                                        columnNames.addElement("Nama_villa");
                                        columnNames.addElement("Alamat");
                                        JTable table = new JTable(rowData, columnNames);

                                        JScrollPane scrollPane = new JScrollPane(table);
                                        frame.add(scrollPane, BorderLayout.CENTER);
                                        frame.setSize(700, 350);
                                        frame.setVisible(true);

                                        String fileNameVilla = "C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\villa.txt" ;

                                        try {
                                            // membaca file
                                            File myFile = new File(fileNameVilla);
                                            Scanner fileReader = new Scanner(myFile);

                                            // cetak isi file
                                            while(fileReader.hasNextLine()){
                                                String data2 = fileReader.nextLine();
                                                System.out.println(data2);
                                            }
                                        } 

                                        catch (FileNotFoundException e) {
                                            System.out.println("Terjadi Kesalahan: " + e.getMessage());
                                        }

                                        try{
                                            System.out.println("|===============================|");
                                            System.out.println("|         Tambahkan data        |");
                                            System.out.println("|===============================|");
                                            System.out.print("Masukkan nama Pemesan   : ");
                                            String namaPemesan = input.readLine().toLowerCase();
                                            System.out.print("Masukkan NIK pemesan    : ");
                                            int NIK = Integer.parseInt(input.readLine());
                                            System.out.print("Masukkan tgl pemesanan  : ");
                                            String tglPesan = input.readLine();
                                            System.out.print("Masukkan kode villa     : ");
                                            String kodeVilla = input.readLine();
                                            System.out.print("Lama Penyewaan (hari)   : ");
                                            int hari = Integer.parseInt(input.readLine());

                                            data.add(new VillaQuella(hari, kodeVilla, namaPemesan, NIK, tglPesan));
                                        }
                                        catch(NumberFormatException e){
                                            System.out.println(" ");
                                            System.out.println(e);
                                            System.out.println(" ** Masukkan data sesuai tipe data ** ");
                                        }

                                        System.out.println("|===============================|");
                                        System.out.println("|   Data Berhasil Ditambahkan   |");
                                        System.out.println("|===============================|");
                                        System.out.println("\n\n");
                                        break;

                                    case 2:
                                        System.out.println("|===============================|");
                                        System.out.println("|         Tampilkan data        |");
                                        System.out.println("|===============================|");

                                        if(data.isEmpty()){
                                            System.out.println(" Data kosong !");
                                        } 

                                        else {
                                            for (int i=0; i < data.size(); i += 1){
                                                System.out.println("Data ke-" + (i + 1));
                                                data.get(i).display();

                                                try {
                                                    FileReader baca1 = new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\detail1.txt");
                                                    BufferedReader br1 = new BufferedReader(baca1);

                                                    FileReader baca2 = new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\detail2.txt");
                                                    BufferedReader br2 = new BufferedReader(baca2);

                                                    FileReader baca3 = new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\detail3.txt");
                                                    BufferedReader br3 = new BufferedReader(baca3);

                                                    FileReader baca4 = new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\detail4.txt");
                                                    BufferedReader br4 = new BufferedReader(baca4);

                                                    FileReader baca5 = new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\detail5.txt");
                                                    BufferedReader br5 = new BufferedReader(baca5);

                                                    String baris;
                                                    System.out.print("Kode Villa     : ");
                                                    String kv = input.readLine();


                                                    if("A01".equals(kv)){
                                                        while((baris = br1.readLine())!= null){
                                                            System.out.println(baris);                                                            
                                                        }                                                        
                                                    }

                                                    else if("A02".equals(kv)){
                                                        while((baris = br2.readLine())!= null){
                                                            System.out.println(baris);
                                                        }
                                                    }

                                                    else if("A03".equals(kv)){
                                                        while((baris = br3.readLine())!= null){
                                                            System.out.println(baris);
                                                        }
                                                    }

                                                    else if("A04".equals(kv)){
                                                        while((baris = br4.readLine())!= null){
                                                            System.out.println(baris);
                                                        }
                                                    }

                                                    else if("A05".equals(kv)){
                                                        while((baris = br5.readLine())!= null){
                                                            System.out.println(baris);
                                                        }
                                                    }

                                                    else{
                                                        System.out.println("Kode Villa Tidak ditemukan");
                                                    }
                                                    System.out.println("\n\n");  
                                                } 

                                                catch (FileNotFoundException e) {
                                                    System.out.println("File Tidak Ditemukan : " + e.getMessage());
                                                }
                                            }
                                        }
                                        break;

                                    case 3:
                                        System.out.println("|====================|");
                                        System.out.println("|     Ubah data      |");
                                        System.out.println("|====================|"); 
                                        System.out.print("masukkan nama Pemesan   : ");
                                        String namaP = input.readLine().toLowerCase();
                                        for (VillaQuella vq : data) {
                                            if (vq.getNamaPemesan().equals(namaP)) {
                                                System.out.println(" ");
                                                System.out.println("|      data baru     |");
                                                System.out.println(" ");
                                                try{
                                                    System.out.print("Masukkan tgl pemesanan: ");
                                                    vq.setTglPesan(input.readLine());
                                                    System.out.print("Masukkan kode villa   : ");
                                                    vq.setKodeVilla(input.readLine());
                                                    System.out.print("Lama Penyewaan        : ");
                                                    vq.setHari(Integer.parseInt(input.readLine()));
                                                }
                                                catch(NumberFormatException e){
                                                    System.out.println(" ");
                                                    System.out.println(e);
                                                    System.out.println(" ** Masukkan data sesuai tipe data ** ");
                                                }

                                                System.out.println("|========================|");
                                                System.out.println("|  Data Berhasil Diubah  |");
                                                System.out.println("|========================|");
                                                System.out.println("\n\n");
                                            }
                                        }
                                        break;

                                    case 4:
                                        System.out.println("|======================|");
                                        System.out.println("|    Menghapus data    |");
                                        System.out.println("|======================|");
                                        System.out.print("Masukkan nama pemesan : ");
                                        String namaCustom = input.readLine().toLowerCase();
                                        for (int i = 0; i < data.size(); i++) {
                                            if (data.get(i).getNamaPemesan().equals(namaCustom)){
                                                data.remove(i);

                                                System.out.println("|=========================|");
                                                System.out.println("|  Data Berhasil Dihapus  |");
                                                System.out.println("|=========================|");
                                                System.out.println("\n\n");
                                                break;
                                            }
                                        }
                                        break;

                                    case 5:
                                        System.out.println(" ");
                                        System.out.println("|   Kembali Ke Menu Utama   |");
                                        System.out.println("\n\n");
                                        break;

                                    default:
                                        System.out.println("");
                                        System.out.println("|    Maaf pilihan tidak tersedia  |");
                                        System.out.println("");
                                        System.out.println("\n\n");
                                        break;
                                }
                            }
                            catch(NumberFormatException e){
                                System.out.println(" ");
                                System.out.println(e);
                                System.out.println(" ** Masukkan data integer ** ");
                            }
                        }
                        while (pilihMenu != 5);          
                    }

                    else{
                        System.out.println("Login Failed");
                        System.out.println("\n\n");
                    }
                }

                else if (pilihLogin == 2){

                    int pilihCustom = 0;

                    do{
                        try{
                            System.out.println("");
                            System.out.println("|==========================================|");
                            System.out.println("|                Customer                  |");
                            System.out.println("|          Penyewaan Villa Quella          |");
                            System.out.println("|==========================================|");
                            System.out.println("|[1]. Tambahkan Data                       |");
                            System.out.println("|[2]. Tampilkan Data                       |");
                            System.out.println("|[3]. Survei Villa                         |");
                            System.out.println("|[4]. keluar                               |");
                            System.out.println("|==========================================|");
                            System.out.print("Pilih >>  ");
                            pilihCustom = Integer.parseInt(input.readLine());
                            System.out.println("\n\n");

                            OUTER:
                            switch (pilihCustom) {
                                case 1:

                                        JFrame frame = new JFrame();
                                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                                   Vector<String> rowOne = new Vector<>();
                                        rowOne.addElement("A01");
                                        rowOne.addElement("Villa Shopia");
                                        rowOne.addElement("Komplek A No.10 Puncak, Bogor");

                                        Vector<String> rowTwo = new Vector<>();
                                        rowTwo.addElement("A02");
                                        rowTwo.addElement("Villa Cendana");
                                        rowTwo.addElement("Komplek B No.11 Puncak, Bogor");

                                        Vector<String> rowThree = new Vector<>();
                                        rowThree.addElement("A03");
                                        rowThree.addElement("Villa Nugraha");
                                        rowThree.addElement("Komplek C No.14 Puncak, Bogor");

                                        Vector<String> rowFour = new Vector<>();
                                        rowFour.addElement("A04");
                                        rowFour.addElement("Villa Citra");
                                        rowFour.addElement("Komplek D No.12 Puncak, Bogor");

                                        Vector<String> rowFive = new Vector<>();
                                        rowFive.addElement("A05");
                                        rowFive.addElement("Villa Darus");
                                        rowFive.addElement("Komplek E No.09 Puncak, Bogor");

                                        Vector<Vector> rowData = new Vector<>();
                                        rowData.addElement(rowOne);
                                        rowData.addElement(rowTwo);
                                        rowData.addElement(rowThree);
                                        rowData.addElement(rowFour);
                                        rowData.addElement(rowFive);

                                        Vector<String> columnNames = new Vector<>();
                                        columnNames.addElement("Kode_villa");
                                        columnNames.addElement("Nama_villa");
                                        columnNames.addElement("Alamat");
                                        JTable table = new JTable(rowData, columnNames);

                                        JScrollPane scrollPane = new JScrollPane(table);
                                        frame.add(scrollPane, BorderLayout.CENTER);
                                        frame.setSize(700, 350);
                                        frame.setVisible(true);

                                    String fileName = "C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\villa.txt" ;

                                    try {
                                        // membaca file
                                        File myFile = new File(fileName);
                                        Scanner fileReader = new Scanner(myFile);

                                        // cetak isi file
                                        while(fileReader.hasNextLine()){
                                            String data2 = fileReader.nextLine();
                                            System.out.println(data2);
                                        }
                                    }

                                    catch (FileNotFoundException e) {
                                        System.out.println("Terjadi Kesalahan: " + e.getMessage());
                                    }

                                    try{
                                        System.out.println("|===============================|");
                                        System.out.println("|            Input data         |");
                                        System.out.println("|===============================|");
                                        System.out.print("Masukkan nama           : ");
                                        String namaPemesan = input.readLine().toLowerCase();
                                        System.out.print("Masukkan NIK            : ");
                                        int NIK = Integer.parseInt(input.readLine());
                                        System.out.print("Masukkan tgl pemesanan  : ");
                                        String tglPesan = input.readLine();
                                        System.out.print("Masukkan kode villa     : ");
                                        String kodeVilla = input.readLine();
                                        System.out.print("Lama Penyewaan          : ");
                                        int hari = Integer.parseInt(input.readLine());
                                        data.add(new VillaQuella(hari, kodeVilla, namaPemesan, NIK, tglPesan));
                                    }
                                    catch(NumberFormatException e){
                                        System.out.println(" ");
                                        System.out.println(e);
                                        System.out.println(" ** Masukkan data sesuai tipe data ** ");
                                    }

                                    System.out.println("|===============================|");
                                    System.out.println("|   Data Berhasil Ditambahkan   |");
                                    System.out.println("|===============================|");
                                    System.out.println("\n\n");
                                    break;

                                case 2:
                                    System.out.println("|===============================|");
                                    System.out.println("|         Tampilkan data        |");
                                    System.out.println("|===============================|");
                                    System.out.print("Masukkan Nama pemesan : ");
                                    String name = input.readLine().toLowerCase();
                                    if(data.isEmpty()){
                                        System.out.println(" Maaf data kosong !");
                                    }

                                    else {
                                        for (int i=0; i < data.size(); i++){
                                            if (data.get(i).getNamaPemesan().equals(name)) {
                                                data.get(i).display();
                                                try {
                                                    FileReader baca1 = new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\detail1.txt");
                                                    BufferedReader br1 = new BufferedReader(baca1);

                                                    FileReader baca2 = new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\detail2.txt");
                                                    BufferedReader br2 = new BufferedReader(baca2);

                                                    FileReader baca3 = new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\detail3.txt");
                                                    BufferedReader br3 = new BufferedReader(baca3);

                                                    FileReader baca4 = new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\detail4.txt");
                                                    BufferedReader br4 = new BufferedReader(baca4);

                                                    FileReader baca5 = new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\PA_PenyewaanVillaa\\src\\pa_penyewaanvillaa\\detail5.txt");
                                                    BufferedReader br5 = new BufferedReader(baca5);

                                                    String baris;
                                                    System.out.print("Kode Villa     : ");
                                                    String kv = input.readLine();


                                                    if("A01".equals(kv)){
                                                        while((baris = br1.readLine())!= null){
                                                            System.out.println(baris);
                                                        }                                                        
                                                    }

                                                    else if("A02".equals(kv)){
                                                        while((baris = br2.readLine())!= null){
                                                            System.out.println(baris);
                                                        }
                                                    }

                                                    else if("A03".equals(kv)){
                                                        while((baris = br3.readLine())!= null){
                                                            System.out.println(baris);
                                                        }
                                                    }

                                                    else if("A04".equals(kv)){
                                                        while((baris = br4.readLine())!= null){
                                                            System.out.println(baris);
                                                        }
                                                    }

                                                    else if("A05".equals(kv)){
                                                        while((baris = br5.readLine())!= null){
                                                            System.out.println(baris);
                                                        }
                                                    }

                                                    else{
                                                        System.out.println("Kode Villa Tidak ditemukan");
                                                    }
                                                    System.out.println("\n\n");
                                                }

                                                catch (FileNotFoundException e) {
                                                    System.out.println("File Tidak Ditemukan : " + e.getMessage());
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    break;

                                case 3:
                                    int pencet = 0;
                                        try{
                                            System.out.println("--- I N T E R F A C E ---");
                                            System.out.println("[1] Masuk");
                                            System.out.println("[2] Naik");
                                            System.out.println("[3] Turun");
                                            System.out.println("[4] Keluar");
                                            System.out.println("[0] Kembali ke Menu Customer");
                                            System.out.println("--------------------------");
                                            System.out.print("Pilih : ");
                                            pencet = Integer.parseInt(input.readLine());
                                            System.out.println("\n\n");
                                        }
                                        catch(NumberFormatException e){
                                            System.out.println(" ");
                                            System.out.println(e);
                                            System.out.println(" ** Masukkan data integer ** ");
                                        }

                                        switch (pencet) {
                                            case 1:
                                                customer.in();
                                                break;
                                            case 2:
                                                customer.up();
                                                break;
                                            case 3:
                                                customer.down();
                                                break;
                                            case 4:
                                                customer.out();
                                                break;
                                            case 0:
                                                break OUTER;
                                            default:
                                                System.out.println("Masukkan angka dengan benar");
                                                break;
                                        }
                                    break;

                                case 4:
                                    System.out.println("|   Kembali Ke Menu Utama   |");
                                    System.out.println("\n\n");
                                    break;

                                default:
                                    System.out.println("");
                                    System.out.println("|    Maaf pilihan tidak tersedia  |");
                                    System.out.println("");
                                    break;
                            }
                        }

                        catch(NumberFormatException e){
                            System.out.println(" ");
                            System.out.println(e);
                            System.out.println(" ** Masukkan data integer ** ");
                        }
                    }
                    while (pilihCustom !=4 );
                }

                else if(pilihLogin == 3){
                    System.out.println("|==========================================|");
                    System.out.println("|   Terimakasih telah menggunakan program  |");
                    System.out.println("|==========================================|");
                    System.exit(0);
                }

                else{
                    System.out.println("Masukkan pilihan dengan benar!");
                }
        }
        catch(NumberFormatException e){
            System.out.println(" ");
            System.out.println(e);
            System.out.println(" ** Masukkan data integer ** "); 
        }
    }
    }
}