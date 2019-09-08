package com.letsstartcoding.springbootrestapiexample.Helper;


import java.util.ArrayList;
import java.util.List;

import com.letsstartcoding.springbootrestapiexample.model.BannerImage;

public class BannerHelper {

	public static List<BannerImage>  getBannerImages(){
		
		List<BannerImage> bannerImages=new ArrayList<BannerImage>();
		
		for(int i=1;i<7;i++) {
			BannerImage bannerImage = new BannerImage();
			bannerImage.setBannerURL("https://easy-home-loan-team31.s3.ap-south-1.amazonaws.com/Banner/image"+i+".jpg");
			bannerImages.add(bannerImage);
		}
		
		return bannerImages;
		
	}
	
}
