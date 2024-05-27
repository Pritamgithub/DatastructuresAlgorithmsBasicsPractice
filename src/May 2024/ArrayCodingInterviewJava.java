//From the Chatgpt I found about this many easy related array interview questions.... Let's solve them one by one....
/*
 * 
 * Can you give me a lits of java arrays coding interview questions

OpenAI GPT3.5
Sunday 9:30 AM



Here is a list of common Java array-related coding interview questions that you may encounter:

Find the maximum or minimum element in an array.
Find the second largest or second smallest element in an array.
Reverse an array.
Check if an array is sorted in ascending or descending order.
Find the sum of all elements in an array.
Find the average of elements in an array.
Rotate an array to the right by a given number of steps.
Remove duplicates from a sorted or unsorted array.
Merge two sorted arrays into a single sorted array.
Find the intersection of two arrays.
Find the union of two arrays.
Find the missing number in an array of integers from 1 to N.
Implement a function to shuffle an array.
Implement a function to sort an array of 0s, 1s, and 2s (Dutch National Flag problem).
Implement a function to find the majority element in an array.
Implement a function to find the equilibrium index of an array.
Implement a function to find the maximum product of two integers in an array.
Implement a function to find the subarray with the largest sum (Kadane's algorithm).
 * 
 * 
 */

public class ArrayCodingInterviewJava {
//find the maximum of the array
public static void main(String arg[])
{
    int a[]={1,3,5,6};
    //here from the given array the max is 6;
    
    //go through all the indexes of array a ,,, the pointer will check if the array is > than the previous location
    //int i=1;
    //intializing the first element as the max of the array
    int max=a[0];
    //iterate through the array
    for(int i=1;i<a.length;i++)
    {
        if(a[i]>max){
            max= a[i];
        }
    }
    System.out.println("Here is the maximum of the " + max);
//Similarly if  you do not want a third variable which is the max this is how we can solve this problem
int b[]= {1,8,5,9};
    //    0,1,2,3  

    //int max =0;
    int max1= b[0];
for (int i=1;i<b.length;i++)
{
    if(b[i]>max1){
        //8>1= true
        //5>2= true
        max1=i;
    }
}
System.out.println(" This the max 1 value " + b[max1]);




}//end of main


}
