public class Largest{
    public static void main(String[] args)
    {
        int arr1[]={31,14,25,21,18};
        System.out.println("Largest Element in an array"+element(arr1));

        int arr2[]={45,86,66,10,74};
        System.out.println("Largest Element in an array"+element(arr2));
    }

    static int element(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
