public class File2{
public static void main(String[] args){
int PLAYER_POSITION=0,option=0;
do{
int rollDice=(int)(Math.random()*6)+1;
option=(int)(Math.random()*3);
switch(option){
case 1:
PLAYER_POSITION+=rollDice;
System.out.println("Ladder"+PLAYER_POSITION);
break;
case 2:
PLAYER_POSITION-=rollDice;
System.out.println("Snake"+PLAYER_POSITION);
break;
default:
System.out.println("No Play"+PLAYER_POSITION);
}
if(PLAYER_POSITION<0)
PLAYER_POSITION=0;
}
while(PLAYER_POSITION==100);
}
}
