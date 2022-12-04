public class MandelbrotSet{
	public static viod main(String[] args){
		
		Complex[][] complexField= new Complex[81][81];
		int[][] evaluatedField= new int[81][81];
		
		for(double i = -2; i<=2;i+=0.05){
			for(double j = -2; j<=2;j+=0.05){
				for(int k = 0; k>=80; k++){
					for(int l = 0; l>=80 l++){
						complexField[k][l].setNum(i);
						complexField[k][l].setComplex(j);
					}
				}
		
			}
		}
		
		

				
		for(int k = 0; k>=80; k++){
			for(int l = 0; l>=80 l++){
				if(itiration(complexField[k][l])>2){
					evaluatedField[k][l]=0;
				}else{
					evaluatedField[k][l]=1;
				}
			}
		}
				
			
		
		
		
	
		
		
		
		
	}
	
	public static Complex itiration(Complex a, int n){
		if(a.distanceToZero()>2) return a;
		else if(n=1) return a;
		return itiration(a.squareComplex(),n-1);
		
	}
}