import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.Color;

/**
 *
 * @author Sango
 */
public class Model {

    public static void main(String[] args){
        System.out.println("Hola Mundo");

	Model m = new Model();
	BufferedImage imagen = m.readImage("GitGud.jpg");
	m.writeImage(imagen, "GittingGud", "jpg");


	int w = imagen.getWidth();
	int h = imagen.getHeight();
	
	BufferedImage newImage = new BufferedImage(imagen.getWidth(),imagen.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
	
	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
                	Color color = new Color(imagen.getRGB(i, j));
                	int red = color.getRed();
                	int green = color.getGreen();
                	int blue = color.getBlue();
			
			int ResultColor = (red + green + blue) / 3;

			newImage.setRGB(i,j, new Color(ResultColor, ResultColor, ResultColor).getRGB());
		} 
	}

	m.writeImage(newImage, "GetGud", "jpg");
	
	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
                	Color color = new Color(imagen.getRGB(i, j));
                	int red = color.getRed();
       
			newImage.setRGB(i,j, new Color(red, 0, 0).getRGB());
		} 
	}

	m.writeImage(newImage, "GetGudRed", "jpg");
	
	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
                	Color color = new Color(imagen.getRGB(i, j));
                	int green = color.getGreen();
       
			newImage.setRGB(i,j, new Color(0, green, 0).getRGB());
		} 
	}
	
	m.writeImage(newImage, "GetGudGreen", "jpg");
	
	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
                	Color color = new Color(imagen.getRGB(i, j));
                	int blue = color.getBlue();
       
			newImage.setRGB(i,j, new Color(0, 0, blue).getRGB());
		} 
	}
	
	m.writeImage(newImage, "GetGudBlue", "jpg");

	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
                	Color color = new Color(imagen.getRGB(i, j));
                	float floatRed = 0.393f;
			int Red = color.getRed();
			float resultRed = Red * floatRed;
			int intRed = (int)resultRed;

			
                	float floatGreen = 0.769f;
			int Green = color.getGreen();
			float resultGreen = Green * floatGreen;
			int intGreen = (int)resultGreen;
			
			
                	float floatBlue = 0.189f;
			int Blue = color.getBlue();
			float resultBlue = Blue * floatBlue;
			int intBlue = (int)resultBlue;
			
			int TotalRed = intRed + intGreen + intBlue;			
			
			float floatRed2 = 0.349f;
			int Red2 = color.getRed();
			float resultRed2 = Red2 * floatRed2;
			int intRed2 = (int)resultRed2;

			
                	float floatGreen2 = 0.686f;
			int Green2 = color.getGreen();
			float resultGreen2 = Green2 * floatGreen2;
			int intGreen2 = (int)resultGreen2;
			
			
                	float floatBlue2 = 0.168f;
			int Blue2 = color.getBlue();
			float resultBlue2 = Blue2 * floatBlue2;
			int intBlue2 = (int)resultBlue2;

			int TotalGreen = intRed2 + intGreen2 + intBlue2;

			float floatRed3 = 0.272f;
			int Red3 = color.getRed();
			float resultRed3 = Red3 * floatRed3;
			int intRed3 = (int)resultRed3;

			
                	float floatGreen3 = 0.534f;
			int Green3 = color.getGreen();
			float resultGreen3 = Green3 * floatGreen3;
			int intGreen3 = (int)resultGreen3;
			
			
                	float floatBlue3 = 0.131f;
			int Blue3 = color.getBlue();
			float resultBlue3 = Blue3 * floatBlue3;
			int intBlue3 = (int)resultBlue3;

			int TotalBlue = intRed3 + intGreen3 + intBlue3;
			
			if (TotalRed > 255)
                    		TotalRed = 255;
                	else
                    		TotalRed = intRed + intGreen + intBlue;
			
			if (TotalGreen > 255)
                    		TotalGreen = 255;
                	else
                    		TotalGreen = intRed2 + intGreen2 + intBlue2;

			if (TotalBlue > 255)
                    		TotalBlue = 255;
                	else
                    		TotalBlue = intRed3 + intGreen3 + intBlue3;

			newImage.setRGB(i,j, new Color(TotalRed, TotalGreen, TotalBlue).getRGB());
		} 
		
	}

	m.writeImage(newImage, "GetGudSepia", "jpg");

	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
                	Color color = new Color(imagen.getRGB(i, j));
			float floatRed = 65536;
                	int red = color.getRed();
			float resultRed = red * floatRed;
			int intRed = (int)resultRed;
			
			float floatGreen = 256;
                	int green = color.getGreen();
			float resultGreen = green * floatGreen;
			int intGreen = (int)resultGreen;

                	int blue = color.getBlue();
			
			if(intRed >= 8388608)
				intRed = 255;	
			else
				intRed = 0;
			
			if(intGreen >= 8388608)
				intGreen = 255;	
			else
				intGreen = 0;

			if(blue >= 8388608)
				blue = 255;	
			else
				blue = 0;

			int ResultColor = intRed + intGreen + blue;
			
			newImage.setRGB(i,j, new Color(ResultColor, ResultColor, ResultColor).getRGB());
		} 
		
	}

	m.writeImage(newImage, "GetGudHC", "jpg");

	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
                	Color color = new Color(imagen.getRGB(i, j));
			float floatRed = 65536;
                	int red = color.getRed();
			float resultRed = red * floatRed;
			int intRed = (int)resultRed;
			
			float floatGreen = 256;
                	int green = color.getGreen();
			float resultGreen = green * floatGreen;
			int intGreen = (int)resultGreen;

                	int blue = color.getBlue();
			
			int Total = intRed + intGreen + blue;

			if(Total >= 8388608)
				Total = 0;	
			else
				Total = 255;
			
			

			
			newImage.setRGB(i,j, new Color(Total, Total , Total ).getRGB());
		} 

	m.writeImage(newImage, "GetGudNegative", "jpg");
		
	}
	
	/*error
	double[][] matrix = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};

	for(int i = 0; i < matrix.length; i++)
	{
		for(int j = 0; j < matrix.length; j++)
		{
			System.out.println(matrix[i][j]);
		}
	}

	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
			
			
			for(int x = 0; x < matrix.length; x++)
			{
				for(int y = 0; y < matrix.length; y++)
				{
					System.out.println(matrix[x][y]);
					Color color1 = new Color(imagen.getRGB(i+(x-1), j+(y-1)));
				}
			}
			newImage.setRGB(i,j, new Color(x,y).getRGB());
		}

	}

	m.writeImage(newImage, "GetGudBlur", "jpg"); */

	/* error
	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
			Color color1 = new Color(imagen.getRGB(i-1, j-1));
			Color color2 = new Color(imagen.getRGB(i, j));
			Color color3 = new Color(imagen.getRGB(i+1, j+1));
			double[][] matrix = {{0f, 0.2f, 0f},{0.2f, 0.2f, 0.2f}, {0f, 0.2f, 0f}};

			int red1 = color1.getRed();
			int red2 = color2.getRed();
			int red3 = color3.getRed();
			
			float redPerArray1 = matrix[0][1] * red1;
			float redPerArray2 = matrix[0][2] * red1;
			float redPerArray3 = matrix[0][3] * red1;
			float redPerArray4 = matrix[1][1] * red2;
			float redPerArray5 = matrix[1][2] * red2;
			float redPerArray6 = matrix[1][3] * red2;				
			float redPerArray7 = matrix[2][1] * red3;
			float redPerArray8 = matrix[2][2] * red3;
			float redPerArray9 = matrix[2][3] * red3;

			float resultRed = redPerArray1 + redPerArray2 + redPerArray3 + redPerArray4 + redPerArray5 + redPerArray6 + redPerArray7 + redPerArray8 + redPerArray9;
			int totalRed = (int)resultRed;

			int green1 = color1.getGreen();
			int green2 = color2.getGreen();
			int green3 = color3.getGreen();
			float greenPerArray1 = matrix[0][1] * green1;
			float greenPerArray2 = matrix[0][2] * green1;
			float greenPerArray3 = matrix[0][3] * green1;
			float greenPerArray4 = matrix[1][1] * green2;
			float greenPerArray5 = matrix[1][2] * green2;
			float greenPerArray6 = matrix[1][3] * green2;				
			float greenPerArray7 = matrix[2][1] * green3;
			float greenPerArray8 = matrix[2][2] * green3;
			float greenPerArray9 = matrix[2][3] * green3;

			float resultGreen = greenPerArray1 + greenPerArray2 + greenPerArray3 + greenPerArray4 + greenPerArray5 + greenPerArray6 + greenPerArray7 + greenPerArray8 + greenPerArray9;
			int totalGreen = (int)resultGreen;

			int blue1 = color1.getBlue();
			int blue2 = color2.getBlue();
			int blue3 = color3.getBlue();
			float bluePerArray1 = matrix[0][1] * blue1;
			float bluePerArray2 = matrix[0][2] * blue1;
			float bluePerArray3 = matrix[0][3] * blue1;
			float bluePerArray4 = matrix[1][1] * blue2;
			float bluePerArray5 = matrix[1][2] * blue2;
			float bluePerArray6 = matrix[1][3] * blue2;				
			float bluePerArray7 = matrix[2][1] * blue3;
			float bluePerArray8 = matrix[2][2] * blue3;
			float bluePerArray9 = matrix[2][3] * blue3;

			float resultBlue = bluePerArray1 + bluePerArray2 + bluePerArray3 + bluePerArray4 + bluePerArray5 + bluePerArray6 + bluePerArray7 + bluePerArray8 + bluePerArray9;
			int totalBlue = (int)resultBlue;
			newImage.setRGB(i,j, new Color(totalRed, totalGreen , totalBlue).getRGB());
			}
		}
	m.writeImage(newImage, "GetGudBlur", "jpg"); */	
    } 

    public BufferedImage readImage(String pathname) {

        try {

            return ImageIO.read(new File(pathname));

        } catch (IOException ioe) {
            System.out.println("Can't open image.");
            System.exit(1);
        }

        return null;
    }

    public BufferedImage readImage(File file) {

        try {

            return ImageIO.read(file);

        } catch (IOException ioe) {
            System.out.println("Can't open image.");
            System.exit(1);
        }

        return null;
    }

    public void writeImage(BufferedImage image, String pathName, String extension) {

        try {

            ImageIO.write(image, extension, new File(pathName + "."
                    + extension));

        } catch (IOException ioe) {
            System.out.println("Can't save image.");
            ioe.printStackTrace();
        }
    }


    private void println(String s) {
        System.out.println(s);
    }

    private void BWFilter()
	{
		
	}
}