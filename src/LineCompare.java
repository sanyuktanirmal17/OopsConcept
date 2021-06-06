
public class LineCompare {

		public static double dist(int a, int b, int a1, int b1) {
			double length;
			length = Math.sqrt(Math.pow((a1 - a), 2) + Math.pow((b1 - b), 2));
			return length;

		}

		void checkLength() {
			double line1 = dist(1, 2, 3, -4);
			double line2 = dist(1, 2, 3, -4);
			if (line1 == line2)
				System.out.println("Lines are equal");
			else
				System.out.println("Lines are not equal");
		}

		static class MainMethod {
			public static void main(String args[]) {
				{
					System.out.println("Welcome to line comparision Computation ");

					System.out.println(dist(1, 2, 3, -4));
				}
				LineCompare c1 = new LineCompare();
				c1.checkLength();
			}
		}
	}
}
