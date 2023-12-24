public class GenThree
{
    public static void main(String[] args) 
    {
        //Declares 2 integer variables 
         int a = Integer.parseInt( args[0]);
         int b = Integer.parseInt( args[1]);

         //find 3 numbers in the rang of 0-1 
         double r = Math.random();
         double p = Math.random();
         double q = Math.random();

         //find 3 numbers in the rang a-b
         int n = (int) ((r*(b-a))+a);
         int m = (int) ((p*(b-a))+a);
         int l = (int) ((q*(b-a))+a);
         System.out.println(n);
         System.out.println(m);
         System.out.println(l);

         //find the minimal number bettwin the 3 numbers (n,m,l)
         if (n<m&&n<l) System.out.println( "The minimal generated number was " + n);
         if (m<l&&m<n) System.out.println( "The minimal generated number was " + m);
         if (l<m&&l<n) System.out.println( "The minimal generated number was " + l);
    }
}    