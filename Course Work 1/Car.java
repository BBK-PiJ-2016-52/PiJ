class Car {
	String Model;
	double price;
}
void trade(Car newCar, Car oldCar, int myFund) {
	if (newCar.price <= oldCar.price + myFund) {
		println("we have a deal");
	} else {
		println("forget about it...");
	}
	println(" now we try to be naughty");
	Car temp = new Car();
	temp = newCar;
	newCar = oldCar;
	oldCar = temp;
// Point 1
}
Car myOldFord = new Car();
myOldFord.Model = "Ka";
myOldFord.price = 2000;
Car fancyRacer = new Car();
fancyRacer.Model = "911";
fancyRacer.price = 300000;
int myBudget = 10000;
// Point 2
println("Lets exchange cars! Deal?");
trade(fancyRacer, myOldFord, myBudget);
// Point 3
println("The new car has become " + fancyRacer.model);
println("And the old car has become " + myOldFord.model);
println("The deal has failed");