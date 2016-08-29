import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testGreetingMessage() {
		assertEquals("Hello, GitHub", Hello.greetingMessage());
		assertEquals("Hello, Eclipse", Hello.greetingMessage());
	}
	
	@Test
	public void testBubbleSort(){
		assertArrayEquals(new int[]{1,2,3,4,5}, Hello.bubbleSort(new int[]{5,4,3,2,1}));
		assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, Hello.bubbleSort(new int[]{10,5,9,4,7,2,6,1,8,3}));
	}

}
