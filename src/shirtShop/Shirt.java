package shirtShop;

public class Shirt {
	private Type type;
	private Size size;
	private Color color;
	private boolean printed;
	private int id;
	public static int maxID = 0;
	
	public Shirt(Type type, Size size, Color color) {
		id = maxID++;
		this.type = type;
		this.size = size;
		this.color = color;
		boolean printed = false;
	}
	
	public Shirt(Type type, Size size, Color color, boolean printed) {
		this(type, size, color);
		this.printed = true;
		id = maxID++;
		this.printed = printed;
		
	}
	
	@Override
	public String toString() {
		return "Shirt {id: "+id+" "+type+" "+color+" "+size+"}";
	}
	
	public Type getType() {
		return type;
	}
	
	public Size getSize() {
		return size;
	}
	
	public Color getColor() {
		return color;
	}
}
