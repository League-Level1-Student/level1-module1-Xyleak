package _05_vault;

import java.util.Random;

public class gin {

	int secretCode;
	
	gin(){
	
		secretCode = new Random().nextInt(1000000);
	}
	
	
	
	boolean tryCode(int Cod) {
	if(Cod == secretCode) {
	return true;
	}	
	else {	
	return false;
	}
	}
	
	
	
	
	
	
	
	
}