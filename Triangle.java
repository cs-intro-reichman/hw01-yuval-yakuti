public class Triangle
{
    public static void main(String[] args) 
    {
        //
      int a = Integer.parseInt (args[0]);
      int b = Integer.parseInt (args[1]);
      int c = Integer.parseInt (args[2]);
      boolean Triangle =((a+b)>c && (a+c)>b && (b+c)>a); 
      if (Triangle) System.out.println( a + ", " + b + ", " + c + " :" + " True" ); 
      else System.out.println(  a + ", " + b + ", " + c + " :" + " False" );  
    }     
}