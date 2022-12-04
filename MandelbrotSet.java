public class MandelbrotSet{
	public static void main(String[] args){
		
		
		Complex[][] complexField= new Complex[201][201];
		int[][] evaluatedField= new int[201][201];
		
		for(int i = 0; i<=200; i++){
			for(int j = 0; j<=200;j++){
				complexField[i][j]= new Complex((double)i/50-2,(double)j/50-2);
			}
		}
		
				
		for(int k = 0; k<=200; k++){
			for(int l = 0; l<=200;l++){
				if(itiration(complexField[k][l],500).distanceToZero()>=2){
					evaluatedField[k][l]=0;
				}else{
					evaluatedField[k][l]=1;
				}
			}
		}
		
				
		for(int k = 0; k<=200; k++){
			for(int l = 0; l<=200;l++){
				if(evaluatedField[l][k]==0){
					System.out.print(" ");
				}
				else{
					System.out.print("ğ");
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