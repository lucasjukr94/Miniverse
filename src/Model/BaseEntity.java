package Model;

public abstract class BaseEntity {

	private int x;
	private int y;
	private int z;
	private String image;
	
	public void setImage(String image){
		this.image = image;
	}
	public String getImage(){
		return image;
	}
	
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	public int getY(){
		return y;
	}
	
	public void setZ(int z){
		this.z = z;
	}
	public int getZ(){
		return z;
	}
}
