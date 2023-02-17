package com.muhammet;

public class Islemler {

    public int toplam(int s1,int s2){
        return s1+s2;
    }

    public double bolum(double s1, double s2) throws Exception {
        if(s2 == 0){
            throw new Exception("Böyle yapma ama");
        }else {
            return s1/s2;
        }
    }

    public int bolum2(int s1,int s2){
        return s1/s2;
    }

    public int carpim(int... sayilist){
        int carpim=1;
        for(int sayi: sayilist)
            carpim *= sayi;
        return carpim;
    }

}
