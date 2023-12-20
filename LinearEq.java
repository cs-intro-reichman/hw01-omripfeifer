public class LinearEq{
	public static void main(String[] args){
		// define all  parשmetrs 
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        // define x 
        double x = 0.0;
        x = (c-b)/a;
        System.out.println(a + " * x + " + b + " = " + c  );
        System.out.println( "x = " + x );
	}
}
