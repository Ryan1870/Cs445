public class Thing {

		private String name;
	
		
		public Thing(String tName)
		{
			name = tName;
		}
		
			
		public String getName()
		{
			return name;
		}
		
		public void setName(String tname){
			name = tname;
		}
		
		public String toString()
		{
			return name + " " + this.getClass().getSimpleName();
		}
}
