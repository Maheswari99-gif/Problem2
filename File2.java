public class File2{
public static void main(String[] args){
int PLAYER_POSITION=0,option=0,count=0,times=0;
while(PLAYER_POSITION<100){
count++;
do{
int rollDice=(int)(Math.random()*6)+1;
System.out.println("Dice Roll: "+rollDice);
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
times++;
if(PLAYER_POSITION<0)
PLAYER_POSITION=0;
if(PLAYER_POSITION>100)
PLAYER_POSITION=rollDice;
System.out.println("Current position: "+PLAYER_POSITION);
}
while(PLAYER_POSITION!=100 && option==1);
}
System.out.println("Times: "+times);
}
}
