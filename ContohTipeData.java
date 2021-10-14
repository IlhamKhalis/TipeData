public class ContohTipeData{
    public static void main(String args[]){
        char goldar = 'A';
        byte jarak = (byte) 130;
        short jumlahPenduduk = 1025;
        float suhu = 60.50F;
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angka = 0x10;

        System.out.println("Golongan Darah                      : " + (byte) goldar);
        System.out.println("Jarak                               : " + jarak);
        System.out.println("Jumlah Penduduk Dalam Satu Dusun    : " + jumlahPenduduk);
        System.out.println("Suhu                                : " + suhu);
        System.out.println("Berat                               : " + (float)berat);
        System.out.println("Saldo                               : " + saldo);
        System.out.println("Angka Desimal                       : " + angka);
    }
}