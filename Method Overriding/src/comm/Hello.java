package comm;

class Instragram1 {
	void upload()
	{
		System.out.println("uploading the image");
		
	}
}
class Instragram2 extends Instragram1
{
	@Override
	void upload()
	{
	super.upload();
	System.out.println("support the video <1min");
	}
	void dm()
	{
		System.out.println("Text");
	}
}
class Instragram3 extends Instragram2
{
	@Override
	void upload()
	{
		super.upload();
		System.out.println("Support the video >1 min");
	}
	void dm()
	{
		super.dm();
		System.out.println("Direct Message");
	}
	void reels()
	{
		System.out.println("reels");	
		}
}

class Hello {

	public static void main(String[] args) {
		Instragram3 i3=new Instragram3();
		
		i3.upload();
		i3.dm();
		i3.reels();
		}

}
