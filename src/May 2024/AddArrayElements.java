
import java.util.Arrays;

public class AddArrayElements {

//create and declare an array of ints
// iterate through the array
//add the sum of the ints in a variable and display the total of the same
public static void main(String[] args) {
    int sumofArray=0;
int a[]=new int[]{1,4,5,6};
for (int i=0;i<a.length;i++)
{
    sumofArray += a[i];
}
System.out.println("The total of the array elements "+ sumofArray);

// Same way in order to multiple the arrays 

//===============================================
//new problem
// convert an array as list
//first declare an array and then just use that array 

int b[]= {1,4,5,6,7,4,5,6};
System.out.println("Integer Array as List: "
+ Arrays.asList(Arrays.toString(b)));

/// New Problem
//Search an element in an array

int c[]={1,4,5,6,7,4,5,6};

Arrays.sort(c);

System.out.println("Found at index" + Arrays.binarySearch(c, 2));

//Similarly we can search using binary search with (array, start index, end index, comparator)

System.out.println(" found on this index "+Arrays.binarySearch(c, 0, c.length, 5));
// let's compare two arrays 

System.out.println(" this is the comparison of two arrays "+Arrays.compare(c, b));

// returns -1 if the arrays are same and else if not then returns 1


//copy one array or say length increment

Arrays.copyOf(c, 10); // will append the new index with 0's


//parallel sort means sorting an array based using the multithreading approach

Arrays.parallelSort(c);
System.out.println(Arrays.toString(c));

}

}
