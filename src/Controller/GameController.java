package Controller;

import Model.*;
import View.*;
import java.util.Timer;
import java.util.TimerTask;

public class GameController extends BaseController{
	private Timer timer = new Timer();
	public void Setup(){
		RenderFrame();
		Loop();
	}
	
	private void Loop(){
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("teste");
			}
		},1,1);
	}
}
