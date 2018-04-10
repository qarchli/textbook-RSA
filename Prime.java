import java.math.BigInteger;
import java.util.Random;

public class Prime {

	public static BigInteger getPrime( int minVal, int maxVal, int certainty ) {

		BigInteger max = new BigInteger( Integer.toString( maxVal ) );
		BigInteger min = new BigInteger( Integer.toString( minVal ) );

		Random random = new Random();
		int maxLength = max.bitLength();

		BigInteger p;
		do {
			p = new BigInteger( maxLength, random );
		} while ( p.compareTo( max ) > 0 || p.compareTo( min ) < 0 || !p.isProbablePrime( certainty ) );

		return p;
	}

}
