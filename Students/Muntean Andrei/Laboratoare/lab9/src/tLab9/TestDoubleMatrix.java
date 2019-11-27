package tLab9;

public class TestDoubleMatrix {
	public static void main(String[] args) { // Creaza tablourile de intregi m1, m2
		Double[][] m1 = new Double[][] { { 1.1, 2.2, 3.3 }, { 4.4, 5.5, 6.6 }, { 1.5, 1.7, 1.9 } };
		Double[][] m2 = new Double[][] { { 1.2, 1.3, 1.4 }, { 2.3, 2.2, 2.3 }, { 0.7, 0.0, 0.6 } };

		// Creaza o instanta de IntegerMatrix
		DoubleMatrix doubleMatrix = new DoubleMatrix();

		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, doubleMatrix.addMatrix(m1, m2), '+');

		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult(m1, m2, doubleMatrix.multiplyMatrix(m1, m2), '*');
	}
}
