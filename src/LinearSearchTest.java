import utils.ArrayGenerator;
import utils.Student;
import linearSearch.LinearSearch;

public class LinearSearchTest {
	public static void main(String[] args) {
		Integer[] data = {24, 15, 12, 423, 23, 17, 46}; //用包装类
		
		int res = LinearSearch.search(data, 423);
		System.out.println(res);
		
		int res1 = LinearSearch.search(data, 13);
		System.out.println(res1);
		
		Student[] students = {new Student("Alice"),
							  new Student("Jack"),
							  new Student("Rose")};
		Student jack = new Student("jack");
		int res2 = LinearSearch.search(students, jack);
		System.out.println(res2);
		
		//测时间
		int[] dataSize = {1000000, 10000000};
		for (int n:dataSize) {
			Integer[] data1 = ArrayGenerator.generateOrderedArray(n);
			long start = System.nanoTime();
			for (int j = 0; j < 100; j++)
				LinearSearch.search(data1, n);
			long end = System.nanoTime();
			System.out.println("n = "+n+", 100 runs: "+(end-start)/1000000000.0+"s");
		}
	}

}

