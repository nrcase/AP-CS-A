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
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
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
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testOnlyKeepBlue()
  {
      Picture flower1 = new Picture("flower1.jpg");
      flower1.keepOnlyBlue();
      flower1.explore();
    }
    
    public static void testNegate()
  {
      Picture flower1 = new Picture("flower1.jpg");
      flower1.negate();
      flower1.explore();
    }
    
    public static void testGrayscale()
  {
      Picture flower1 = new Picture("flower1.jpg");
      flower1.grayscale();
      flower1.explore();
    }
    
    public static void testFixUnderwater()
    {
     Picture water = new Picture("water.jpg");
     water.fixUnderwater();
     water.explore();
    }
    
    public static void testMirrorVerticalRighToLeft()
    {
        Picture flower1 = new Picture ("flower1.jpg");
        flower1.mirrorVerticalRightToLeft();
        flower1.explore();
    }
    
    public static void testMirrorHorizontal()
    {
        Picture flower2 = new Picture ("flower2.jpg");
        flower2.mirrorHorizontal();
        flower2.explore();
    }
    
    public static void testMirrorHorizontalBotToTop()
    {
     Picture snowman = new Picture ("snowman.jpg");
     snowman.mirrorHorizontalBotToTop();
     snowman.explore();
    }
    
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}