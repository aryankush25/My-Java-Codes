import java.util.Scanner;
public class continuee
{
    public static void main(String [] args) {
        
        int [] arr = new int[5];
        
        Scanner s = new Scanner(System.in);
        
        for (int i=0;i<5;i++)
        {
            arr[i] = s.nextInt();
        }
        
        outer : for (int i=0;i<5;i++)
        {
            System.out.println("");
            System.out.println(arr[i] + " - ");
            inner : for (int j=0;j<5;j++)
            {
                if(j==2)
                {
                    continue;
                }
                System.out.print(arr[j]);
            }
        }
    }
}
