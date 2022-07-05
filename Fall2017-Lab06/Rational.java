

//Don't forget to start off by copying the contents of any methods that
//   do not need to change from your Lab05 to this Lab06.



public class Rational {
    //Make sure the instance fields you add up here for numerator and denominator 
	//  are private and final.
	
	final private int numer;
	final private int denom;
	
	public Rational(int numerIn, int denomIn) {
		//Should be able to use your Lab05 code.
		if(denomIn==0)
		{
			throw new ArithmeticException("Divide by Zero");
		}	
		numer=numerIn;
		denom=denomIn;
	}
	
	//The new single-argument constructor.
	public Rational(int numerIn) {
		//Remove the below line when you are ready to implement this method.
		numer=numerIn;
		denom=1;
	}

	//The new copy constructor.
	public Rational(Rational other) {
		//Remove the below line when you are ready to implement this method.
		this.numer=other.numer;
		this.denom=other.denom;
	}
	
	public int getNumer() {
		//Should be able to use your Lab05 code.
		return numer;
	}
	
	public int getDenom() {
		//Should be able to use your Lab05 code.
		return denom;
	}
	
	public String toString() {
		//Should be able to use your Lab05 code.
		String a = new String(numer + "/" + denom);
		return a;
	}
	
	public Rational reciprocal() {
		//Remove the below line when you are ready to implement this method.
		Rational r = new Rational(denom,numer);
		if(numer==0)
		{
			throw new ArithmeticException("Divide by Zero");
		}
		return r;
	}
	

	public static Rational multiply(Rational first, Rational second) {
		//Should be able to use your Lab05 code.
		int c = first.getNumer()*second.getNumer();
		int d = first.getDenom()*second.getDenom();
		Rational n = new Rational(c,d);
		return n;
	}
	
	//The new instance multiply method.
	public Rational multiply(Rational otherRational) {
		//Remove the below line when you are ready to implement this method.
		int c = numer*otherRational.getNumer();
		int d = denom*otherRational.getDenom();
		if(d==0)
		{
			throw new ArithmeticException("Divide by Zero");
		}
		Rational n = new Rational(c,d);
	
		return n;
		
	}
	
	public Rational divide(Rational otherRational) {
		//Should be able to use your Lab05 code.
		Rational e = new Rational(otherRational.getDenom(),otherRational.getNumer());
		Rational d = new Rational(numer,denom);
		Rational s = multiply(d,e);
		return s;
	}
	
	public Rational add(Rational otherRational) {
		//Should be able to use your Lab05 code.
		Rational z = new Rational(numer,denom);
		int top = z.getNumer()*otherRational.getDenom() + z.getDenom()*otherRational.getNumer();
		int bot = z.getDenom()*otherRational.getDenom();
		Rational r = new Rational(top,bot);
		return r;
	}
	
	//The new subtract method.
	public Rational subtract(Rational otherRational) {
		//Remove the below line when you are ready to implement this method.
		Rational z = new Rational(numer,denom);
		int top = z.getNumer()*otherRational.getDenom() - z.getDenom()*otherRational.getNumer();
		int bot = z.getDenom()*otherRational.getDenom();
		if(bot==0)
		{
			throw new ArithmeticException("Divide by Zero");
		}
		Rational r = new Rational(top,bot);
		
		return r;
	}
}
