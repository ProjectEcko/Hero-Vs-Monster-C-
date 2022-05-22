import java.util.Scanner;
import java.util.ArrayList;
public class Driver {

	public static void main(String[] args) {
		ArrayList<Object> shape = new ArrayList<Object>();
		Scanner scan = new Scanner(System.in);
		Rectangle sh1;
		Triangle sh2;
		double size;
		boolean on = true;
		while (on) {
			int choice;
			System.out.println("---Menu---");
			System.out.println("0 - Exit");
			System.out.println("1 - Add a Rectangle");
			System.out.println("2 - Add a Triangle");
			System.out.println("3 - Display all shapes with details ");
			System.out.println("Please choose an option ");
			choice = scan.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank you for trying my program ");
				on = false;
				break;
			case 1:
				sh1 = new Rectangle();
				System.out.println("Enter the frist side size ");
				size = scan.nextDouble();
				sh1.setside1(size);
				System.out.println("Enter the second side size ");
				size = scan.nextDouble();
				sh1.setside2(size);
				shape.add(sh1);
				System.out.println("Done creating Rectangle");
				break;
			case 2:
				sh2 = new Triangle();
				System.out.println("Enter the first side size ");
				size = scan.nextDouble();
				sh2.setside1(size);
				System.out.println("Enter the second side size ");				
				size = scan.nextDouble();
				sh2.setside2(size);
				System.out.println("Enter the third side size ");				
				size = scan.nextDouble();
				sh2.setside3(size);
				shape.add(sh2);
				System.out.println("Done creating Triangle");
				break;
			case 3:
				for(int i =0;i<shape.size();i++) {
					System.out.println(shape.get(i).toString());
				}
				break;
			default:
				System.out.println("Invalid Selction");
				break;
			}
		}
	}

}
