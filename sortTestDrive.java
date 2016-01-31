
public class sortTestDrive {

	@SuppressWarnings({ "static-access", "rawtypes" })
	public static void main(String[] args) {
		
		Comparable[] b  = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
		System.out.println("\nSelection Sort");
		Selection selSort = new Selection();
		selSort.show(b);
		selSort.sort(b);
		
		Comparable[] a  = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
		System.out.println("\nInsertion Sort");
		Insertion insertionSort = new Insertion();
		insertionSort.show(a);
		insertionSort.sort(a);
		
		Comparable[] c  = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
		System.out.println("\nShell Sort");
        Shell shellSort = new Shell();
        shellSort.show(c);
        shellSort.sort(c);
        
		Comparable[] d  = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
		System.out.println("\nMerge Sort");
        Merge mergeSort = new Merge();
        mergeSort.show(d);
        mergeSort.sort(d);
		
	}

}
