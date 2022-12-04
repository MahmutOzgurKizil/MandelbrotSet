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
		
		int a=0;
		int b=0;
			
		
		for(int i = 0; i<=80; i++){
			for(int j = 0; j<=80;j++){
				
				complexField[i][j]= new Complex((double)i/20-2,(double)j/20-2);
			//	complexField[i][j].setComplex((double)j/20-2);
				
				//System.out.println(complexField[10][j].getComplex());
			}
			//System.out.println(complexField[i][0].getComplex());
		}
		
		//System.out.println(complexField[60][50].getNum());
		//System.out.println(complexField[63][56].getComplex()); 
		
				
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