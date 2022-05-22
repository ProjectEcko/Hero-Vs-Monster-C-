
public class Shapes {
private double side1, side2;
public Shapes() {
	
}
public Shapes(double side1, double side2) {
setside1(side1);
setside2(side2);
}
public double getside1() {
	return side1;
}
public double getside2() {
	return side2;
}
public void setside1(double side1) {
	this.side1 = side1;
}
public void setside2(double side2) {
	this.side2 = side2;
}
public double calcarea() {
	return side1*side2;
}
public double calcpermimter() {
	return side1+side2;
}
public String toString() {
	return "Side 1 " + getside1()+ "Side 2 "+getside2()+ "Area "+calcarea()+" Permimter "+calcpermimter();
}
}
