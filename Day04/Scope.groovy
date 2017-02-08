class Scope {
	int size;

	void setSize(int newSize) {
		this.size = newSize;
	}

	void print() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					println("1 ");
				} else {
					println("0 ");
				}
			}
			println "Something in here."
		}
	}
}
