 class rat extends Animal{

	@Override
	void eat() {
		
		System.out.println("carrot");
	}
	public static void main(String[] args) 
	{
		Animal a=new rat();
		a.eat();
		
		
	}
  }
