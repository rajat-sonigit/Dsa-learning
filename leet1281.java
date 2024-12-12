public class leet1281 {
    public static void main(String[] args) {
       
        int a = 114;
        int b;
        int product = 1;
        int sum = 0 ;
        
        for (int i = 0; i<=a ; i++){
            b = a % 10;    
              
             product = product*b;
             
             sum = sum +b;
             
            a = a/10;
        }
        System.out.println(product);
        System.out.println(sum);
        int subtraction = product-sum;
        System.out.println(subtraction);
    }
}
