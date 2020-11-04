import java.util.Arrays;

public class binary_search{
    int binary_searchf(int arr[],int l,int r,int x){
        if(r>=l){
            int mid = l+(r-l)/2;

            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid]>x){
                return binary_searchf(arr,l,mid-1,x);
            }else{
                return binary_searchf(arr,mid+1,r,x);
            }
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
         
        binary_search ob = new binary_search();
        int arr[] = {24,5,56,84,96,94,92};
        Arrays.sort(arr);
        int x = 5;
        int n = arr.length;
        int result = ob.binary_searchf(arr,0,n-1,x);

        if(result == -1)
            System.out.println("Not Found");
        else
            System.out.println(x + " is at index " + result);
    }
    
}