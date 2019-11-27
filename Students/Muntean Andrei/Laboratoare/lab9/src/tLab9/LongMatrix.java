package tLab9;

public class LongMatrix extends GenericMatrix<Long> {

	protected Long add(Long o1, Long o2) {
		return o1 + o2;
	}

	protected Long multiply(Long o1, Long o2) {
		return o1 * o2;
	}

	protected Long zero() {
		return 0L;
	}

}
