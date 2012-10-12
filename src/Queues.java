import java.util.ArrayList;

public class Queues {	
	
	ArrayList<Integer> dataQueus = new ArrayList<Integer>();
	
	public int getSize(){
		return dataQueus.size();
	}
	
	public void push(int data){
		dataQueus.add(data);
	}
	
	public int pop() {
		if(dataQueus.size() == 0)
			throw new EmptyQueue();
		
		int popValue = dataQueus.get(0);
		dataQueus.remove(0);
		return popValue;
	}
	
}
