public class Complex{
	private double num;
	private double complex;
	
	public Complex(double a, double b){
		num = a;
		complex = b;
	}
	
	public void setNum(double a){ num = a; }
	public void setComplex(double b){ complex = b; }
	public double getNum(){return num;}
	public double getComplex(){return complex;}
	
	public double distanceToZero(){
		return Math.sqrt(Math.pow(getNum(),2)+Math.pow(getComplex(),2));
	}
	
	public Complex squareComplex(){
		
		Complex i = new Complex(getNum(),getComplex());
		i.setNum(Math.pow(getNum(),2)+(-1)*Math.pow(getComplex(),2));
		i.setComplex(getNum()*getComplex()*2);
		return i;
		
	}
	
}