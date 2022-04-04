 import java.util.Scanner;

public class quicksorting{
    // Swap function
    static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //
    static int partition(int arr[],int beg, int end)
    {
        int pivot = arr[end];
        int i = (beg-1);

        for (int j = beg; j <= end; j++) {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }

        }
        swap(arr,i+1,end);
        return i+1;
    }

    static void quicksorting(int arr[],int beg, int end)
    {
        if(beg<end)
        {
            int split = partition(arr,beg,end);
            quicksorting(arr,beg,split-1);
            quicksorting(arr,split+1,end);
        }
    }

    static void Print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quicksorting(arr,0,n-1);
        Print(arr);
    }
}