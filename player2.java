package snakeladder;


public class player2 {
	public static final int finalposition = 100;
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int position1=0,position2=0;
				int count=1;
				while(position1<finalposition || position2<finalposition) {
					count++;
				int player1=(int)Math.floor(Math.random()*10)%3;
				int player2=(int)Math.floor(Math.random()*10)%3;
				int roll1=(int)Math.floor(Math.random()*10)%6;
				int roll2=(int)Math.floor(Math.random()*10)%6;
				
				if(player1==1) {
					
					position1 = position1 + roll1;
				}
				else if(player1==2) {
					position1 = position1 - roll1;
				}
				if(position1 > 100) {
					position1=position1-roll1;
				}
				
				if(player2==1) {
					
					position2 = position2 + roll2;
				}
				else if(player2==2) {
					position2 = position2 - roll2;
				}
				if(position2 > 100) {
					position2=position2-roll2;
				}
				System.out.println(position1);
				System.out.println(position2);
			}
				System.out.println(count);

		}
}