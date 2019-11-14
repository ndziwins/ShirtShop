package shirtShop;

public enum Size {
	XS(65, 42),
	S(69, 45),
	M(70, 48),
	L(74, 53),
	XL(76, 59),
	XXL(77, 62);
	
	int length;
	int width;
	
	Size(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Size "+name()+" {"+"length: "+length+" cm, "+"width: "+width+" cm}";
	}
}
