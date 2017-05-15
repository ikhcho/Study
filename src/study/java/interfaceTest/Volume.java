package study.java.interfaceTest;

public interface Volume {
	static final int VOLUMELEVEL=0;
	
	public abstract void volumeUp(int level);
	public abstract void volumeDown(int level);
}
