package numbers;

public class Factorial {

    public static void main(String args[]){
        System.out.println(fact(4));
    }
    public static int fact(int n)
    {
        int f=1;
        if(n == 0)
            return 1;
        else
           return f = n * fact(n-1);
    }
}
