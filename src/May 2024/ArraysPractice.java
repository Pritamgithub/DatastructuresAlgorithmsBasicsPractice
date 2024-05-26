/**
 * 
 */



/**
 * 
 */


public class ArraysPractice {

	/**
	 * @param args
	 * Time complexity of this is O(n)  n is the size of Array	
	 * Auxiliary space O(1)  since no extra space is required
	 */
	public static void main(String[] args) {
	//StudentasArray class is created as an object class which has two variables int roll_number and string name; Can be accessed in this way intialize, declared	
	// StudentasArray[] arr = new StudentasArray[7];
	// 	arr[0]= new StudentasArray(1, "null");
	// 	arr[1]= new StudentasArray(2, "null1");
	// 	arr[2]= new StudentasArray(3, "null2");
	// 	arr[3]= new StudentasArray(4, "null3");
	// 	arr[4]= new StudentasArray(5, "null4");
	// 	arr[5]= new StudentasArray(6, "null5");
		
	// 	for(StudentasArray Students: arr)
	// 	{
	// 		System.out.println(Students.roll_number);
	// 	}
		
	//arr[0]= new StudentasArray (1,"pritam");
	StudentasArray[] arr1 = { 
			new StudentasArray( 1,"pritam"),
            new StudentasArray(2,"Chavhan")};
	
	for (int i=0; i<arr1.length;i++)
			System.out.println(arr1[i].roll_number + " " + arr1[i].name);
	// Two dimensional Array
	int [] [] arr2= new int[1][1];
	System.out.println("this is array 2 printing "+ arr2[1][1]);
	
	}//end of main
	
	


}//end of class
