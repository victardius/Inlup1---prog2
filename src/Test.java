public class Test{
	
	GUIManager gui = new GUIManager();
	
	private void testMethod() {
		

		gui.valuables.add(new Jewelry("Ring", 3, true));
		gui.valuables.add(new Stock("Not Ring", 3, 3));
		gui.valuables.add(new Device("famiCom", 3, 3000));
		
	}
	
	public static void main(String[] args) {
	
		new Test().testMethod();
		
	}
	
}
