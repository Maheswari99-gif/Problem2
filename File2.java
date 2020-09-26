public class File2{
public static void main(String[] args){
int PLAYER_POSITION=0,option=0,count=0;
while(PLAYER_POSITION<100){
count++;
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
System.out.println("Current position: "+PLAYER_POSITION);
}
while(PLAYER_POSITION!=100 && option==1);
}
}
}
