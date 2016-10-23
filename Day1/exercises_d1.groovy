/*  1. Ternay Operator*/
int currentYear = 2012
print "When were you born (year)?"
String str = System.console().readLine();
int birthYear = Integer.parseInt(str);
int ageAprox = currentYear - birthYear;
String result = (ageAprox > 17) ? "" : "not "
println "It seems you are " + result + "an adult."
/* This code does is tell you if you are an adult or not, reading the year that the user writes 
and integer with the exponent, finally compare the result of the current year and the birth year
and if so it finds is older than 17 years it will print it seems you're an adult otherwise not*/

/* 2. Ende homepage */
int i = 10
while (i < 5) {
i++;
println i
}
/* Yes, the code is wrong because tne int is setup on 10 and the loop i is starting less than 5.
So the compare point which is 5 is greater than the initial point and it won't start*/

/* 3. Yet another loop 
It requests a number during 10 times in a row while the number is not 0 because it will exit the program and if is 
different from 1 it will be printing J who is the initial int*/

/*4. Prime numbers*/
print "Enter a number?"
String str = System.console().readLine();
if (str % 1 == 0) {
	println "It seems you are " + result + "an adult."
}
