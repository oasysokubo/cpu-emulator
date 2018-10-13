
public class Driver {

	public static void main(String[] args) {
		// 32 bytes of memory expressed in 8-bit strings
		String[] Memory = { "01101011", "10001101", "01001011", "0110001", "10100001", "01000001", "01101100", "11100001",
				"01001100", "00100000", "00000000", "00000000", "00000011", "00000010", "00000100", "00000101", "00000000",
				"00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000",
				"00000000", "00000000", "00000000", "00000000", "00000000", "00000000" };

		// Pass bytes to the memory
		@SuppressWarnings("unused")
		Memory memory = new Memory(Memory);
		
		// String bits are parsed into substrings for the opcodes and arguments
		String[] Opcode = new String[32];
		String[] Argument = new String[32];
		
		for (int i = 0; i < 32; i++) {
			Opcode[i] = Memory[i].substring(0, 3);
			Argument[i] = Memory[i].substring(3, 7);
		}
		
		CPU execute = new CPU(Opcode, Argument);
		execute.programCounter();
	}

}
