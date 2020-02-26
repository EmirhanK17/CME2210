package example2;

public class Main {
	
	public static void main(String[] args) {
		
		Point p1 = new Point(2, 1);
		Point p2 = new Point(6, 4);
		
		double eucDist = Math.sqrt(Math.pow(p1.getX()*p2.getX(), 2)+Math.pow(p1.getY()*p2.getY(), 2));
		
	}

}
