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
	
	public void output(){
		for(int i = 0; i < statements.size(); i++){
			System.out.print(statements.get(i));
			System.out.println();
		}
	}
	
	private String computeStatement(String statement){
		if(statement.substring(0, 4).equals("addi")) return addI(statement);
		else if(statement.substring(0, 3).equals("lwi")) return lwi(statement);
		return "This doesn't appear to be a supported equation";
	}
	
	private String addI(String statement){
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
	
	private String lwi(String statement){
		String temp = statement.replace(",","");
		String delims = "[ ]+";
		String[] terms = temp.split(delims);
		int term1 = Integer.parseInt(terms[2]);
		loadRegister(terms[1], term1);
		String finalString = terms[1] + " = " + terms[2];
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
