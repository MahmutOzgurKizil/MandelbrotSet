public class MandelbrotSet{
	public static void main(String[] args){
		
		
		Complex[][] complexField= new Complex[161][161];
		int[][] evaluatedField= new int[161][161];
		
		for(int i = 0; i<=160; i++){
			for(int j = 0; j<=160;j++){
				complexField[i][j]= new Complex((double)i/40-2,(double)j/40-2);
			}
		}
		
				
		for(int k = 0; k<=160; k++){
			for(int l = 0; l<=160;l++){
				if(itiration(complexField[k][l],500).distanceToZero()>=2){
					evaluatedField[k][l]=0;
				}else{
					evaluatedField[k][l]=1;
				}
			}
		}
		
				
		for(int k = 0; k<=160; k++){
			for(int l = 0; l<=160;l++){
				if(evaluatedField[l][k]==0){
					System.out.print(" ");
				}
				else{
					System.out.print("l");
				}
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