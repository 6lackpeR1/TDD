import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueSpac {

	private int anyNumber;
	private Queues queues;
	private int firstNumber = 3;
	private int secondNumber = 4;
	
	@Before
	public void initQueus(){
		firstNumber = 3;
		secondNumber = 4;
		anyNumber = 5;
		queues = new Queues();
	}
		
	@Test
	public void pushDataSizeIncreaseByOne() {
		int queuesSize = queues.getSize();
		queues.push(anyNumber);
		assertEquals(queuesSize+1, queues.getSize());
	}
	
	@Test
	public void popDataSizeDecreaseByOne() {
		queues.push(anyNumber);
		queues.push(anyNumber);
		queues.push(anyNumber);
		int queuesSize = queues.getSize();

		queues.pop();
		assertEquals(queuesSize-1, queues.getSize());
	}
	
	@Test
	public void firstInFirstOut() {
		queues.push(firstNumber);
		queues.push(secondNumber);
		
		assertEquals(firstNumber, queues.pop());
		assertEquals(secondNumber, queues.pop());
	}
	
	@Test (expected=EmptyQueue.class)
	public void whenQueueHaveEmpty() {
		queues.pop();
	}
}
