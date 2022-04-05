package snakeladder;

public class playornoplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position=0;
		
		int doornot=(int)Math.floor(Math.random()*10)%3;
		int roll=(int)Math.floor(Math.random()*10)%6;
		int temp=position;
		
		if(doornot==1) {
			
			position = position + roll;
		}
		else if(doornot==2) {
			position = position - roll;
		}
		System.out.println(position);
	}


}

