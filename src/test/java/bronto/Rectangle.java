package bronto;

public class Rectangle {
	
	 private int length;
	 private int breadth;
	
	 
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	//contructor 
	Rectangle () {
		this.length = 0;
		this.breadth = 0;
	}
	
	Rectangle (int l, int b) {
		this.length = l;
		this.breadth = b;
	}
	
	
	
	void parameter (int l, int b) {
		System.out.println(2*l + 2*b);
	}
	
	void parameter () {
		System.out.println(2*this.length + 2*this.breadth);
	}
	
	int area (int l, int b) {
		return l*b;
	}

}
