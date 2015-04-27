package edu.iis.mto.multithread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BetterRadar{
	private PatriotBattery battery;
	private Executor executor;
	
	
	private Runnable launcher = new Runnable() {
		public void run() {
				for(int i=0; i<10; i++){
				battery.launchPatriot();
				}
		}
	};
	
	public BetterRadar(PatriotBattery missle, Executor exec) {
		this.battery = missle;
		this.executor = exec;
	}

	public void notice(Scud enemyMissle) {
		launchPatriot();
	}

	private void launchPatriot() {

				executor.execute(launcher);
	}

	
		
	
}
