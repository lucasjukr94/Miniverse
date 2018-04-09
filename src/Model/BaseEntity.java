package Model;

import java.util.Random;

public abstract class BaseEntity {

	private int x;
	private int y;
	private int z;
	private int velocidadeX;
	private int velocidadeY;
	private int velocidadeZ;
	private String image;
	
	public void Botting(){
		//Todas as ações de inteligência própria serão efetuadas nesse método.
		BotAndar();
	}
	
	private void BotAndar(){
		Random random = new Random();
		int rand = random.nextInt(10);
		
	}
	
	public void setVelocidadeX(int velocidadeX){
		this.velocidadeX = velocidadeX;
	}
	public int getVelocidadeX(){
		return velocidadeX;
	}
	
	public void setVelocidadeY(int velocidadeY){
		this.velocidadeY = velocidadeY;
	}
	public int getVelocidadeY(){
		return velocidadeY;
	}
	
	public void setVelocidadeZ(int velocidadeZ){
		this.velocidadeZ = velocidadeZ;
	}
	public int getVelocidadeZ(){
		return velocidadeZ;
	}
	
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
