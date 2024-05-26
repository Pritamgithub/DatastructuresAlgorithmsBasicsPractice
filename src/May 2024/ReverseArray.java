
import java.util.Arrays;



public class ReverseArray {
public static void main(String[] args) {
    
int a[]= {1,4,6,7,5};
System.out.println("This is the original format of the array" );
printArray(a);
System.out.println("This is using an extra array or secondary array "); 
reverseArrayusingASecondArray(a);
System.out.println("\n");
System.out.println("This is the reversal of the array using swapping technique");
reversetheArraywithoutSecondArray(a);
}

private static void printArray(int[] a) {
    System.out.println(Arrays.toString(a));
    // another way of printing an array 
    //for (int j=0;j<a.length;j++){
    //     System.out.print(a[j] + " ");
    // }
}

private static void reversetheArraywithoutSecondArray(int[] a) {

    for(int i=0;i<a.length/2; i++){

        int temp= a[i]; 
        a[i]= a[a.length-1-i];
        a[a.length-1-i]= temp;
    }
    printArray(a);

}
private static void reverseArrayusingASecondArray(int arr[]) {
   int b[]=new int[arr.length];
   int i=0;
    for( i=0;i<arr.length;i++)
    {
        b[i]=arr[arr.length-1-i];
    }
    printArray(b);
}
}
