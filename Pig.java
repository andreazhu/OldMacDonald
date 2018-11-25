class Pig implements Animal
{     
     private String myType, mySound;
     public Pig()
     {
       myType = "Pig";
       mySound = "oink!";
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
