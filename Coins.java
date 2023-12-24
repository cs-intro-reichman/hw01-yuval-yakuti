public class Coins
{
    public static void main(String[] args) 
    {
        //Declares integer variables 
         int a = Integer.parseInt (args[0]);

		 //calculate the rest affter dividing by 25 and print the result
         int quarter = (a/25);
         int cent = (a%25);
         System.out.println( " use " + quarter + " quarters " + " and " + cent + " cents " ); 
    }
}  