/* 12.b.  Number pyramids. */

print "Please input a 1 and 25: ";
string = System.console().readLine();
int number = Integer.parseInt(string);

int n = 0, n_times = 0;
for(int i = 0; n < number; i++) {
	for (int j = 0; n_times <= i; j++) {
		print("");		
		n_times++;
	}
	println(i);		
	n_times = 0;
	n++;	
} 