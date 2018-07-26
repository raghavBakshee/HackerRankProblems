
public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] A = {{1,2, 3},{4, 5, 6},{ 7 ,8, 9},{ 7 ,8, 9}};
		
		spiralOrder(A);

	}
	
	 public static void spiralOrder(int[][] A) {
	     int T=0,L=0;
		 int B= A.length -1;
		 int R = A[0].length -1;
		 
		 int dir=0; 
		
		
		 while(T<=B && L<=R){
			 if(dir==0){
				 for(int i=L; i<=R;i++)System.out.println(A[T][i]);
					 T++;
					 				 
				 }
				 
			 
			 else if(dir==1){
				 for(int i=T;i<=B;i++)System.out.println(A[i][R]);
					 R--;
					 
				 }
			  
			 
			 else if(dir==2){
				 for(int i=R;i>=L;i--)System.out.println(A[B][i]);
					 B--;
					 
				 }
			 			 
			 else if(dir==3){
				 for(int i=B;i>=T;i--)System.out.println(A[i][L]);
					 L++;
				 }
			 
			 		 
		 dir=(dir+1)%4;
	 }

}
}
