import java.util.Scanner;

public class Proje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MESAJI GİRİNİZ");
        String mesaj = sc.nextLine();
        mesaj = mesaj.trim().toLowerCase().replaceAll("\\n+" , " ").replaceAll("\\s+", " ");
        String[] mesajStr = mesaj.split("\\s+");
       String mesajStr1 = "";
       String sonuc = "";

        for (String s : mesajStr) {
            if (s.equals("one")) {
                mesajStr1 += "1";
            } else if (s.equals("zero")) {
                mesajStr1 += "0";
            }



        }
        for (int i = 0; i < mesajStr1.length(); i += 8) {
            String baytStr = "";
            if (i + 8 <= mesajStr1.length()) {
                baytStr = mesajStr1.substring(i, i + 8);
            } else {
                baytStr = mesajStr1.substring(i);
                baytStr = String.format("%8s", baytStr).replace(' ', '0');

            }
            int baytInt = Integer.parseInt(baytStr, 2);
            sonuc += (char) baytInt;

        }
        System.out.println(sonuc);

    }
}
