import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int girisSayisi = sc.nextInt();

        if (girisSayisi == 0) {
            System.out.println(" 0'DAN FARKLI BİR DEĞER GİRİNİZ");
            main(args);
            return; 
        } else if (girisSayisi < 0) {
            System.out.println(" LÜTFEN POZİTİF BİR DEĞER GİRİNİZ");
            main(args);
            return;
        }
        sc.nextLine(); 


        String girisMetni = sc.nextLine();
        girisMetni = girisMetni.trim();
        girisMetni = girisMetni.replace(" ", "");


        if (girisSayisi > 200000) {
            System.out.println("LÜTFEN 200000 VEYA ALTINDA BİR DEĞER GİRİNİZ");
            main(args);
            return; // return koyduğum zaman hata vermediği için return koydum buraya
        }else if (girisSayisi != girisMetni.length()){
            System.out.println("GİRDİĞİNİZ SAYI İLE GİRDİ UZUNLUĞU UYUŞMUYOR");

            main(args);

            return;   //return koyduğum zaman hata vermediği için return koydum buraya
        }
        sc.close();

        int sayac = 0;

        for (int baslangicDegeri = 1; baslangicDegeri <= girisSayisi; baslangicDegeri++) {
            int kontrolDegeri = baslangicDegeri;

            int hareketSayisi = 0;
            int ustSinir = girisSayisi + 2;

            while (kontrolDegeri >= 1 && kontrolDegeri<= girisSayisi && hareketSayisi < ustSinir) {
                char ch = girisMetni.charAt(kontrolDegeri- 1);

                if (ch == '>') {
                    kontrolDegeri++;
                } else if (ch == '<') {
                    kontrolDegeri--;
                } else {
                    System.out.println("GEÇERSİZ KARAKTER KULLANIMI LÜTFEN YENİDEN GİRDİ GİRİNİZ");
                    main(args);

                }
                hareketSayisi++;
            }

            if (kontrolDegeri < 1 || kontrolDegeri > girisSayisi) {
                sayac++;
            }
        }

        System.out.println(sayac);

    }
}
