package shirtShop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	private List<Shirt> shirts;

	public Shop() {
		shirts = new ArrayList<>();
	}
	
	public void addShirt(Shirt shirt) {
		shirts.add(shirt);
	}
	
	public void sellShirt(Shirt shirt) {
		shirts.remove(shirt);
	}
	
	public List<Shirt> getShirtByColor(Color color) {
		List<Shirt> shirtColorList = new ArrayList<>();
		
		for (Shirt shirt : shirts) {
			boolean sameColor = shirt.getColor() == color;
			if(sameColor) {
				shirtColorList.add(shirt);
			}
		}
		return shirtColorList;
	}
	
	public List<Shirt> getShirtBySize(Size size) {
		List<Shirt> shirtSizeList = new ArrayList<>();
		
		for (Shirt shirt : shirts) {
			boolean sameSize = shirt.getSize() == size;
			if(sameSize) {
				shirtSizeList.add(shirt);
			}
		}
		return shirtSizeList;
	}
	
	public List<Shirt> getShirtByType(Type type) {
		List<Shirt> shirtTypeList = new ArrayList<>();
		
		for (Shirt shirt : shirts) {
			boolean sameType = shirt.getType() == type;
			if(sameType) {
				shirtTypeList.add(shirt);
			}
		}
		return shirtTypeList;
	}
	
	public List<Shirt> getShirtByTypeColorSize(Type type, Color color, Size size) {
		List<Shirt> shirtTypeColorSizeList = new ArrayList<>();
		
		for (Shirt shirt : shirts) {
			boolean sameType = shirt.getType() == type;
			boolean sameColor = shirt.getColor() == color;
			boolean sameSize = shirt.getSize() == size;
			if((sameType)&&(sameColor)&&(sameSize)) {
				shirtTypeColorSizeList.add(shirt);
			}
		}
		
		return shirtTypeColorSizeList;
	}

}

