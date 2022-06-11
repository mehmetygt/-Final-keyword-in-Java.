
package com.Mehmetygt.paket1;

public class Main {
    public static void main(String[] args) {
        
     Finall finall=new Finall("ali", 25);
        System.out.println(finall.yas);
        System.out.println(finall.isim);
        System.out.println(finall.soyisim);
        // final olan isim değişmedi ama final olmayan yas değişti
        
        
     
        
      Database database=new Database();
        System.out.println(database.databaseName);
        System.out.println(database.userName);
        System.out.println(database.pasword);
        /*bu şekilde olduğu gibi static final olduğundan görbiliriz ama
        aşağıda olduğu gibi herhangi bir değişiklik yapamayız*/
        
     //   database.pasword=kkk;
        
    }
    
}
