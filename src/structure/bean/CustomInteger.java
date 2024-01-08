package structure.bean;

public class CustomInteger {
    public int value;
	
	// constructor >> return this
	public CustomInteger(int param) {
		this.value = param;
	}
	
	@Override
	public String toString() {
		return "" + this.value;
	}
}
