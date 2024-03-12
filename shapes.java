
	public class shapes {
	void perimeter() {
		System.out.println("The perimeter function from the parent class");
	}
		public class Circle extends shapes{
			double perimeter (double radius) {
				double periCircle = 2*3.14*radius;
				return periCircle;
			}
		}
		public class Square extends shapes{
			double perimeter (double sides) { 
				double periSquare = 4* sides;
				return periSquare;
		}
	}
			
		public class Rectangle extends shapes{
			double perimeter(double length, double width) {
				double periRectangle = 2*(length + width);
				return periRectangle;
			}
		}
		public static void main1(String[] args) {	
			shapes object1 = new shapes();
			object1.perimeter();
			Circle object2=object1.new Circle();
			System.out.println("\nThe perimeter of the circle of radius 6.44cm");
			System.out.print(object2.perimeter(6.44));
			Square object3 =object1.new Square();
			System.out.println("\n\n The perimeter of the square of sides 8cm");
			System.out.print(object3.perimeter(8));
			Rectangle object4 =object1.new Rectangle();
			System.out.println("\n\n The perimeter of the rectangleof length 4.41cm and width 6.23cm");
			System.out.print(object4.perimeter(4.41, 6.23 ));
		}
		
	}


