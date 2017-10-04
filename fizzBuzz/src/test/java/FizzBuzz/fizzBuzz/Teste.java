package FizzBuzz.fizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class Teste {

	@Test
	public void main(){
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		Assert.assertEquals("Fizz", fizzBuzz.ehFizzBuzz(39));
		Assert.assertEquals("Buzz", fizzBuzz.ehFizzBuzz(35));
		Assert.assertEquals("FizzBuzz", fizzBuzz.ehFizzBuzz(75));
		Assert.assertEquals("Continua o jogo", fizzBuzz.ehFizzBuzz(1));
	}
}
