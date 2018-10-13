
public class Memory {
	
	private String[] Memory;
	
	public Memory(String[] memory) {
		this.Memory = memory;
	}
	
	public String read(int index) {
		return Memory[index];
	}
	
	public void write(int index, int value) {
		Memory[index] = CPU.decToBinary(value);
	}
}
