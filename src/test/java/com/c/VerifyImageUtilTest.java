package com.c;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

import junit.framework.TestCase;

public class VerifyImageUtilTest extends TestCase {

	@Test
	public void testcode() {
		try {
			String randomFile = VerifyImageUtil.getRandomFile("D:/JavaWebExercise");
			VerifyImage verifyImage = VerifyImageUtil.getVerifyImage(randomFile);
			String markImageBASE64 = verifyImage.getMarkImageBASE64();
			String srcImageBASE64 = verifyImage.getSrcImageBASE64();
			BufferedImage markImage = VerifyImageUtil.base64StringToImage(srcImageBASE64);
			BufferedImage srcImage = VerifyImageUtil.base64StringToImage(markImageBASE64);
			ImageIO.write(markImage, "png", new File("D:/JavaWebExercise/12.png"));
			ImageIO.write(srcImage, "png", new File("D:/JavaWebExercise/13.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
