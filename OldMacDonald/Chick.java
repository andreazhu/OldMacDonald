
class Chick implements Animal
{     
     private String myType, mySound;
     public Chick()
     {
       myType = "Chick";
       mySound = "cluck!";
     }
     
     public String getType()
     {
       return myType;
     }
     
     public String getSound()
     {
       return mySound;
     }
}
