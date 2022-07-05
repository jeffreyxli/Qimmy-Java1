package p5_cubicpoly;

import p5_utility.DoubleWithAppx;

/**
 * A general representation of a Cubic polynomial of the form:
 *     (a*x^3 + b*x^2 + c*x + d)
 * 
 * @author Jeffrey Li
 * @date October-November 2017
 */

public class CubicPoly {
	private final DoubleWithAppx a;
	private final DoubleWithAppx b;
	private final DoubleWithAppx c;
	private final DoubleWithAppx d;
	
	public static DoubleWithAppx ZERO = new DoubleWithAppx(0);
	
	public CubicPoly() {
		a = ZERO;
		b = ZERO;
		c = ZERO;
		d = ZERO;
	}

	public CubicPoly(DoubleWithAppx dIn) {
		a = ZERO;
		b = ZERO; 
		c = ZERO;
		d = dIn;
	}

	public CubicPoly(DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a = ZERO;
		b = ZERO;
		c = cIn;
		d = dIn;
	}

	public CubicPoly(DoubleWithAppx bIn, DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a = ZERO;
		b = bIn;
		c = cIn;
		d = dIn;
	}
	
	public CubicPoly(DoubleWithAppx aIn, DoubleWithAppx bIn, DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a = aIn;
		b = bIn;
		c = cIn;
		d = dIn;
	}
	
	public CubicPoly(CubicPoly other) {
		a = other.getA();
		b = other.getB();
		c = other.getC();
		d = other.getD();
	}
	
	public DoubleWithAppx getA() {
		return a;
	}
	
	public DoubleWithAppx getB() {
		return b;
	}
	
	public DoubleWithAppx getC() {
		return c;
	}
	
	public DoubleWithAppx getD() {
		return d;
	}
	
	
	
	
	
	public DoubleWithAppx eval(DoubleWithAppx x) {
		return a.multiply(x.power(3)).add(b.multiply(x.power(2)).add(c.multiply(x)).add(d));
		//HINT: Think about how to chain method calls to make this compact. 
	}
	
	
	public CubicPoly add(CubicPoly cubicPolyIn) {
		DoubleWithAppx newA = this.a.add(cubicPolyIn.getA());
		DoubleWithAppx newB = this.b.add(cubicPolyIn.getB());
		DoubleWithAppx newC = this.c.add(cubicPolyIn.getC());
		DoubleWithAppx newD = this.d.add(cubicPolyIn.getD());
		CubicPoly newCubic = new CubicPoly(newA, newB, newC, newD);
		return newCubic;
	}

	public CubicPoly subtract(CubicPoly cubicPolyIn) {
		DoubleWithAppx newA = this.a.subtract(cubicPolyIn.getA());
		DoubleWithAppx newB = this.b.subtract(cubicPolyIn.getB());
		DoubleWithAppx newC = this.c.subtract(cubicPolyIn.getC());
		DoubleWithAppx newD = this.d.subtract(cubicPolyIn.getD());
		CubicPoly newCubic = new CubicPoly(newA, newB, newC, newD);
		return newCubic;
	}



	public CubicPoly mult(CubicPoly cubicPolyIn) {
		DoubleWithAppx e = cubicPolyIn.getA();
		DoubleWithAppx f = cubicPolyIn.getB();
		DoubleWithAppx g = cubicPolyIn.getC();
		DoubleWithAppx h = cubicPolyIn.getD();
		DoubleWithAppx first = this.a.multiply(e);
		DoubleWithAppx second = this.a.multiply(f).add(this.b.multiply(e));
		DoubleWithAppx third = this.a.multiply(g).add(this.b.multiply(f)).add(this.c.multiply(e));
		DoubleWithAppx fourth = this.a.multiply(h).add(this.b.multiply(g)).add(this.c.multiply(f)).add(this.d.multiply(e));
		DoubleWithAppx fifth = this.b.multiply(h).add(this.c.multiply(g)).add(this.d.multiply(f));
		DoubleWithAppx sixth = this.c.multiply(h).add(this.d.multiply(g));
		if(first.equals(ZERO) && second.equals(ZERO) && third.equals(ZERO))
		{
			return new CubicPoly(fourth, fifth, sixth, this.d);
		}
		else
		{
			return null;
		}
	}

	
	
	
	public CubicPoly deriv() {
		DoubleWithAppx three = new DoubleWithAppx(3.0);
		DoubleWithAppx two = new DoubleWithAppx(2.0);
		return new CubicPoly(ZERO, this.a.multiply(three), this.b.multiply(two), this.c);
	}


	
	public int compareTo(CubicPoly cubicPolyIn) {
		
		if(this.a.compareTo(cubicPolyIn.getA()) > 0)
		{
			return 1;
		}
		else if(this.a.compareTo(cubicPolyIn.getA()) < 0)
		{
			return -1; 
		}
		else if(this.b.compareTo(cubicPolyIn.getB()) > 0)
		{
			return 1;
		}
		else if(this.b.compareTo(cubicPolyIn.getB()) < 0)
		{
			return -1; 
		}
		else if(this.c.compareTo(cubicPolyIn.getC()) > 0)
		{
			return 1;
		}
		else if(this.c.compareTo(cubicPolyIn.getC()) < 0)
		{
			return -1; 
		}
		else if(this.d.compareTo(cubicPolyIn.getD()) > 0)
		{
			return 1;
		}
		else if(this.d.compareTo(cubicPolyIn.getD()) < 0)
		{
			return -1; 
		}
		else 
		{
			return 0; 
		}
	}

	
	
	//Challenge Problem
    public String toString() { 
    	return "a:"+a+", b:"+b+", c:"+c+", d:"+d;
		//You only need to implement this for a challenge.
    } 
	

	
    
    
    
    
    
    
	
	
	
	
	//NOTE: THIS JAVA EQUALS METHOD IS WRITTEN FOR YOU - DO NOT CHANGE
	@Override
	public boolean equals (Object other) {
		if (other == null) {
			return false;
		}
		else if (this.getClass()!=other.getClass()) {
			return false;
		}
		else {
			CubicPoly casted = (CubicPoly)other;
			return (
					a.equals(casted.a) && 
					b.equals(casted.b) && 
					c.equals(casted.c) && 
					d.equals(casted.d)
			);
		}
	}
	
	
}