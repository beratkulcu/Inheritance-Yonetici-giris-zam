package inheritance;

public class Yönetici extends Calisan{

    private  int sorumluKisiSayisi ;

    public Yönetici(String ad, String soyad, int id , int sorumluKisiSayisi) {
        super(ad, soyad, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println("Yöneticinin Sorumlu oldugu kişi sayısı : " + sorumluKisiSayisi );
    }

    public  void  zamYap (int zamMiktarı){
        System.out.println(getAd() + " Çalışanlara  " + zamMiktarı + " Kadar zam yaoıldı . " );
    }
}
