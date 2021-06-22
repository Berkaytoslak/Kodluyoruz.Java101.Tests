public class Customer {
    private String isim;
    String soyIsım;
    int yas;
    
    public Customer(String isim, String soyIsım, int yas) {
        this.isim=isim;
        this.soyIsım = soyIsım;
        this.yas = yas;
    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "isim='" + isim + '\'' +
                ", soyIsım='" + soyIsım + '\'' +
                ", yas=" + yas +
                '}';
    }
}
