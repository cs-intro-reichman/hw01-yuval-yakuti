public class Coins
{
    public static void main(String[] args) 
    {
        //
         int a = Integer.parseInt (args[0]);
         int quarter = (a/25);
         int cent = (a%25);
         System.out.println( " use " + quarter + " quarters " + " and " + cent + " cents " ); 
    }
}  