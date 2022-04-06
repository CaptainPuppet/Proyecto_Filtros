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
	
	
	
	//gray filter
	/*
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
	*/

	//red filter
	/*
	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
                	Color color = new Color(imagen.getRGB(i, j));
                	int red = color.getRed();
       
			newImage.setRGB(i,j, new Color(red, 0, 0).getRGB());
		} 
	}

	m.writeImage(newImage, "GetGudRed", "jpg");
	*/

	//green filter
	/*
	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
                	Color color = new Color(imagen.getRGB(i, j));
                	int green = color.getGreen();
       
			newImage.setRGB(i,j, new Color(0, green, 0).getRGB());
		} 
	}
	
	m.writeImage(newImage, "GetGudGreen", "jpg");
	*/

	//blue filter
	/*
	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
                	Color color = new Color(imagen.getRGB(i, j));
                	int blue = color.getBlue();
       
			newImage.setRGB(i,j, new Color(0, 0, blue).getRGB());
		} 
	}
	
	m.writeImage(newImage, "GetGudBlue", "jpg");
	*/

	//Sepia filter
	/*
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
	*/

	//High Contrast Filter
	/*
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
	*/

	//Negative Filter
	/*
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
	/*
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
	
	//BufferedImage afterImg = new BufferedImage(imagen.getWidth() * 2,imagen.getHeight() * 2, BufferedImage.TYPE_INT_ARGB);

	//final AffineTransform at = AffineTransform.getScaleInstance(2.0, 2.0);
	//final AffineTransformOp ato = new AffineTransformOp(afterImg, AffineTransformOp.TYPE_INT_ARGB);
	//afterImg = imagen, afterImg;
	//m.writeImage(afterImg, "GetGudIncreased", "jpg");

	/*
	double[][] Edgefilter = {{-1,  0,  1},{-2,  0,  2}, { -1,  0,  1}, {  1,  2,  1 }, {  0,  0,  0 }, { -1, -2, -1 }};
	gray1 = 0;
	gray2 = 0;
	for(int i = 0; i < w; i++){
		for(int j = 0; j < h; j++){
			
			
			for(int x = 0; x < Edgefilter.length; x++)
			{
				for(int y = 0; y < Edgefilter.length; y++)
				{
					Color gray = new Color(imagen.getRGB(i+(x-1), j+(y-1)));
					
				}

				gray1 += gray * Edgefilter[x][y];
				int magnitude = 255 - (gray1 * gray1 + gray2 * gray2); 
			}
			newImage.setRGB(i,j, new Color(magnitude, magnitude).getRGB());
		}

	}
	*/
	
	//edge
	/*error	
	Color [][] ColorMatrix = new Color[w][h]; 
	float [][] kernelB = {{0f, 1f, 0f}, {1f, -4f, 1f}, {0f, 1f, 0f}};
	float acR = 0f;
	float acG = 0f;
	float acB = 0f;

	BufferedImage edgefiedImage = new BufferedImage(imagen.getWidth(), imagen.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
	
	for (int x1 = 0; x1 <= w; x1++) 
	{
        for (int y1 = 0; y1 <= h; y1++)
		{        
				for(int x2 = 0; x2 < 3; x2++)
				{
					for(int y2 = 0; y2 < 3; y2++)
					{
								ColorMatrix[w][h] = new Color(imagen.getRGB(x1,y1));			
							
								Color matrizC = ColorMatrix[x1][y1];
						

									int rB = (int) kernelB[x2][y2] * matrizC.getRed();
									int gB = (int) kernelB[x2][y2] * matrizC.getGreen();
									int bB = (int) kernelB[x2][y2] * matrizC.getBlue();
									acR += rB;   
									acG += gB;   
									acB += bB;

									if(rB < 0)  
									{
										rB = 0;
									}       
						
									if(gB < 0)
									{
										gB = 0;
									}         
						
									if(bB < 0)
									{
										bB = 0;
									}

									if(rB > 255)  
									{
										rB = 255;
									}       
									
									if(gB > 255)
									{
										gB = 255;
									}         
									
									if(bB > 255)
									{
										bB = 255;
									}

									edgefiedImage.setRGB(x1,y1, new Color(rB, gB, bB).getRGB());
							
						
						
					}
				}          
        }
    }
	

	m.writeImage(edgefiedImage, "GetGudEdge", "jpg");
	/*

	//sharpening
	/*
	double [][] sharpedImageM = {{0f, -0.5f, 0f}, {-0.5f, 3f, -0.5f}, {0f, -0.5f, 0f}};
	BufferedImage sharpenedImage = new BufferedImage(imagen.getWidth(), imagen.getHeight(), BufferedImage.TYPE_3BYTE_BGR); 
	int[] container = {0,0,0}; 
	for(int i = 0; i < w; i++)
	{
		for(int j = 0; j < h; j++)
		{
			Color ogColor = new Color(imagen.getRGB(i,j));
			
			for(int x = 0; x < sharpedImageM.length; x++)
			{
				for(int y = 0; y < sharpedImageM.length; y++)
				{
					Color newColor = new Color(sharpenedImage.getRGB(x, y));
					
					container[0] += newColor.getRed() * sharpedImageM[x][y]; 
					container[1] += newColor.getGreen() * sharpedImageM[x][y];  
					container[2] += newColor.getBlue() * sharpedImageM[x][y];

					if (container[0] > 255)
                    		container[0] = 255;
                	else
                    		container[0] = 0;

					if (container[1] > 255)
                    		container[1] = 255;
                	else
                    		container[1] = 0;

					if (container[2] > 255)
                    		container[2] = 255;
                	else
                    		container[2] = 0;

					sharpenedImage.setRGB(i,j, new Color(container[0], container[1], container[2]).getRGB());
				}	
			}
		}

	}

	m.writeImage(sharpenedImage, "GetGudSharpened", "jpg");
	*/


	/* error
	double[][] kernel = {{0,0,0}, {0,1,0}, {0,0,0}};
	double[][] edgeFilter = {{-1,-1,-1}, {-1,8,-1}, {-1,-1,-1}};

	Color gray = new Color(imagen.getRGB(i+(x-1), j+(y-1)));

	edgeFilter = (1*w + (8*h * gray) / 9);

	newImage.setRGB(w,h, new Color(edgeFilter, edgeFilter).getRGB());
	*/

	//Scale Large
	BufferedImage LargeSizeableImage = new BufferedImage(imagen.getWidth() * 2 , imagen.getHeight() * 2 , BufferedImage.TYPE_3BYTE_BGR);
	for(int i = 0; i < w; i++)
	{
		for(int j = 0; j < h; j++)
		{
			Color Oc = new Color(imagen.getRGB(i,j));

			int i2 = i * 2;
			int j2 = j * 2;
			
			//Color Nc = new Color(imagen.getRGB(i2 , j2));
			/*SLacR = Nc.getRed();
			SLacG = Nc.getGreen();
			SLacB = Nc.getBlue();
			LargeSizeableImage.setRGB(i,j, new Color(SLacR, SLacG, SLacB).getRGB());*/

			LargeSizeableImage.setRGB((i2),(j2), Oc.getRGB());
			LargeSizeableImage.setRGB((i2),(j2)+1, Oc.getRGB());
            LargeSizeableImage.setRGB((i2)+1,(j2),  Oc.getRGB());
            LargeSizeableImage.setRGB((i2)+1,(j2)+1, Oc.getRGB());
		}
	}
	m.writeImage(LargeSizeableImage, "GetGudLS", "jpg");


	//Scale Small
	BufferedImage SmallSizeableImage = new BufferedImage(imagen.getWidth() / 2, imagen.getHeight() / 2, BufferedImage.TYPE_3BYTE_BGR);
	float rContainer = 0f;
	float gContainer = 0f;
	float bContainer = 0f;


	for(int i = 0; i < w; i++)
	{
		for(int j = 0; j < h; j++)
		{
			Color Oc = new Color(imagen.getRGB(i ,j ));

			int i2 = 2 * i;
			int j2 = 2 * j;
			
			//Color Nc = new Color(imagen.getRGB(i2 , j2));
			/*SLacR = Nc.getRed();
			SLacG = Nc.getGreen();
			SLacB = Nc.getBlue();
			LargeSizeableImage.setRGB(i,j, new Color(SLacR, SLacG, SLacB).getRGB());*/

			if(i2-1 >= 0 && i2+1 < w)
			{
                if(j2-1 >= 0 && j2+1 < h)
				{
					Color color1 = new Color(imagen.getRGB((i2),(j2)));
					Color color2 = new Color(imagen.getRGB((i2),(j2)+1));
					Color color3 = new Color(imagen.getRGB((i2)+1,(j2)));
					Color color4 = new Color(imagen.getRGB((i2)+1,(j2)+1));

					rContainer = (color1.getRed() + color2.getRed() + color3.getRed()+ color4.getRed()) / 4f;
        			gContainer = (color1.getGreen() + color2.getGreen() + color3.getGreen()+ color4.getGreen()) / 4f;
        			bContainer = (color1.getBlue() + color2.getBlue() + color3.getBlue() + color4.getBlue()) / 4f;

					Color totalColor = new Color((int) rContainer, (int) gContainer, (int) bContainer);
					SmallSizeableImage.setRGB(i2 / 2,j2 / 2,totalColor.getRGB());
				}
			}
		}
	}
	m.writeImage(SmallSizeableImage, "GetGudSS", "jpg");
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