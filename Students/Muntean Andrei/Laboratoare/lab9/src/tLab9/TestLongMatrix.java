package tLab9;

public class TestLongMatrix {
	public static void main(String[] args) { // Creaza tablourile de intregi m1, m2
		Long[][] m1 = new Long[][] { { 1L, 20L, 345L }, { 4L, 324232L, 63434L }, { 122L, 123L, 123L } };
		Long[][] m2 = new Long[][] { { 111L, 111L, 111L }, { 22L, 22L, 22L }, { 0L, 0L, 0L } };

		// Creaza o instanta de IntegerMatrix
		LongMatrix longMatrix = new LongMatrix();

		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, longMatrix.addMatrix(m1, m2), '+');

		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult(m1, m2, longMatrix.multiplyMatrix(m1, m2), '*');
	}
}
