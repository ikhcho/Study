package study.java.interfaceTest;

class Speaker implements Volume{
	int volLevel = VOLUMELEVEL;
	Speaker(){
	}
	@Override
	public void volumeUp(int level){
		
		if(volLevel+level>100) volLevel=100;
		else volLevel += level;
		System.out.println(getClass().getSimpleName()+"���� �ø��ϴ�. "+volLevel);
	}
	
	@Override
	public void volumeDown(int level){
		if(volLevel-level<0) volLevel=0;
		else volLevel -= level;
		System.out.println(getClass().getSimpleName()+"���� �����ϴ�. "+volLevel);
	}
}

class Radio implements Volume{
	int volLevel = VOLUMELEVEL;
	Radio(){
	}
	@Override
	public void volumeUp(int level){
		volLevel+=level;
		System.out.println(getClass().getSimpleName()+"���� �ø��ϴ�. "+volLevel);
	}
	
	@Override
	public void volumeDown(int level){
		if(volLevel-level<=0) volLevel=0;
		else volLevel-=level;
		System.out.println(getClass().getSimpleName()+"���� �����ϴ�. "+volLevel);
	}
}

class TV2 implements Volume{
	int volLevel = VOLUMELEVEL;
	TV2(){
	}
	@Override
	public void volumeUp(int level){
		volLevel+=level;
		System.out.println(getClass().getSimpleName()+"���� �ø��ϴ�. "+volLevel);
	}
	
	@Override
	public void volumeDown(int level){
		volLevel-=level;
		System.out.println(getClass().getSimpleName()+"���� �����ϴ�. "+volLevel);
	}
}