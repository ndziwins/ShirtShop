package shirtShop;

import java.util.List;

public class TestTSS {

	public static void main(String[] args) {
		Shop shop = new Shop();
		
		Shirt whiteXL = new Shirt(Type.BASIC, Size.XL, Color.WHITE);
		Shirt whiteXXL = new Shirt(Type.BASIC, Size.XXL, Color.WHITE);
		Shirt blackXS = new Shirt(Type.BASIC, Size.XS, Color.BLACK);
		Shirt blackS = new Shirt(Type.BASIC, Size.S, Color.BLACK);
		Shirt poloBlackS = new Shirt(Type.POLO, Size.S, Color.BLACK);
		Shirt newpoloBlackS = new Shirt(Type.POLO, Size.S, Color.BLACK);
		
		shop.addShirt(poloBlackS);
		shop.addShirt(blackS);
		shop.addShirt(blackXS);
		shop.addShirt(whiteXXL);
		shop.addShirt(whiteXL);
		shop.addShirt(newpoloBlackS);
		
		List<Shirt> shirtsColor = shop.getShirtByColor(Color.BLACK);
		List<Shirt> shirtsType = shop.getShirtByType(Type.BASIC);
		List<Shirt> shirtsSize = shop.getShirtBySize(Size.S);
		List<Shirt> sameShirts = shop.getShirtByTypeColorSize(Type.POLO, Color.BLACK, Size.S);
		System.out.println(shirtsColor);		
		System.out.println(shirtsType);		
		System.out.println(shirtsSize);		
		System.out.println(Size.L);
		System.out.println(sameShirts);
		
	}
}
