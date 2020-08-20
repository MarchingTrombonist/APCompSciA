class Derived extends Base {
	public void methodOne() {
		super.methodOne();
		System.out.print("C");
	}

	public void methodTwo() {
		super.methodTwo();
		System.out.print("D");
	}
}

/*
	base main runs derived methodOne
	derived methodOne runs base methodOne
	base methodOne prints A and runs derived methodTwo
	derived methodTwo runs base methodTwo
	base methodTwo prints B
	derived methodTwo finishes and prints D
	derived methodOne finishes and prints C
*/