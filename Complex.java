public class Complex{
	private double num;
	private double complex;
	
	public Complex(double a; double b){
		num = a;
		complex = b;
	}
	
	public void setNum(double a){ num = a; }
	public void setComplex(double a){ complex = a; }
	public double getNum(){return num;}
	public double getComplex(){return complex;}
	
	public double distanceToZero(){
		return Math.sqrt(Math.pow(getNum(),2)+Math.pow(getComplex(),2));
	}
	
	
	
	
}