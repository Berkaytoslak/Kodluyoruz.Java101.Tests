import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] dizi = {1,5,5,4,1,3,5,9};
        System.out.println("dizi: "+Arrays.toString(dizi));
        System.out.println("Tekrar sayıları");
        List<Integer> diziListesi = new ArrayList<>();
        List<Integer> diziListesiYedek = new ArrayList<>();
        List<Integer> sayiAdetleri = new ArrayList<>();

        for(int i = 0; i < dizi.length; i++) {
            diziListesi.add(dizi[i]);
            diziListesiYedek.add(dizi[i]);
        }
        diziListesi = diziListesi.stream().distinct().sorted().collect(Collectors.toList());
        diziListesi.forEach(i->{ sayiAdetleri.add(0); });

        int index = 0;
        for(int i = 0; i < diziListesi.size(); i++) {
            index = 0;
            for(int j = 0; j < diziListesiYedek.size(); j++) {
                if(diziListesiYedek.get(j) == diziListesi.get(i)) {

                    index++;

                }
            }
            sayiAdetleri.set(i, index);
        }
        System.out.println("-----------------");
        for(int i = 0; i < diziListesi.size(); i++) {
            System.out.println(diziListesi.get(i) + "sayısından şu kadar var : " + sayiAdetleri.get(i));
        }




    }
}
