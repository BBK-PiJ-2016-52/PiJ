/* 6. Division */

print "Please input the first number: ";
String string1 = System.console().readLine();
int number1 = Integer.parseInt(string1);
print "Please input the second number: ";
String string2 = System.console().readLine();
int number2 = Integer.parseInt(string2);

int counter = 0;
for(int i = 1; (i*number2 <= number1); i++) {
	counter++;
}

println number1 + " divided by " + number2 + " is " + counter + ", remainder " + (number1 - counter*number2);