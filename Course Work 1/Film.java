class Film {
	String title;
	int reviewer = 0;
	double totalStar = 0;
	void review(int stars) {
		reviewer++;
		totalStar += stars;
	}
	double getRating() {
		if (reviewer == 0) {
			return 0;
		} else {
			return totalStar / reviewer;
		}
	}
}
void rate(Film f, int stars) {
	println("Viewer voting being processed...");
	f.review(stars);
	f = null;
	stars++;
	println("The value of star inside this method is: " + stars);
// Point 1
}
Film helpMeChoose(Film f1, Film f2) {
	return f1.getRating() > f2.getRating() ? f1 : f2;
}
Film film1 = new Film();
film1.title = "Prometheus";
Film film2 = new Film();
film2.title = "Twilight";
print(film1.reviewer + " reviewers have given " + film1.title);
println(" an average rating of " + film1.getRating() + " stars.");
print(film2.reviewer + " reviewers have given " + film2.title);
println(" an average rating of " + film2.getRating() + " stars.");
// Point 2
int starts = 5;
rate(film1, stars);
println("The value of star here is now: " + stars);
stars = 4;
rate(film1,stars);
println("The value of star here is now: " + stars);
stars = 2;
rate(film2,stars);
println("The value of star here is now: " + stars);
stars = 3;
rate(film2,stars);
println("The value of star here is now: " + stars);
// Point 3
print(film1.reviewer + " reviewers have given " + film1.title);
println(" an average rating of " + film1.rating + " stars.");
print(film2.reviewer + " reviewers have given " + film2.title);
println(" an average rating of " + film2.rating + " stars.");
Film finalChoice = helpMeChoose(film1,film2);
println("And we officially recommend: " + finalChoice.title);
// Point 4

