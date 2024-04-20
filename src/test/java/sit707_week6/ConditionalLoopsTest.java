package sit707_week6;


import org.junit.Assert;
import org.junit.Test;

public class ConditionalLoopsTest {
	
	@Test
	public void testSimpleLoopFunction() {
		ConditionalLoops.ForLoopFunction(4); // Just to test that it works
		ConditionalLoops.ForLoopFunction(0); // Test with zero iterations
    }
	
	@Test
    public void testLoopWithCondition() {
        int[] a = {1, 2, 3, 4, 5, 6,7,8};
        Assert.assertEquals(4, ConditionalLoops.loopWithCondition(a)); // Should return 4 even numbers
        int[] b = {1, 3, 5, 7};
        Assert.assertEquals(0, ConditionalLoops.loopWithCondition(b)); // No even numbers
    }

}
