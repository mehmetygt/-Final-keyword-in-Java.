
package com.Mehmetygt.paket2;


public class Database {
    public void baglantiKur1(String username,int password){
        /* burada parametrelerin başın afinal eklemediğimiz için username'e 
        aşağıda olduğu gibi müdahale edebiliyoruz, yani gelen parametre değil aşağıdaki ahmet ataması kabul ediliyor*/
        username="ahmet";
      
        
        System.out.println("kullanıcı adı : "+username);
        System.out.println("kullanıcı şifresi : "+password);
    
    
    }
     public void baglantiKur2( final String username,final int password){
        /* buradad ise parametrelere final ekediğimizden herhangi bir müdahale kabul etmez hata veriir
         ve girilen parametre ne ise o kabul edilir*/
      
        // username="ahmet";
      
        
        System.out.println("kullanıcı adı : "+username);
        System.out.println("kullanıcı şifresi : "+password);
    
    
    }
    
}
