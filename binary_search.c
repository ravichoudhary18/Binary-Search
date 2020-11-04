#include <stdio.h>

int BinarySearch(int arr[],int l,int r,int x){
    if(r>=l){
        int mid = l+(r-l)/2;
        if (arr[mid]==x)
        {
            return mid;
        }
        else if(arr[mid]>x)
        {
            return BinarySearch(arr,l,mid-1,x);
        }
        else{
            return BinarySearch(arr,mid+1,r,x);   
        }
        
    }
    else{
        return -1;
    }
}

int main(){
    int arr[] = {14, 52, 57, 64, 82, 86, 95};
    int x = 64;
    int n = sizeof(arr)/sizeof(arr[0]);
    int result = BinarySearch(arr,0,n-1,x);
    if(result == -1){
        printf("%d Not Found",x);
    }else{
        printf("%d is at index %d",arr[result],result);
    }
}