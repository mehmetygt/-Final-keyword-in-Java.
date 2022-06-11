
package com.Mehmetygt.paket1;


public class Finall {
   public final String isim;// final özellikler ya burda tanımlanırken yada  constructer içinde değer verilir
   
   public static int yas=30;
   
   public static final String soyisim="yiğit";// hem sttsik hem final olunca constructer da bile  değeri değiştirilemez
    
    public Finall(String isim,int yas) {
    this.yas=yas;
    this.isim="ahmet";
   // this.soyisim=";"; //hata veriri
    
    //getter-setter methodları eklemek istediğimizde final özellik için oluşmaz çünkü final ile değişimi kapattık
        
    }

    public static int getYas() {
        return yas;
    }

    public static void setYas(int yas) {
        Finall.yas = yas;
    }

}