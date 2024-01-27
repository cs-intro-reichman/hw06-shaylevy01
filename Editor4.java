import java.awt.Color;

/**
 * Demonstrates the morphing operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, a black and white version of this PPM file of a source image , 
 * and the number of morphing steps (an int). 
 * For example, to morph the rhor into black and white thor in 50 steps, use:
 * java Editor4 thor.ppm 50
 */
public class Editor4 {

	public static void main (String[] args) {
		String image = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] Image = Runigram.read(image);
		Runigram.setCanvas(Image);
		Runigram.morph(Image, Runigram.grayScaled(Image), n);
	}
}
