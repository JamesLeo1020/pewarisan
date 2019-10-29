/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class halo2 extends halo{
    private String noGuru;
    Scanner alay = new Scanner (System.in);
    
    public halo2(String noGuru, String guru, String mapel){
        super.guru(guru, mapel);
        System.out.println("Nomer Guru: ");
        this.noGuru = alay.nextLine();
    }
    
    public void data(){
        System.out.println("==========================================================================================================");
        System.out.println("Nomer guru: "+ this.noGuru);
        super.data();
    }
}
