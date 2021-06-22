public class sayi {
    private int number;
    private int toplam;
    private int i;


    public sayi(int number) {
        this.number=number;
        this.i=i;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void hesapla(){
        for (i=1;i<this.number;i++){
            if (this.number%i==0){
                toplam=toplam+i;
            }
        }
        if (toplam==this.number){
            System.out.println("Mükemmel");
        }
        else {
            System.out.println("değil");
        }
    }
}

