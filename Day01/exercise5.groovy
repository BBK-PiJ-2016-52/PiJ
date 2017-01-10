/* 5. Multiplication */
print "Enter the first number?"
String str1 = System.console().readLine();
int number1 = Integer.parseInt(str1);
print "Enter the second number?"
String str2 = System.console().readLine();
int number2 = Integer.parseInt(str2);

int i = 0, result = 0;

while(i < number2) {
	result = result+number1;
	i++
}
println "The result of the product is:"+ result;
