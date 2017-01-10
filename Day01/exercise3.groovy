/* 3. Yet another loop 
It requests a number during 10 times in a row while the number is not 0 because it will exit the program and if is 
different from 1 it will be printing J who is the initial int*/

String str = System.console().readLine()
int i = Integer.parseInt(str)
while (i < 10) {
i++;
str = System.console().readLine()
int j = Integer.parseInt(str)
if (j == 0) {
break;
} else if (j != 1) {
println j;
}
}
println "finished"