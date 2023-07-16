import java.util.ArrayList;
import java.util.Scanner;
public class LeadersInAnArray {
    static void findLeaders(int[] array,int n)
    {
        ArrayList<Integer> leaders=new ArrayList<>();
        int leader=array[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(array[i]>leader) {
                leader = array[i];
                leaders.add(leader);
            }
        }
        leaders.add(array[n-1]);
        for(int lead :leaders)
        {
            System.out.print(lead+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        findLeaders(A,n);
    }
}
