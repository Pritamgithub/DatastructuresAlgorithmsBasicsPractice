package w3Resources.methods;

public class ToFindSmallestorLargestAmongst3 {
    public static void main(String[] args) {

	int firstNo = 25;
	int secondNo = 37;
	int thirdNo = 29;
	System.out.println(smallestin3(firstNo, secondNo, thirdNo));
	System.out.println(largetsin3(firstNo, secondNo, thirdNo));
    }

    private static int largetsin3(int firstNo, int secondNo, int thirdNo) {
	return Math.min(Math.max(firstNo, secondNo), thirdNo);

    }

    private static int smallestin3(int firstNo, int secondNo, int thirdNo) {
	return Math.min(Math.min(firstNo, secondNo), thirdNo);
    }

}
