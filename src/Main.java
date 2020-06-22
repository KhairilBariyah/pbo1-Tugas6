public class Main {
    public static void main(String[] args) {


        Handphone objek = new Handphone();


        objek.merek = "Oppo";
        objek.jenis = "A5S";
        objek.warna = "Biru";
        objek.harga = 2000000;
        objek.spesifikasi = 32;

        //panggil method
        objek.mediakomunikasi();
        objek.selfi();
        objek.maingame();
        objek.nonton();
        objek.mendengarkanmusik();

        // penggil method overloading
        objek.tipeHandphone("Samsung");
        objek.tipeHandphone("Samsung", 3000000);
        objek.tipeHandphone("Samsung", 3000000, 64);

        //memanggil constructor
        Handphone objek1 = new Handphone();
        Handphone objek2 = new Handphone("Vivo");
        Handphone objek3 = new Handphone("Merah", 1500000);
    }


}
