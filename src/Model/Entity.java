package Model;

public class Entity extends BaseEntity{
	private String defaultImageHuman = "";
	
	public Entity(int x,int y,int z){
		setX(x);
		setY(y);
		setZ(z);
		setImage(defaultImageHuman);
	}
}
