/**
 * binarysearch
 */
import java.util.Arrays;
public class binarysearch {

    public static void main(String[] args) {
       int []arr = {2,3,4,5,6,8,8,8 , 8 , 8 , 8,8,9};
           int target = 8;
           int so = search(arr, target);
System.out.println(so);
      
    }
    static int  search(int [] arr, int target){
        int start = 0 ; 
        int end = 1;
         while (target> arr[end]) {
            int newstart = end +1;
            end = end + (end- start+1)*2;
            start = newstart;
         }
     return binarystart(arr, target, start, end);
    }
   
   
   
   
    static int binarystart(int []arr, int target,int start , int end ){
     while (start< end) {
        int mid = start +  (end -start)/2;
        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target>arr[mid]){
            start = mid+1;
        }else{
            return mid;
        }
     }
     return 0 ; 
   }

}




// int [] ans = {-1,-1};
// int start = binarystart(arr, target, true);
// int end = binarystart(arr, target, false);
// ans[0] = start;
// ans[1] = end;
// return ans;













// amazon find the from infinite array 
// public class binarysearch {

//     public static void main(String[] args) {
//        int []arr = {2,3,4,5,6,8,8,8 , 8 , 8 , 8,8,9};
//            int target = 8;
//            int so = search(arr, target);
// System.out.println(so);
      
//     }
//     static int  search(int [] arr, int target){
//         int start = 0 ; 
//         int end = 1;
//          while (target> arr[end]) {
//             int newstart = end +1;
//             end = end + (end- start+1)*2;
//             start = newstart;
//          }
//      return binarystart(arr, target, start, end);
//     }
   
   
   
   
//     static int binarystart(int []arr, int target,int start , int end ){
//      while (start< end) {
//         int mid = start +  (end -start)/2;
//         if (target < arr[mid]) {
//             end = mid - 1;
//         } else if (target>arr[mid]){
//             start = mid+1;
//         }else{
//             return mid;
//         }
//      }
//      return 0 ; 
//    }

// }
