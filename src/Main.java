import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] kelimeler={"alex","messi","ronaldo",};
        Random random = new Random();
        String secilenKelime = kelimeler[random.nextInt(kelimeler.length)];
        int kelimeUzunluk = secilenKelime.length();
        char[] tahminEdilenHarf = new char[kelimeUzunluk];
        boolean kelimeTahminEdildi = false;
        for (int i = 0;i<kelimeUzunluk;i++){
            tahminEdilenHarf[i]='-';
        }
        Scanner scanner= new Scanner(System.in);
        while (!kelimeTahminEdildi){
            System.out.println("tahmininiz harf veya kelime:");
            String tahmin = scanner.nextLine();
            if (tahmin.length()==1){
                char tahminharf=tahmin.charAt(0);
                boolean dogruTahmin = false;
                for(int i = 0;i<kelimeUzunluk;i++){
                    if (secilenKelime.charAt(i)==tahminharf){
                        tahminEdilenHarf[i]= tahminharf;
                        dogruTahmin = true;
                    }
                }
                if (!dogruTahmin){
                    System.out.println("yanlış tahmin.");
                } else if (tahmin.equals(secilenKelime)) {
                    kelimeTahminEdildi=true;
                }
                else {
                    System.out.println("yanlış tahmin.");
                }

            }
            System.out.println("tahmininiz");
            for (char harf : tahminEdilenHarf){
                System.out.println(harf+" ");
            }

            if (!new String(tahminEdilenHarf).contains("-")){
                kelimeTahminEdildi = true;
                System.out.println("tebriks");
            }

        }


    }
}