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
public class halo {
    private String guru;
    private String mapel;
    Scanner cimeng = new Scanner (System.in);
    Scanner gomeng = new Scanner (System.in);
    
    public void guru(String guru, String mapel){
        System.out.println("Nama Guru:  ");
        this.guru = cimeng.nextLine();
        System.out.println("MataPelajarannya: ");
        this.mapel = gomeng.nextLine();
    }
    public void data(){
        System.out.println("Nama Guru: "+this.guru);
        System.out.println("MataPelajaran: "+this.mapel);
    }
}
