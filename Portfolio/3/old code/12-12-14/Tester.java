
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
		String seven = "lw $e, $b";
		String eight = "add $e, $e, $b";
		String nine = "and $f, $c, $d";
		String ten = "or $g, $c, $d";
		String eleven = "xor $h, $c, $d";
		String twelve = "sll $i, $h, 2";
		String thirteen = "srl $j, $h, 2";
		String fourteen = "slti $k, $j, 8";
		String fifteen = "slti $l, $j, 6";
		String sixteen = "slt $m, $h, $g";
		String seventeen = "slt $n, $k, $l";
		StringHandler stringy = new StringHandler();
		stringy.addStatement(one);
		stringy.addStatement(two);
		stringy.addStatement(three);
		stringy.addStatement(four);
		stringy.addStatement(five);
		stringy.addStatement(six);
		stringy.addStatement(seven);
		stringy.addStatement(eight);
		stringy.addStatement(nine);
		stringy.addStatement(ten);
		stringy.addStatement(eleven);
		stringy.addStatement(twelve);
		stringy.addStatement(thirteen);
		stringy.addStatement(fourteen);
		stringy.addStatement(fifteen);
		stringy.addStatement(sixteen);
		stringy.addStatement(seventeen);
		System.out.print(stringy.output());
		

	}

}
