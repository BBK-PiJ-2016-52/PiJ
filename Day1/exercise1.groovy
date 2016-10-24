/*  1. Ternay Operator*/
int currentYear = 2012
print "When were you born (year)?"
String str = System.console().readLine();
int birthYear = Integer.parseInt(str);
int ageAprox = currentYear - birthYear;
String result = (ageAprox > 17) ? "" : "not "
println "It seems you are " + result + "an adult."
/* This code tells you if you are an adult or not, reading the year that the user writes 
and integer with the exponent, finally compare the result of the current year and the birth year
and if so it finds is older than 17 years it will print it seems you're an adult otherwise not*/
