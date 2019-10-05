package _99_extra;

public class PigAndCandy {
	
	
public static void main(String[] args) {
	Candy UwU = new Candy("idk",true);		
	Pig Bobe = new Pig("Bobe",true);
	Pig Rodger = new Pig("Rodger",true);
	Pig IGGY = new Pig("IGGYYYYY",true);
	}
}
	class Candy {
        private String maker;		//e.g. Hershey’s, Willy Wonka
        private boolean isChocolatey;
 
        
        
	
        public Candy(String maker,boolean isChocalatey) {
        
        this.maker = maker;
        this.isChocolatey = isChocolatey;
  }
        
	}
	
	
	
	
        class Pig {
            private String name;
            private boolean isSheepHerder;
            
				
			
            public Pig(String name, boolean canHerdSheep) {  
            	
            	this.name = name;
            	this.isSheepHerder = canHerdSheep;
            	
            	
            	//  write code here

            
            	
            	
            	
            }
            public boolean willBecomeBacon() {
                if(this.isSheepHerder)
                    return false;
                else 
                    return true;
                }
            }
       