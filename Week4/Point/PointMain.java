package ders;

public class PointMain {
	public static void main(String []args) {
		
		Point p1=new Point(7, 2);
		
		Point p2=new Point(4, 3);
		
		//p1(7,2) origine uzakl���:
		
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orijine uzakl���: "+p1.distanceFromOrigin());
		
		System.out.println("p2("+p2.getX()+","+p2.getY()+")");
		System.out.println("orijine uzakl���: "+p2.distanceFromOrigin());
		
		
		p1.translate(11, 6);
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orijine uzakl���: "+p1.distanceFromOrigin());
		
		System.out.println("p1 is "+p1); //(x,y)
		System.out.println();
		

		
		
		}

	

	}


