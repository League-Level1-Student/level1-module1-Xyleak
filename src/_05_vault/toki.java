package _05_vault;

public class toki {

	
	public static void main(String[] args) {
	
		gin hi = new gin();
		toki bye = new toki();
		
		
		
		System.out.println("Found Code "+bye.findCode(hi));
		
		
		
		
		
	}
	
int findCode(gin g) {	
for (int q = 0; q <100000000; q++) {

	if(g.tryCode(q)){
		
		return q;
		
	}
	
	
}
	return -1;
	
}
}
