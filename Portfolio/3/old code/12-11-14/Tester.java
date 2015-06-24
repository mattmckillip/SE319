
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "lwi $a, 1";
		String two = "lwi $b, 2";
		String three = "addi $c, $a, 10";
		String four = "addi $d, $b, 20";
		String five = "addi $a, $c, 100";
		String six = "addi $b, $d, -200";
		StringHandler stringy = new StringHandler();
		stringy.addStatement(one);
		stringy.addStatement(two);
		stringy.addStatement(three);
		stringy.addStatement(four);
		stringy.addStatement(five);
		stringy.addStatement(six);
		stringy.output();
				

	}

}
