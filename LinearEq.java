public class Linear
{
    public static void main(String[] args) 
    {
        //Declares 3 variable as double values as long as 'a' not = 0
        double a = Double.parseDouble (args[0]);
        double b = Double.parseDouble (args[1]);
        double c = Double.parseDouble (args[2]);
		if (a==0) System.out.println( "Error");
		//put the values in the equation and print the result
        double x = ((c-b)/a);
        System.out.println( a + " * x " + "+ " + b + " = " + c );
        System.out.println( "x = " + x );
    }
}