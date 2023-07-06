package string;

enum Chocolate {

	BITTER("Bitter Chocolate"), WHITE("White Chocolate"), BLACK("Black Chocolate");

	public String flavor;

	Chocolate(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public String toString() {
		// return flavor;
		return String.valueOf(flavor);
	}
}
