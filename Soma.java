import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soma {

	public int variavelA, variavelB;

	    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
      variavelA = bufferRead.readLine();
			variavelB = bufferRead.readLine();

	public double calcula (double variavel1, double variavel2) {
		return variavel1 + variavel2;
	}

}
