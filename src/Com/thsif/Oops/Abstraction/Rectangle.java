package Com.thsif.Oops.Abstraction;

public class Rectangle {

	private float width, height;

	public Rectangle() {
		this.width = 5.0f;
		this.height = 2.0f;
	}

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	void calArea() {
		float area = width*height;		
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}
	

}
