package tLab9;

public class DoubleMatrix extends GenericMatrix<Double>{

	protected Double add(Double o1, Double o2) {
		return o1 + o2;
	}

	protected Double multiply(Double o1, Double o2) {
		return o1 * o2;
	}

	protected Double zero() {
		return 0.0;
	}
	
}
