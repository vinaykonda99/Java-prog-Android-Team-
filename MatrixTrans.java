public class MatrixTrans{ 

public static void main(String args[]){  
  
int arr[][]={{10,20,30},{40,50,60},{70,80,90}};    
    
		System.out.println("Matrix before transpose:");

	for(int i=0; i<=2; i++){    
		for(int j=0; j<=2; j++){ 

			System.out.print(arr[i][j]+" ");    
		}    
		
		System.out.println();    
	} 
		System.out.println("Matrix after transpose:");  
	
	for(int i=0; i<=2; i++){    
		for(int j=0; j<=2; j++){    
			System.out.print(arr[j][i]+" ");    
			}    

			System.out.println();    
		}    
	}
}  