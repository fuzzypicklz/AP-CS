package UsefulPractice.Inheritance.Book23;

public class Dictionary3 extends Book2
{
   private int definitions;
    private int pics;
   public Dictionary3 (int numPages, int numDefinitions, int numPics)
   {
      super (numPages);
        pics = numPics;
      definitions = numDefinitions;

   }

   public void definitionMessage ()
   {
      System.out.println ("Number of definitions: " + definitions);

      System.out.println ("Definitions per page: " + definitions/pages);
   }

   public void picMessage(){
    System.out.println("number of pictures: " + pics);

      System.out.println("pics per page: "+pics/pages);
   }
}
