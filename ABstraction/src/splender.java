class splender extends Bike{

	@Override
	void run() {
		System.out.println("safely");
	}
	public static void main(String[] args) 
	{
		Bike b=new splender();
		b.run();
		
		
	}
	
}