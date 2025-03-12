/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/beach.jpg");
	    beach.explore();
	    beach.onlyBlue();
	    beach.explore();
  }
  
  public static void testKeepOnlyRed() {
	  Picture beach = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/beach.jpg");
	    beach.explore();
	    beach.onlyRed();
	    beach.explore();
  }
  
  public static void testKeepOnlyGreen() {
	  Picture beach = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/beach.jpg");
	    beach.explore();
	    beach.onlyGreen();
	    beach.explore();
  }
  
  public static void testNegate() {
	  Picture beach = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/caterpillar.jpg");
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testWaterRemove() {
	  Picture beach = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/water.jpg");
	  beach.explore();
	    beach.waterRemove();
	    beach.explore();
	  
  }
  public static void testZeroGreen(){
	  Picture beach = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/beach.jpg");
	  beach.explore();
	    beach.zeroGreen();
	    beach.explore();
  }
  public static void testZeroRed(){
	  Picture beach = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/beach.jpg");
	  beach.explore();
	    beach.zeroRed();
	    beach.explore();
  }
  public static void testMirrorhorizon()
  {
    Picture caterpillar = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/beach.jpg");
    caterpillar.mirrorHorizon();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/swan.jpg");
    swan.edgeDetection(30);
    swan.explore();
  }
  public static void testMirrorSnowman() {
	  Picture snow = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/snowman.jpg");
	    snow.flip();
	    snow.explore();
  }
  
  public static void testGrayscale() {
	  Picture beach = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/beach.jpg");
	    beach.explore();
	    beach.grayScale();
	    beach.explore();
  }

  public static void collage1() {
	  Picture pic = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/640x480.jpg");
    pic.createCollage();
    pic.explore();

  }
  public static void testMirrorDiag(){
    Picture snow = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/snowman.jpg");
	    snow.mirrorDiag();
	    snow.explore();
  }
  public static void testChromakey(){
    Picture moon = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/moon-surface.jpg");
    Picture guy = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/blue-mark.jpg");
    guy.explore();
    guy.chromaKey(moon);
    guy.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	//
	/*
    testZeroBlue();
    testZeroGreen();
    testZeroRed();
    testKeepOnlyBlue();
    testKeepOnlyRed();
    testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testWaterRemove();
    testEdgeDetection();
    testGrayscale();
    testMirrorVertical();
    testMirrorTemple();
    testMirrorSnowman();*//*
    collage1();
    testMirrorSnowman();
    testMirrorVertical();
    testMirrorhorizon();
    testMirrorDiag();*/
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    
    //testEdgeDetection2();
    testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}