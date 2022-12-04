public class MandelbrotSet{
	public static void main(String[] args){
		
		
		Complex[][] complexField= new Complex[81][81];
		int[][] evaluatedField= new int[81][81];
		
		for(int i = 0; i<=80; i++){
			for(int j = 0; j<=80;j++){
				complexField[i][j]= new Complex((double)i/20-2,(double)j/20-2);
			}
		}
		
				
		for(int k = 0; k<=80; k++){
			for(int l = 0; l<=80;l++){
				if(itiration(complexField[k][l],50).distanceToZero()>=2){
					evaluatedField[k][l]=0;
				}else{
					evaluatedField[k][l]=1;
				}
			}
		}
		
				
		for(int k = 0; k<=80; k++){
			for(int l = 0; l<=80;l++){
				System.out.print(evaluatedField[l][k]);
			}
			System.out.println();
		}
		
	
		
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