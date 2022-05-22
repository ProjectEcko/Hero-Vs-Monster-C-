
class Rectangle extends Shapes {

	public Rectangle() {
        super();
	}
	public Rectangle(double side1, double side2) {
		super(side1,side2);
	}
	public double calcarea() {
		return super.calcarea();
	}
	public double calcpermimter() {
		return 2*super.calcpermimter();
	}
	public String toString() {
		return "Rectangle Width "+getside1()+" Height "+getside2()+" Permimter "+calcpermimter()+" Area "+calcarea();
	}
}
