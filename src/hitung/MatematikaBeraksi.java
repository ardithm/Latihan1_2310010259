package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // membuat objek
        Matematika ardi = new Matematika(5,9);
        
        System.out.println("Hasil Penjumlahan: "+ardi.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+ardi.setPengurangan());
        System.out.println("Hasil Perkalian: "+ardi.setPerkalian());
        System.out.println("Hasil Pembagian: "+ardi.setPembagian());
    }
}
