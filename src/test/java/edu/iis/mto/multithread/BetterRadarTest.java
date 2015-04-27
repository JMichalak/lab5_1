package edu.iis.mto.multithread;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.concurrent.Executor;

import org.junit.Test;
import org.mockito.Mockito;
public class BetterRadarTest {
	@Test
	public void launchTenPatriotOnceWhenNoticesAScudMissle() {
		PatriotBattery batteryMock = mock(PatriotBattery.class);
		
		Executor exec = new Executor(){

			@Override
			public void execute(Runnable command) {
				// TODO Auto-generated method stub
				command.run();
			}
			
			
		};
		
		BetterRadar radar = new BetterRadar(batteryMock, exec);
		radar.notice(new Scud());
		verify(batteryMock, Mockito.times(10)).launchPatriot();
	}
}
