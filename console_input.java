
public class console_input
{
   public static void main(String [] args)
   {
       int [] arr = new int [args.length];
       int sum=0;
       
       for(int i=0;i<args.length;i++)
       {
           arr[i] = Integer.parseInt(args[i]);
       }
       
       for(int i=0;i<args.length;i++)
       {
           sum=sum+arr[i];
       }
       System.out.println(sum);
   }
    
}
