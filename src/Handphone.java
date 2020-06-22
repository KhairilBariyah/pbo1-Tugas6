public class Handphone {


    //Atribute
    String merek;
    String jenis;
    String warna;
    int harga;
    int spesifikasi;




        //Behavior / method
        void mediakomunikasi() {
            System.out.println("saya itu bisa digunakan sebagai media komunikasi");
            System.out.println("misalnya telphone, sms, chatinggan atau lewat vidio");
            System.out.println("dengan bantuan aplikasi ");
            System.out.println("contohnya saat daring,,,wehehehe");
            System.out.println("Merek Handphone adalah " + merek);
            System.out.println("jenis Handphone adalah " + jenis);
            System.out.println("Warna handphone :" + warna);
            System.out.println("Harga Handphone :" + harga);
            System.out.println("Spesifikasi :" + spesifikasi);
            System.out.println();
        }

        void selfi() {
            System.out.println("saya bisa selfi, dengan menggunakan kamera depan");
            System.out.println("Keren kan..");
            System.out.println();
        }

        void maingame() {
            System.out.println("wawwww saya bisa digunakan untuk main game");
            System.out.println("kalau kalian bosen daring ambil aja handphone dan main game");
            System.out.println();
        }

        void nonton() {
            System.out.println("wawwww saya bisa digunakan untuk nonton");
            System.out.println("kalau kalian bosen lagi silahkan kalian nonton youtube atau film");
            System.out.println();
        }

        void mendengarkanmusik() {
            System.out.println("Masih Bosen atau setres");
            System.out.println("lebih baik tenangkan pikiran dengarkan musik dari pada setres...wkwkwkwk");
            System.out.println();
        }

        //method overloading//
        void tipeHandphone(String merek){
            System.out.println(merek);
        }
        void tipeHandphone (String merek, int harga){
            System.out.println(merek + harga);
        }
        void tipeHandphone (String merek, int harga, int spesifikasi){
            System.out.println(merek + harga + spesifikasi);
            System.out.println();
        }

        //constructor
        Handphone(){
            System.out.println("dringg,,,, dringgg,, dringgg");
        }
        Handphone(String merek){
            System.out.println("Merek hp saya " + merek);
        }
        Handphone(String warna, int harga){
            System.out.println("Dengan warna " + warna);
            System.out.println("dan harganya " + harga);
        }
}

