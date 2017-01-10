/* 9. Going Up */

print "Please input a serie of numbers each one followed by an Enter: ";
string = System.console().readLine();
int number = Integer.parseInt(string);
def list = [];

for(int i = 0; number != -2; i++) {
	list[i] = number;
	String string = System.console().readLine();
	number = Integer.parseInt(string);
	if (list[i] < list[i + 1] && (list[i] < list[i - 1])) {
		if (number == -1){
			print "No";
		}
	} else {
		if (number == -1){
			print "Yes";
		}
	}
} 