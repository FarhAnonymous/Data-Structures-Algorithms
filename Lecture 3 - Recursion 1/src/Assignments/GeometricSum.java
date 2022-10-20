package Assignments;

public class GeometricSum {

	public static double findGeometricSum(int k) {
		if (k == 0) {
			return 1;
		}
		return 1 + 0.5 * (findGeometricSum(k - 1));

	}

	public static void main(String[] args) {
		int k = 3;
		System.out.println(findGeometricSum(k));

	}

}
