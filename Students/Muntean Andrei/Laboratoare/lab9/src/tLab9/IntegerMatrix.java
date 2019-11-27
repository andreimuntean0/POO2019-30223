package tLab9;

public class IntegerMatrix extends GenericMatrix<Integer> {
	
	/** Aduna doi intregi */
	protected Integer add(Integer o1, Integer o2) {
		return o1 + o2;
	}

	protected Integer multiply(Integer o1, Integer o2) {
		return o1 * o2;
	}

	/** Specifica zero pentru un intreg */
	protected Integer zero() {
		return 0;
	}

	
}

