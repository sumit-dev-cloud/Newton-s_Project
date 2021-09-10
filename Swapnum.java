public class Swapnum {
    public static void main(String[] args) {
        int a= 50;
        int b= 40;
        a = a+b;    //30
        b=Math.abs(a-b);      //b-a 20-30---10;
        a=Math.abs(b-a);      //30-20 --10
        System.out.println(a);
        System.out.println(b);
    }
}
