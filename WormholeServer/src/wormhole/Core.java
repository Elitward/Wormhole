package wormhole;

public class Core {
	//typically one instance per computer, so it should be singleton
	private static Core singleton = null;
	
	private Core(){ }
	
	public static Core getInstance() {
		if(singleton == null){
			singleton = new Core();
		}
		return singleton;
	}

	public boolean isRunning(){	//could be either initializing or working
		return false;
	}
	
	public boolean isWorking(){	//must be initialized successfully
		return false;
	}
	
	public void startRun(){
		
	}
	
	public void stopRun(){
		
	}
}
