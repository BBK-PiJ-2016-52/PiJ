/* 8. Maximising */

print "Please input a serie of numbers each one followed by an Enter: ";
string = System.console().readLine();
int number = Integer.parseInt(string);
def list = [];

for(int i = 0; number != -1; i++) {
	list[i] = number;
	String string = System.console().readLine();
	number = Integer.parseInt(string);
}
result = list.sort();
result = result.reverse();	
println result[0];