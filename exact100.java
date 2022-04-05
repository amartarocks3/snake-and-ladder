package snakeladder;

public class exact100 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int position=0;
			while(position<100) {
			int doornot=(int)Math.floor(Math.random()*10)%3;
			int roll=(int)Math.floor(Math.random()*10)%6;
			int temp=position;
			
			if(doornot==1) {
				
				position = position + roll;
			}
			else if(doornot==2) {
				position = position - roll;
			}
			if(position > 100) {
				position=position-roll;
			}
			System.out.println(position);
			}

	}
	}

