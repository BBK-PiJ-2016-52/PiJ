/* 12.a.  Number pyramids. */

int n = 0, n_times = 0;
for(int i = 0; n < 100000000; i++) {
	for (int j = 0; n_times <= i; j++) {
		print(i);		
		n_times++;
	}
	println("");		
	n_times = 0;
	n++;	
} 