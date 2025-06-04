package lezione11_Astrazione;

public class ParentChild {

	static class Parent{
		private int x = 1;
		protected int y = 2;
		
		
		public int getSum() {
			return x + y;
		}
	}
	
	static class Child extends Parent{
		
		int x = 3;
		int y = 4;
		
		
		public int getSum() {
			// TODO Auto-generated method stub
			return super.getSum() + x + y;
		}
		
	}

	
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println(p.y + " " + c.y + " " + p.getSum() + " " + c.getSum());
	}


}

