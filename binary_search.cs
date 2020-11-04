using System;
class BinarySearch
{
    static int binarySearch(int[] arr,int x){
        int l = 0,r = arr.Length-1;
        while (l<=r)
        {
            int mid = l+(r-l)/2;

            if (arr[mid]==x)
            {
                return mid;
            }if(arr[mid]<x){
                l = mid+1;
            }else{
                l = mid-1;
            }
        }

        return -1; 
    }
    public static void Main(){
        int[] arr ={12,14,55,56,85,96,98,990};
        int n = arr.Length;
        int x = 98;
        int result = binarySearch(arr,x);
        if (result == -1)
        {
            Console.WriteLine("Not Found");
        }else{
            Console.WriteLine(x+" is Found at index "+result);
        }
    }

}