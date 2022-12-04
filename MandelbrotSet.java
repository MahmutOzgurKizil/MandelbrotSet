public class MandelbrotSet{
	public static void main(String[] args){
		
		
		Complex[][] complexField= new Complex[81][81];
		Complex nullPointer = new Complex(0,0);
		for(int k = 0; k<=80; k++){
			for(int l = 0; l<=80;l++){
				complexField[k][l]=nullPointer;
			}
		}
		
		int[][] evaluatedField= new int[81][81];
		
		
		
		for(int k = 0; k<=80; k++){
			for(int l = 0; l<=80;l++){
				
				complexField[k][l].setNum((double)k/20-2);
				complexField[k][l].setComplex((double)l/20-2);
			//	System.out.println(complexField[k][l].getComplex());
			}
		}
		
		System.out.println(complexField[60][50].getNum());
		System.out.println(complexField[60][50].getComplex());
				
		for(int k = 0; k<=80; k++){
			for(int l = 0; l<=80;l++){
				if(itiration(complexField[k][l],50).distanceToZero()>=2){
					evaluatedField[k][l]=0;
				}else{
					evaluatedField[k][l]=1;
				}
			}
		}
	/*			
		for(int k = 0; k<=80; k++){
			for(int l = 0; l<=80;l++){
				System.out.print(evaluatedField[k][l]);
			}
			System.out.println();
		}
		
		*/
		
	}
	
	public static Complex itiration(Complex a, int n){
		Complex fzero= new Complex(0,0);
		
		for(int i=0;i<=n;i++){
			if(fzero.distanceToZero()>2){break;}
			fzero=fzero.squareComplex();
			fzero.setNum(fzero.getNum()+a.getNum());
			fzero.setComplex(fzero.getComplex()+a.getComplex());
			
			
		}
		
		return fzero;
		
	}
}