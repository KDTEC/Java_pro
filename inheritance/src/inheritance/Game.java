package inheritance;
import java.util.*;
public class Game {
	public static void main(String args[])
	{
		   Scissor s1=new Scissor(5);
		   Paper p1=new Paper(7);
		   Rock r1=new Rock(15);
		   s1.fight(p1) ;
		   p1.fight(s1) ;
		   p1.fight(r1) ;
		   r1.fight(p1) ;
		   r1.fight(s1);
		   s1.fight(r1);
	}
}

class Tool
{
  int strength;
  char type;
  Tool(int strength)
  {
    this.strength=strength;
  }

 

  public void fight(Tool t)
  {
      if(this.type=='r')
      {
         if(t.type=='s')
         {
            int s=this.strength*2;
            System.out.println((s>t.strength)?true:false);
         }
         else{ 
             int s=this.strength/2;
             System.out.println((s>t.strength)?true:false);
         }
      }
      else if(this.type=='p')
      {
         if(t.type=='r')
         {
            int s=this.strength*2;
            System.out.println((s>t.strength)?true:false);
         }
         else{ int s=this.strength/2; System.out.println((s>t.strength)?true:false);}
      }

 

      else
      {
         if(t.type=='p')
         {
            int s=this.strength*2;
            System.out.println((s>t.strength)?true:false);
         }
         else{ int s=this.strength/2; System.out.println((s>t.strength)?true:false);}
      }        
   }
}

 

class Rock extends Tool
{
  Rock(int strength)
  {
    super(strength);
    this.type='r';
  }
}

 

class Paper extends Tool
{
  Paper(int strength)
  {
    super(strength);
    this.type='p';
  }
}

 

class Scissor extends Tool
{
  Scissor(int strength)
  {
    super(strength);
    this.type='s';
  }
}