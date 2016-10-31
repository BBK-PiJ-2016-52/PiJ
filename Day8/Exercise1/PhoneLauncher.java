public class PhoneLauncher {
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {

		OldPhone op = new OldPhone();
		op.call("07387388885");
	
		MobilePhone mp1 = new MobilePhone();
		mp1.ringAlarm("15:56");
		
		MobilePhone mp2 = new MobilePhone();
		mp2.playGame("Urban Terror");
		
		MobilePhone mp3 = new MobilePhone();	
		mp3.printLastNumbers("07387388885 07387388885");
		
		SmartPhone sp1 = new SmartPhone();
		sp1.browseWeb("https://moodle.bbk.ac.uk/");
		
		SmartPhone sp2 = new SmartPhone();
		sp2.findPositition("Latitude: 51° 31' 18.98 N Longitude: 0° 07' 49.15 E");
		
	}
}
