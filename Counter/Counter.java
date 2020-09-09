package Counter;


public class Counter {

	StringBuilder bulder;
	int tally=0;
	String id;
	
	public Counter(String id) {
		
		tally=0;
		this.id = id;
		bulder = new StringBuilder();
		
	}
	public void increment() {
		tally++;
	}
	
	public int tally() 
	{
		
		return tally;
	}
	
	public String toString() {
		
		
		return bulder.append(tally).append(" ").append(id).toString();
	}
}
