package entities;


public class Course {

	private String name;
	private double price;
	private int categoryId;
	private int instructorId;

	public Course() {
		super();
	}

	public Course(String name, double price, int categoryId, int instructorId) {
		super();
		this.name = name;
		this.price = price;
		this.categoryId = categoryId;
		this.instructorId = instructorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

}
