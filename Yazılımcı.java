package inheritance;

public class Yazılımcı extends  Calisan {

 private  String diller ;
    public Yazılımcı(String ad, String soyad, int id , String diller) {
        super(ad, soyad, id);
        this.diller = diller ;
    }
    public  void  formatAt (String isletimSistemi){
        System.out.println(getAd() + " " + isletimSistemi + "ni yüklüyor...." );
    }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println("Yazılımcının Bildiği Diller : " + diller );
    }
}
