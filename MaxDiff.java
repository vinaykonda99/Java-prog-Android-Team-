public class MaxDiff
{
    int maxDiff(int arr[], int arr_size) 
    {
        int max_diff = arr[1] - arr[0];

        for (int i=0; i<arr_size; i++) 
        {
            for (int j=i + 1; j <arr_size; j++) 
            {
                if (arr[j] - arr[i] > max_diff)
                    max_diff = arr[j]-arr[i];
            }
        }
        return max_diff;
    }

    public static void main(String[] args) 
    {
        MaxDiff maxdif= new MaxDiff();

        int arr[] = {4,7,3,68,84};

        System.out.println("Maximum difference is " + maxdif.maxDiff(arr, 5));
    }
}