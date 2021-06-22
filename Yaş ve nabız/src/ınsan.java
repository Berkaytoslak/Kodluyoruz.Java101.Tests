public class ınsan {
    private String isim;
    private String soyAd;
    private int dogumYılı;
    private int yas;
    private int maxNabız;

    public ınsan(String isim,String soyAd,int dogumYılı){
        this.isim=isim;
        this.soyAd=soyAd;
        this.dogumYılı=dogumYılı;
        yasHesapla();
        maxNabızHesapla();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getDogumYılı() {
        return dogumYılı;
    }

    public void setDogumYılı(int dogumYılı) {
        this.dogumYılı = dogumYılı;
    }

    private void yasHesapla(){
        this.yas=2020-this.dogumYılı;
    }
    private void maxNabızHesapla(){
        this.maxNabız=220-this.yas;
    }

    public String toString(){
        return  "Kişi ad: "+this.isim+" "+this.soyAd+" Yaş:"+this.yas+"\nMaximum nabız :"+this.maxNabız+ " optimum minimum nabız: "+0.5*this.maxNabız+" optimum maximum nabız "+0.85*this.maxNabız;
    }

}
