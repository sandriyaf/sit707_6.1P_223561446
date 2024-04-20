package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223561446";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Sandriya Fernandes";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
    public void testIsEven() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(2));
        Assert.assertTrue(WeatherAndMathUtils.isEven(0));
        Assert.assertFalse(WeatherAndMathUtils.isEven(1));
        Assert.assertFalse(WeatherAndMathUtils.isEven(3));
    }
	@Test
    public void testIsPrime() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(3));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(6));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(9));
    }
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(10.0, 2.0));
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(0.0, 0.0));
    }

    @Test
    public void testWarnWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 2.0));
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(20.0, 5.0));
    }

    @Test
    public void testCancelWeatherAdviceWithRain() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(10.0, 7.0));
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 3.0));
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(50.0, 5.0));
    }
    
    
}
