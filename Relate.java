public class Relate {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        System.out.println(new Relate() == new Relate());
        System.out.println(new Relate() != new Relate());
    }
    
}
