package Recursion_Hoga;

public class reverse_the_bounch_of_digitd {
    public static void main(String[] args) {
//    reverse1(1321314);
        System.out.println(reverse2(123456));
//        System.out.println(sum);
    }
    static int sum = 0;
    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n% 10;
        sum = sum*10 +rem;
        reverse1(n/10);
    }
//    ********************************************************************
    static int reverse2(int n ) {
//        sometime you might need some additional variable in the argument
//        in that case, make another function
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }
    private static int helper(int n, int digits) {
        if (n%10 == n)
        {
            return n;
        }
        int rem = n %10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);

    }
}
