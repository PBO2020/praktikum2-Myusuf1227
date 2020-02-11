package koppi;

import java.util.Scanner;
import java.util.ArrayList;

public class Koppi {

    Scanner cup = new Scanner(System.in);
    ArrayList<copiclas> uva = new ArrayList<>();

    void menu() {
        copiclas c1 = new copiclas();
        copiclas c2 = new copiclas();
        copiclas c3 = new copiclas();
        c1.setNamakopi("Arabica");
        c1.setAsalkopi("Timur Tengah");
        c2.setNamakopi("Robusa");
        c2.setAsalkopi("Eropa");
        c3.setNamakopi("Flores");
        c3.setAsalkopi("Asia");
        uva.add(c1);
        uva.add(c2);
        uva.add(c3);
        Menutampilan();
    }

    void Menutampilan() {
        System.out.println(" WELCOME KOPI");
        System.out.println(" [1]Tampilan Daftar Kopi");
        System.out.println(" [2] Anda Mesan?");
        System.out.println(" [3] Keluar");
        System.out.println(" Monggo Dipilih :");
        String pilih = cup.next();
        switch (pilih) {
            case "1":
                for (int i = 0; i < uva.size(); i++) {
                    int p = 1 + i;
                    System.out.println(" Menu Kopi " + p + "" + uva.get(i).getNamakopi());
                }
                Menutampilan();
                break;
            case "2":
                System.out.print("Pilih Kopi Ingin DiPesan : ");
               int huh = cup.nextInt()-1;
                if (huh <= uva.size()) {
                    for (int i = 0; i < uva.size(); i++) {
                        System.out.println("Anda memesan Kopi : " + uva.get(huh).getNamakopi() + " Berasal Dari : " + uva.get(huh).getAsalkopi());
                    }
                }

                
        case "3":
                    System.exit(0);
                break;
            default:
                System.out.println("Inputan Salah,Coba Input lagi");

        }
    }

    

    public static void main(String[] args) {
        Koppi z = new Koppi();
        z.menu();
    }

}
