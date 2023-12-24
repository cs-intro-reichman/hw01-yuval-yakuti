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

         //find the minimal number between the 3 numbers (n,m,l)
         int min = Math.min(n, m);
         min = Math.min(min, l);
         System.out.println("The minimal generated number was " + min);
    }
}    