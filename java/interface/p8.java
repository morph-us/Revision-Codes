class X{
	X fun(){
		System.out.println("parent fun");
		return new Y();
	}

}

class Y extends X{
	Y fun(){
	
		System.out.println("child fun");
		return new Y();
	}
	
}

