package p4_student;

import cmsc131PhotoLibrary.Photograph;
import cmsc131PhotoLibrary.Pixel;

/**
 * The methods in this class are to be implemented by you.  
 * This class starter file provides various static methods that take 
 * a photograph and produce a new one based on it, but with various 
 * modifications.
 * 
 * See the project description for details of method implementations.
 * 
 * @author PUT YOUR NAME HERE
 *
 */
public class PhotoTools {


	//THIS METHOD IS PROVIDED AS A STARTING POINT.  PLEASE READ THROUGH
	//  IT AND THINK ABOUT WHAT IT DOES AND WHY - IF YOU AREN'T SURE OF
	//  SOMETHING, ASK US IN OFFICE HOURS!
	public static Photograph copy(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(x, y));
			}
		}
		return newPhoto;
	}






	public static Photograph isolateColor(Photograph photo, int type) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				if(type == 0)
				{
					Pixel a = photo.getPixel(x,y);
					Pixel b = new Pixel(a.getRed(), 0, 0); 
					newPhoto.setPixel(x, y, b);;
				}
				else if (type == 1)
				{
					Pixel c = photo.getPixel(x,y);
					Pixel d = new Pixel(0, 0, c.getBlue()); 
					newPhoto.setPixel(x, y, d);
				}
			}

		}
		return newPhoto;
	}





	public static Photograph makeGrayscale(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				Pixel pixel = photo.getPixel(x,y);
				int grayValue = (int)(pixel.getRed() * 0.2) +
						(int)(pixel.getGreen() * 0.5) +
						(int)(pixel.getBlue() * 0.3);
				Pixel b = new Pixel(grayValue, grayValue,grayValue);
				newPhoto.setPixel(x, y, b);
			}
		}
		return newPhoto;
	}


	public static Photograph makeArtistic(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				Pixel a = photo.getPixel(x,y);
				int sum = (int)(a.getRed()) +
						(int)(a.getGreen()) +
						(int)(a.getBlue());
				if(sum <= 109)
				{
					Pixel b = new Pixel(0,0,0);
					newPhoto.setPixel(x, y, b);
				}
				else if(sum <= 218)
				{
					Pixel b = new Pixel(42,42,42);
					newPhoto.setPixel(x, y, b);
				}
				else if(sum <= 327)
				{
					Pixel b = new Pixel(85,85,85);
					newPhoto.setPixel(x, y, b);
				}
				else if(sum <= 436)
				{
					Pixel b = new Pixel(127,127,127);
					newPhoto.setPixel(x, y, b);
				}
				else if(sum <= 545)
				{
					Pixel b = new Pixel(170,170,170);
					newPhoto.setPixel(x, y, b);
				}
				else if(sum <= 654)
				{
					Pixel b = new Pixel(212,212,212);
					newPhoto.setPixel(x, y, b);
				}
				else 
				{
					Pixel b = new Pixel(255,255,255);
					newPhoto.setPixel(x, y, b);
				}
			}
		}
		return newPhoto;
	}



	public static Photograph censorIt(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x+=10) {
			for (int y=0; y<photo.getHt(); y+=10) {
				for(int a=0; a<10;a++) {
					for(int b=0;b<10;b++)
					{
						int sumRed= 0,sumGreen = 0,sumBlue = 0;
						sumRed += (int)photo.getPixel(a, b).getRed();
						sumBlue += (int)photo.getPixel(a, b).getBlue();
						sumGreen += (int)photo.getPixel(a, b).getGreen();
						for(int c=0; c<10;c++) {
							for(int d=0;d<10;d++)
							{
								Pixel avg = new Pixel (sumRed,sumGreen,sumBlue);
								newPhoto.setPixel(c, d, avg);
							}
					}
				}
					
			}
		}
			
		}
		return newPhoto;
		
	
		//HINT: To deal with the edge cases, you'll want to 
		//      check you aren't going out of bounds in the
		//      middle of your nested nesting of loops...


	}


	public static Photograph stretched(Photograph photo, int type) {
		Photograph newPhoto = null;
		if (type==1)
		{ 

			newPhoto = new Photograph(photo.getWd(),photo.getHt()*2);
			for (int x=0;x<photo.getWd();x++){
				for (int y=0; y<photo.getHt(); y++){
					newPhoto.setPixel(x, y*2, photo.getPixel(x, y));
					newPhoto.setPixel(x, y*2+1, photo.getPixel(x, y));
				}
			}
		}
		else
		{ 
			newPhoto = new Photograph(photo.getWd()*2, photo.getHt());
			for (int y=0; y<photo.getHt();y++){
				for (int x=0; x<photo.getWd(); x++){
					newPhoto.setPixel(x*2, y, photo.getPixel(x, y));
					newPhoto.setPixel(x*2+1, y, photo.getPixel(x, y));
				}
			}
		}
		return newPhoto;
	}





	public static Photograph mirrorIt(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd()/2;x++){
			for (int y=0; y<photo.getHt(); y++){
				Pixel a = photo.getPixel(x, y);
				Pixel b = photo.getPixel(photo.getWd()-x-1, y);
				newPhoto.setPixel(x, y, b);
				newPhoto.setPixel(photo.getWd()-x-1, y, a);
			}
		}
		return newPhoto;
	}


	public static Photograph makeDoubleWithMirror(Photograph photo) {
		Photograph flipped = mirrorIt(photo);
		Photograph db = new Photograph(photo.getWd()*2, photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				db.setPixel(x, y, flipped.getPixel(x, y));
				db.setPixel(x+photo.getWd(), y, photo.getPixel(x,y));
			}
		}
		return db;
	}

	public static Photograph rotated(Photograph photo) {
		throw new RuntimeException("You'll implement this...");
	}

	public static Photograph upsideDown(Photograph photo) {
		throw new RuntimeException("You'll implement this...");

		//DON'T FORGET - THIS ONE SHOULD BE ONE LINE OF CODE!
		//  THIS CHALLENGE INVOLVES MORE THINKING THAN CODING!
	}



}
