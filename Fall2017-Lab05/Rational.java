
public class Rational {

	//DATA FIELDS SHOULD GO UP HERE
	private int x,y;
	
	//Constructor
	public Rational(int numerIn, int denomIn) {
		//Remove the below line when you are ready to implement this method.
		x=numerIn;
		y=denomIn;
		
	}
	
	
	
	
	//Getters
	public int getNumer() {
		//Remove the below line when you are ready to implement this method.
		return x; 
	}
	
	public int getDenom() {
		//Remove the below line when you are ready to implement this method.
		return y;
	}
	
	
	
	
	
	
	public String toString() {
		//Remove the below line when you are ready to implement this method.
		String a = new String(x + "/" + y);
		return a;
	}
	
	
	
	

	public static Rational multiply(Rational a, Rational b) {
		//Remove the below line when you are ready to implement this method.
		int c = a.getNumer()*b.getNumer();
		int d = a.getDenom()*b.getDenom();
		Rational n = new Rational(c,d);
		return n;
	}
	
	
	
	
	
	public Rational reciprocal() {
		//Remove the below line when you are ready to implement this method.
		Rational r = new Rational(y,x);
		return r;
	}
	
	public Rational divide(Rational a) {
		//Remove the below line when you are ready to implement this method.
		Rational e = new Rational(a.getDenom(),a.getNumer());
		Rational d = new Rational(x,y);
		Rational s = multiply(d,e);
		return s;
	}
	
	public Rational add(Rational a) {
		//Remove the below line when you are ready to implement this method.
		Rational z = new Rational(x,y);
		int top = z.getNumer()*a.getDenom() + z.getDenom()*a.getNumer();
		int bot = z.getDenom()*a.getDenom();
		Rational r = new Rational(top,bot);
		return r;
		
	}
	
	
	//NOTE: We are not writing an equals method for this class at this time.
	//      For this reason, do not use assertEquals to try to test whether
	//      two Rational objects are equal in value.
	
}
