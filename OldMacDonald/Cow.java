
class Cow implements Animal
{     
     private String myType, mySound;
     public Cow()
     {
       myType = "Cow";
       mySound = "mooooooooooo!";
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
