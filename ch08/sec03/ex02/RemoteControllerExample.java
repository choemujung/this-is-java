package ch08.sec03.ex02;

public class RemoteControllerExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {/*실행문*/}
			public void turnOff() {/*실행문*/}
			public void setVolume(int volume) {/*실행문*/}
		};
	}
}
