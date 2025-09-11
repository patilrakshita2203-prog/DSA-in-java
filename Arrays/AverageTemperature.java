import java.util.Scanner;
public class AverageTemperature{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number of Days:");
            int Days=sc.nextInt();
            int[] temps=new int[Days];
            int sum=0;
            for(int i=0; i< Days ; i++){
                System.out.println(" Day " + (i+1) + " Temperature " );
                temps[i]=sc.nextInt();
                sum+=temps[i];
            }
            double average=(double)sum/Days;
            System.out.println("Average Temperature = "+ average);
            int count=0;
            for(int i=0; i < Days; i++){
                if(temps[i]>average){
                   count++;}}
     System.out.println("Number of Days above average = " + count);
                    sc.close();
    }
}

