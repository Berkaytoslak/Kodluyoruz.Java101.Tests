public class Main {

    public static void main(String[] args) {
        String s = "Cuma gunleri java calismak guzeldir";
        int a = 0;
        for (char ch:s.toCharArray()){
            if (ch=='a'||ch=='e'||ch=='ı'||ch=='i'||ch=='o'||ch=='ö'||ch=='u'||ch=='ü'){
                a++;
            }
        }
        System.out.println(a+" tane sesli harf vardır.");
    }
}
