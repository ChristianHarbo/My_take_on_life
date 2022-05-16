package TheSimulationFill;

public class TimeLoopeStarter extends Thread implements TimeLoope {

	int howManyRuns;
	float pausForHowManySek;
	int howManyTimesTord;

	@Override
	public void setTimeLoop(float howlong, int howManyTimes) {
		// TODO Auto-generated method stub
		pausForHowManySek = (int) (howlong * 1000);
		howManyTimesTord = howManyTimes;

	}

	@Override
	public void run() {


		for (int i = 0; i <= howManyTimesTord; i++) {

			try {
				Thread.sleep((long) pausForHowManySek);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			howManyRuns = i;

		}

	}

	public void getTimes(int numberOfLoop) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
