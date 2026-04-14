package Core_java;

public class Mobile_I implements Camera,Musicplayer {
	@Override
	public void Photo() {
		System.out.println("Taking photo");
	}
	@Override
	public void playmusic() {
		System.out.println("Playing music");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile_I m=new Mobile_I();
		m.Photo();
		m.playmusic();
		

	}

}
