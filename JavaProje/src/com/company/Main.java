package com.company;

public class Main {

    public static void main(String[] args) {
        /*int sayi =0;
        sayi=17;
        char karakter='A';
        String yazi="Berkay";
        if(sayi<20){
            System.out.println("sayi 20 den küçüktür");
        }
        else{
            System.out.println("sayi 20 den küçük değildir");
        }
        System.out.println("sayi="+sayi);
        System.out.println(karakter);
        System.out.println(yazi);*/

        /*int sayi1=20;
        int sayi2=25;
        int sayi3=35;
        int enBuyuk=sayi1;
        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if (enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        System.out.println(enBuyuk);*/

        //switch case
        /*char grade='E';

        switch (grade){
            case 'A':
                System.out.println("Çok iyi");
                break;
            case 'B':
                System.out.println(" iyi");
                break;
            case 'C':
                System.out.println("Eh işte");
                break;
            case 'D':
                System.out.println("Geçtin");
                break;
            case 'E':
            case 'F':
                System.out.println("kaldınız");
                break;
            default:
                System.out.println("Geçersiz");

        }*/


        //for
        /*for(int i=0; i<=20;i+=2){
            System.out.println(i);
        }*/

        //while
        /*int i=0;
        while(i<20){
            i++;
            System.out.println(i);
        }*/
/*STRİNG VE DİZİLER
        String[] ogrenciler = new String[4];
        ogrenciler[0] ="Berkay";
        ogrenciler[1] ="Ceren";
        ogrenciler[2] ="Ahmet";
        ogrenciler[3] ="Ali";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }*/

        /*double[] myList={2.2,3.5,9.8,7.1,6.5};
        double total=0;
        double max=myList[0];

        for (double number:myList){
            if (max<number) {
                max = number;
            }
            total=total+ number;
            System.out.println(number);
        }



        /*for (int number=0;number<myList.length;number++){
            if(max<myList[number]){
                max=myList[number];
            }
            total=total+myList[number];
            System.out.println(myList[number]);
        }
        System.out.println("Toplam = "+total);
        System.out.println("En Buyuk = "+max);*/

/*String işlemleri---------------
        String mesaj = "Berkay çok yakışıklı.";
        System.out.println(mesaj);

        System.out.println(mesaj.length());
        System.out.println(mesaj.charAt(3));
        System.out.println(mesaj.concat("Bence de."));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakter=new char[5];
        mesaj.getChars(0,5,karakter,0);
        System.out.println(karakter);
        System.out.println(mesaj.indexOf("kay"));
        System.out.println(mesaj.lastIndexOf("ok"));

        String mesaj = " Berkay çok yakışıklı.";
        System.out.println(mesaj);
        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());*/
/* ASAL SAYI ÖRNEK
        int number=17;
        for (int i=2;i<number;i++) {
            if (number % i == 0) {
                System.out.println("Sayı Asal değildir..");
            }
            else {
                System.out.println("Sayı Asaldır");
            }
        }*/
/*SESLİ HARF Mİ
        char harf='İ';

        if (harf=='A'){
            System.out.println("Harf seslidir");
        }
        else if (harf=='E'){
            System.out.println("Harf seslidir");
        }
        else if (harf=='I'){
            System.out.println("Harf seslidir");
        }
        else if (harf=='İ'){
            System.out.println("Harf seslidir");
        }
        else if (harf=='O'){
            System.out.println("Harf seslidir");
        }
        else if (harf=='Ö'){
            System.out.println("Harf seslidir");
        }
        else if (harf=='U'){
            System.out.println("Harf seslidir");
        }
        else if (harf=='Ü'){
            System.out.println("Harf seslidir");
        }
        else{
            System.out.println("Sesli değildir");
        }*/
/*MÜKEMMEL SAYİ
        int sayi=27;
        int a=0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                a=a+i;
            }
        }
        if (a==sayi){
            System.out.println("Mükemmel");
        }
        else{
            System.out.println("Değildir");
        }*/
/*ARKADAŞ SAYI
        int sayi1=220;
        int sayi2=284;
        int total1=0;
        int total2=0;
        for (int i=1;i<sayi1;i++) {
            if (sayi1 % i == 0 ) {
                total1 = total1 + i;
            }
        }
        for (int i=1;i<sayi2;i++) {
            if (sayi2 % i == 0 ) {
                total2 = total2 + i;
            }
        }
        if (sayi2==total1 && sayi1==total2){
            System.out.println("Arkadaş");
        }
        else{
            System.out.println("Değildir.");
        }*/
/*Sayi mevcutmudur
        int[] sayilar= new int[]{1,2,5,7,9,0};
        int aranacak = 6;
        boolean varMı=false;

        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMı=true;
            }
        }
        if (varMı==true){
            System.out.println("Mevcut");
        }
        else{
            System.out.println("Değildir");
        }*/








    }
}
