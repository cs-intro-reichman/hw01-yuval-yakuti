public class Triangle
{
    public static void main(String[] args) 
    {
	//Declares 3 integers variables a,b,c
      int a = Integer.parseInt (args[0]);
      int b = Integer.parseInt (args[1]);
      int c = Integer.parseInt (args[2]);

	  //place the variables in the triangle inequality theorem
      boolean Triangle =((a+b)>c && (a+c)>b && (b+c)>a);

	  //print true or false  
      if (Triangle) System.out.println( a + ", " + b + ", " + c + ":" + " True" ); 
      else System.out.println(  a + ", " + b + ", " + c + ":" + " False" );  
    }     
}