package com.muhammet.entity;

public class Deneme {
    public static void main(String[] args) {
        Musteri musteri = new Musteri();
        Urun urun = new Urun();


        Satis satis = new Satis();

        musteri.ad = "Muhammet";

        urun.ad = "Peynir";
        urun.fiyat = 150;
        // 15.01.2024
        satis.calisanAdi = "Demet";
        satis.musteri = musteri;
        satis.urun = urun;
        satis.satisAdedi= 1;
        satis.fiyat = 150;

        System.out.println("musteri .........: " + musteri.ad);
        System.out.println("urun ............: " + urun.ad);
        System.out.println("satış tarihi.....: 15.01.2024");
        double odenen = satis.fiyat * satis.satisAdedi;
        System.out.println("Toplam ödenen....: "+ odenen);

        // 16.01.2024 zam gelir
        urun.fiyat = 210; // güncelleme

        // 30.01.2024
        System.out.println("musteri .........: " + musteri.ad);
        System.out.println("urun ............: " + urun.ad);
        System.out.println("satış tarihi.....: 15.01.2024");
        odenen = satis.fiyat * satis.satisAdedi;
        System.out.println("Toplam ödenen....: "+ odenen);

        urun.fiyat = 350;

        // 30.03.2024
        System.out.println("musteri .........: " + musteri.ad);
        System.out.println("urun ............: " + urun.ad);
        System.out.println("satış tarihi.....: 15.01.2024");
        odenen = satis.fiyat * satis.satisAdedi;
        System.out.println("Toplam ödenen....: "+ odenen);

        /**
         * 1-15 -> 150
         * 3, 9, 1, 8,5 => 4 adet
         * 16-31 -> 210
         * 5,4,12,3,8,5 => 6 adet
         * --------------------------
         * 1-15 toplam kazanılan=> (150*4)*16 => 9.600
         * 16-31 toplam kazanılan=> (210*6)*15 => 18.900
         * Toplam kazanılan => 28.500
         * --------------
         * (5 adet günlük * 210) * 31 => 32.550
         *
         *
         */
    }
}
