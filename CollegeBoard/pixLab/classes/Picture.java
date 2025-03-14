import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void zeroGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
      }
    }
  }
  
  public void zeroRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
      }
    }
  }
  
  public void onlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  public void onlyRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  public void onlyGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setBlue(0);
      }
    }
  }
  public void grayScale() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray) {
			  int avg = (pixelObj.getBlue()+pixelObj.getRed()+pixelObj.getGreen())/3;
			  pixelObj.setBlue(avg);
			  pixelObj.setGreen(avg);
			  pixelObj.setRed(avg);
		  }
	  }
  }
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(255-pixelObj.getRed());
	        pixelObj.setBlue(255-pixelObj.getBlue());
	        pixelObj.setGreen(255-pixelObj.getGreen());
	      }
	    }
  }
  public void waterRemove() {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed((int) (pixelObj.getRed()*1.5));
	        pixelObj.setBlue((int) (pixelObj.getBlue()*.3));
	        pixelObj.setGreen((int) (pixelObj.getGreen()*.3));
	      }
	    }
  }
  public void mirrorHorizon() {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int height = pixels.length;
	    for (int col = 0; col < pixels.length; col++)
	    {
	      for (int row = 0; row < pixels[0].length / 2; row++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][height - 1 - col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    } 
  }
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  public void mirrorDiag(){  
    Pixel[][] pixels = this.getPixels2D();  
    Pixel topPixel = null;  
    Pixel botPixel = null;  
    for (int row = 0; row < pixels[0].length && row < pixels.length; row++)  {
      for (int col = row + 1; col < pixels[0].length && col < pixels.length; col++)    {     
        topPixel = pixels[row][col];      
        botPixel = pixels[col][row];      
        topPixel.setColor(botPixel.getColor());    
      }  
    }
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/flower1.jpg");
    Picture flower2 = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    this.mirrorVertical();

    this.copy(flower1,300,0);
    this.copy(flower2,400,0);
    this.mirrorVertical();


    this.copy(flower2,0,100);
    this.copy(flower1,0,200);
    this.copy(flower2,0,300);
    this.copy(flower1,0,400);

    this.copy(flower2,400,100);
    this.copy(flower1,400,200);
    this.copy(flower2,400,300);
    this.copy(flower1,400,400);
    
    this.write("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void flip() {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    for (int col = 104; col < 307; col++)
	    {
	      for (int row = 163; row < 196; row++)
	      {
	        topPixel = pixels[row][col];
	        bottomPixel = pixels[196 - (row - 196)][col];
	        bottomPixel.setColor(topPixel.getColor());
	      }
	    }
  }

  public void newCollage()
  {
    Picture flower1 = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/flower1.jpg");
    Picture flower2 = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/flower2.jpg");
    this.copy(flower2,0,100);
    this.copy(flower1,0,200);
    this.copy(flower2,0,300);
    this.copy(flower1,0,400);
    this.copy(flower2,0,500);
    this.mirrorHorizon();

    this.write("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/collage.jpg");
  }
    public void newCollage2()
    {
        Picture flower1 = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/flower2.jpg");
    Picture flower2 = new Picture("C:/Users/gronk/OneDrive/Desktop/AP-CS/CollegeBoard/pixLab/images/flower2.jpg");
        this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    this.copy(flower2,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    }
  
    public void chromaKey(Picture background) {
      Pixel[][] pixels = this.getPixels2D();
      Pixel[][] bgPixels = background.getPixels2D();
  
      for (int row = 0; row < pixels.length; row++) {
          for (int col = 0; col < pixels[0].length; col++) {
              Pixel pixel = pixels[row][col];

              // Check if the pixel is pure blue
              if (pixel.getBlue() >= 10 && pixel.getRed()<=25) {
                  // Replace with the corresponding background pixel
                  pixel.setColor(bgPixels[row % bgPixels.length][col % bgPixels[0].length].getColor());
              }
          }
      }

  }
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    //Picture beach = new Picture("beach.jpg");
    //beach.explore();
    //beach.zeroBlue();
    //beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
