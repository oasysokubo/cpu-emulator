
public class CPU {

	String[] Opcode = new String[32];
	String[] Argument = new String[32];
	String accumulatorVal;

	// Constructor
	public CPU(String[] opcode, String[] argument) {
		this.Opcode = opcode;
		this.Argument = argument;
	}

	public static String decToBinary(int value) {
		String result;
		if (value <= 0)
			result = "";
		else
			result = decToBinary(value / 2) + (value % 2);
		return result;
	}

	public void programCounter() {
		// TODO Auto-generated method stub

	}

}
