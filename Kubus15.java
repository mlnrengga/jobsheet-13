import java.util.Scanner;
public class Kubus15 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int s,L,vol;

        System.out.print("Masukkan Sisi: ");
        s=input.nextInt();

        L=hitungLuasPermukaan(s);
        System.out.println("Luas permukaan kubus adalah "+L);

        vol=hitungVolume(s);
        System.out.println("Volume kubus adalah "+vol);
        input.close();
    }   
    static int hitungLuasPermukaan(int s){
        int Luas = 6 * s * s;
        return Luas;
    }  
    static int hitungVolume(int s){
        int Volume = s * s * s;
        return Volume;
    }
}
