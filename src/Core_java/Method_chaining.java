package Core_java;

public class Method_chaining {
	private int id;
	 private String name;
	 private int age;
public  Method_chaining setId(int id) {
	this.id=id;
	return this;
}
public Method_chaining setName(String name) {
	this.name=name;
	return this;
}
public  Method_chaining setAge(int age) {
	this.age=age;
	return this;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}

	
}
