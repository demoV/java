class Person {
	private Name name;
	private int age;

	private Person(Name n, int a) {
		this.name = n;
		this.age = a;
	}

	public static Person createPerson(Name name, int age){
		return new Person(name, age);
	}
	private void printPerson(){
		System.out.println("hello  " + name.getFullName());
	}

	public void print(){
		printPerson();
		System.out.println(this);	
	}
	
};