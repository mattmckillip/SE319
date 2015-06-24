import java.util.ArrayList;


public class StringHandler {
	
	ArrayList<String> statements;
	ArrayList<Register> registers;
	
	public StringHandler(){
		statements = new ArrayList<String>();
		registers = new ArrayList<Register>();
	}
	
	public void addStatement(String statement){
		if(statement.length() > 0){
			statements.add(statement);
			statements.add(computeStatement(statement));
		}
	}
	
	public String output(){
		String temp = "";
		for (String s : statements)
			temp = temp + s + "\n";
		temp = temp + "Registers\nID\tvalue\n";
		for (Register r : registers)
			temp = temp + r.name + "\t" + r.value +"\n";
		return temp;
	}
	
	private String computeStatement(String statement){
		if(statement.substring(0, 4).equals("addi")) return addi(statement);
		else if(statement.substring(0, 3).equals("add")) return add(statement);
		else if(statement.substring(0, 3).equals("and")) return and(statement);
		else if(statement.substring(0, 3).equals("lwi")) return lwi(statement);
		else if(statement.substring(0, 2).equals("lw")) return lw(statement);
		else if(statement.substring(0, 2).equals("or")) return or(statement);
		else if(statement.substring(0, 3).equals("xor")) return xor(statement);
		else if(statement.substring(0, 3).equals("sll")) return sll(statement);
		else if(statement.substring(0, 3).equals("srl")) return srl(statement);
		else if(statement.substring(0, 4).equals("slti")) return slti(statement);
		else if(statement.substring(0, 3).equals("slt")) return slt(statement);
		return "This doesn't appear to be a supported equation";
	}
	
	private String addi(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = fetchRegister(terms[2]);
		int term2 = Integer.parseInt(terms[3]);
		int result = term1 + term2;
		loadRegister(terms[1], result);
		String finalString = terms[1] + " = " + terms[2] + " + " + terms[3] +  " = " + result;
		return finalString;
	}
	
	private String add(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = fetchRegister(terms[2]);
		int term2 = fetchRegister(terms[3]);
		int result = term1 + term2;
		loadRegister(terms[1], result);
		String finalString = terms[1] + " = " + terms[2] + " + " + terms[3] +  " = " + result;
		return finalString;
	}
	
	private String and(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = fetchRegister(terms[2]);
		int term2 = fetchRegister(terms[3]);
		int result = term1 & term2;
		loadRegister(terms[1], result);
		String finalString = terms[1] + " = " + terms[2] + " & " + terms[3] +  " = " + result;
		return finalString;
	}
	
	private String or(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = fetchRegister(terms[2]);
		int term2 = fetchRegister(terms[3]);
		int result = term1 | term2;
		loadRegister(terms[1], result);
		String finalString = terms[1] + " = " + terms[2] + " | " + terms[3] +  " = " + result;
		return finalString;
	}
	
	private String xor(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = fetchRegister(terms[2]);
		int term2 = fetchRegister(terms[3]);
		int result = term1 ^ term2;
		loadRegister(terms[1], result);
		String finalString = terms[1] + " = " + terms[2] + " ^ " + terms[3] +  " = " + result;
		return finalString;
	}
	
	private String sll(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = fetchRegister(terms[2]);
		int term2 = Integer.parseInt(terms[3]);
		int result = term1 << term2;
		loadRegister(terms[1], result);
		String finalString = terms[1] + " = " + terms[2] + " << " + terms[3] +  " = " + result;
		return finalString;
	}
	
	//unsigned
	private String srl(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = fetchRegister(terms[2]);
		int term2 = Integer.parseInt(terms[3]);
		int result = term1 >>> term2;
		loadRegister(terms[1], result);
		String finalString = terms[1] + " = " + terms[2] + " >> " + terms[3] +  " = " + result;
		return finalString;
	}
	
	private String slti(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = fetchRegister(terms[2]);
		int term2 = Integer.parseInt(terms[3]);
		int result = 0;
		if(term1 < term2) result = 1;
		loadRegister(terms[1], result);
		String finalString = terms[1] + " = is " + terms[2] + " < " + terms[3] +  " = " + result;
		return finalString;
	}
	
	private String slt(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = fetchRegister(terms[2]);
		int term2 = fetchRegister(terms[3]);
		int result = 0;
		if(term1 < term2) result = 1;
		loadRegister(terms[1], result);
		String finalString = terms[1] + " = is " + terms[2] + " < " + terms[3] +  " = " + result;
		return finalString;
	}
	
	private String lwi(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = Integer.parseInt(terms[2]);
		loadRegister(terms[1], term1);
		String finalString = terms[1] + " = " + terms[2];
		return finalString;
	}
	
	private String lw(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = fetchRegister(terms[2]);
		loadRegister(terms[1], term1);
		String finalString = terms[1] + " = " + terms[2] + " = "+ term1;
		return finalString;
	}
	
	private int fetchRegister(String regName){
		for (Register reg : registers)
			if(reg.name.equals(regName)) return reg.value;
		return 0;
	}
	
	private void loadRegister(String regName, int regValue){
		for (Register reg : registers)
			if(reg.name.equals(regName)){
				reg.value = regValue;
				return;
			}
		Register temp = new Register(regName, regValue);
		registers.add(temp);
	}

}
