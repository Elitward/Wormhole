package wormhole;

public class MainEntry {

	public static void main(String[] args) {
		Core blackhole = Core.getInstance();
		if( blackhole.isRunning()==false ){
			blackhole.startRun();
		}
	}

}
