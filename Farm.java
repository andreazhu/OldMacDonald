class Farm 
{     
   private Animal[] animals; 
   public Farm()
   {
     animals = new Animal[3];
     animals[0] = new Cow();
     animals[1] = new Chick();
     animals[2] = new Pig();
   }
   
   public void animalsSounds()
   {
     for(int i = 0; i < animals.length; i++)
     {
       System.out.println(animals[i].getType() + " goes " + animals[i].getSound());
     }
   }
}
