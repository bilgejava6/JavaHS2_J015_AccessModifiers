package com.muhammet;

import com.muhammet.entity.Musteri;
import com.muhammet.entity.Satis;
import com.muhammet.entity.Urun;

public class Runner {
    public static void main(String[] args) {
        /**
         * Access Modifier -> Erişim belirteçleri
         * private -> class içerisine açık olup class dışından erişime kapalı olmak.
         * protected -> class içerisine ve içinde bulunduğu paket içerisine açık dışına kapalı
         * public -> tüm düzeylerden erişime açık
         * default -> temel olarak protected gibi çalışır.
         *
         */
        Musteri musteri = new Musteri();
        Satis satis = new Satis();
        Urun urun = new Urun();


    }
}