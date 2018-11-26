class Chick implements Animal
{     
     private String myType;
     private String[] mySound;
     public Chick()
     {
       myType = "Chick";
       mySound = new String[2];
       mySound[0] = "peep!";
       mySound[1] = "cluck!";
     }
     
     public String getType()
     {
       return myType;
     }
     
     public String getSound()
     {
       if ((int)(Math.random()*2) == 0)
       {
         return mySound[0];
       } else {
         return mySound[1];
       }
     }
}
