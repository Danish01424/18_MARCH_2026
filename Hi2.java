import java.util.Scanner;
class Hi2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println( "enter the size of array:");
        int size = sc.nextInt();
         int arr[] = new int[size]; 
        System.out.println("Array elments are:");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
System.out.println("Reverse is:");
for(int i =size-1;i>=0;i--)
{
    System.out.println(arr[i]);
}

    }
}