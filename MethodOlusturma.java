package w3resourcecomsorularivecozumleri;

public class MethodOlusturma {
    public static void main(String[] args) {
      // İki sayıyı bölmek ve ekrana yazdırmak için bir Java programı yazın.
        //Test Verisi :
        //50/3
        //Beklenen Çıkış :
        //16


        bolmeYap(50,3); //1.YÖNTEM == CONSOLE YAZDIRMA İŞLEMİ METHOD İÇİNDE


        int a=bolmeYap1(50,3); //2.YÖNTEM == YAZDIRMA İŞLEMİ METHODA DAHİL DEĞİL
        System.out.println(a);       // O YÜZDEN YAZDIRMA İŞLEMİNİ MAİN METHODDA KULLANMALIYIZ


    }

    private static int bolmeYap1(int a,int b) {
        return a/b;
    }

    private static void bolmeYap(int a,int b) {
        System.out.println(a/b);
    }
}
