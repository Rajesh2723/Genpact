class BreakInNestedForLoop{  
    public static void main(String[] args) {  
		
		label1:
		for(int i=1;i<=3;i++){
			
			label2:
			for(int j=1;j<=3;j++){  
				
				if(i==2&&j==2) {
					break label1;
				}
				
				System.out.println(i + " " + j);  
			}
			
			System.out.println("\n Outside inner loop");
		}  
		
		System.out.println("\n Outside outer loop");
    }  
}