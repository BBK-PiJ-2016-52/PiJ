class Person {
	int age;
	String name;
	Person father;
	Person mother;
}
Person john = new Person();
john.name = "John Smith";
john.age = 35;
Person mary = new Person();
mary.name = "Mary Smith";
mary.age = 32;
Person student = new Person();
student.name = "John Smith, Jr.";
student.age = 5;
student.father = john;
student.mother = mary;
println "TEACHER: How old are you, " + student.name + "?";
println "LITTLE JOHN: I am " + student.age + " years old, sir.";
println "TEACHER: Who is your mother?";
println "LITTLE JOHN: " + student.mother.name + ", sir.";
