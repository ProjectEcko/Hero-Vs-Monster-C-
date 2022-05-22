
class Triangle extends Shapes {
private double side3;
	public Triangle() {
        super();
	}
	public Triangle(double side1, double side2) {
		super(side1,side2);
	}
	public double getside3() {
		return side3;
	}
	public void setside3(double side3) {
		this.side3 = side3;
	}
	public double calcarea() {
		double num = calcpermimter()/2;
		double num1 = (num-getside1())*(num-getside2())*(num-getside3())*num;
		num1 = Math.sqrt(num1);
		return num1;
	}
	public double calcpermimter() {
		return side3+super.calcpermimter();
	}
	public String toString() {
		return "Trainagle Width "+getside1()+ " Height "+getside2()+ " Length "+getside3()+" Permimter "+calcpermimter()+" Area "+calcarea();
	}

}
