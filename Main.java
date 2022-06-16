import java.util.Scanner;
// Patika.dev linkim -> https://app.patika.dev/ailker
// Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran program
// Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
// tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
public class Main {
    public static void main(String[] args) {
        float kdvliFiyat,kdvsizFiyat,kdvOrani,kdv;

        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz fiyatini giriniz :");
        kdvsizFiyat = input.nextFloat();
        if(kdvsizFiyat > 1000)
            kdvOrani = 0.08f;
        else
            kdvOrani = 0.18f;
        kdv = (kdvsizFiyat * kdvOrani);
        kdvliFiyat = kdvsizFiyat + kdv;

        System.out.println("KDV'siz fiyati : " + kdvsizFiyat);
        System.out.println("KDV'li fiyati : " + kdvliFiyat);
        System.out.println("KDV orani : " + kdvOrani);
        System.out.println("KDV Tutari : " + kdv);
        }
    }