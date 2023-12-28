package inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz ");
        String islemler = "İşlemler... \n" + "1. Yazılımcı İşlemleri \n"  + "2. Yönetici İşlemleri \n"
                + " Çıkış için q ye basınz ";

        System.out.println("---------------------------------------");
        System.out.println(islemler);
        System.out.println("---------------------------------------");

        while (true){
            System.out.println("İşlemi Seçiniz ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("programdan çıkıyor ");
                break;

            } else if (islem.equals("1")) {
                    Yazılımcı yazılımcı = new Yazılımcı("Berat " , "Kulcu" , 13,"Java , SQL ");

                    String yazılımcıİslem = "1. Format at \n"
                            + "2. Bilgileri Göster \n"
                            + "Çıkış için 'q' ya basın \n";
                System.out.println(yazılımcıİslem);

                    while (true){
                        System.out.println("İşlemi Seçiniz ");
                        String y_islem =  scanner.nextLine();

                        if (y_islem.equals("q")){
                            System.out.println("İşlemden Çıkılıyor ");
                            break;
                        } else if (y_islem.equals("1")) {
                            System.out.println("İşletim Sistemi ");
                            String isletim_sistemi = scanner.nextLine();
                            yazılımcı.formatAt(isletim_sistemi);
                        } else if (y_islem.equals("2")) {
                            yazılımcı.bilgileriGöster();
                        }else {
                            System.out.println("Geçersiz İşlem ");
                        }
                    }
            } else if (islem.equals("2")) {
                Yönetici yönetici = new Yönetici("Musab","Kulcu",12,25);

                String yonetici_islem = "Yönetici İşlemleri \n"
                        +"1. Zam Yap \n"
                        +"2. Bilgileri Göster \n"
                        +"Çıkış için q ya bas";
                System.out.println(yonetici_islem);

                while (true){
                    System.out.println("işlemleri seçiniz ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q") ){
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor ");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("Yöneticinin ne kadar zamn yapmasını istiyorsunuz ");
                        int zamMiktarı = scanner.nextInt();
                        scanner.nextLine();
                        yönetici.zamYap(zamMiktarı);

                    } else if (y_islem.equals("2")) {
                        yönetici.bilgileriGöster();
                    }else {
                        System.out.println("Geçersiz İşlem");
                    }
                }
            }
        }
    }
}
