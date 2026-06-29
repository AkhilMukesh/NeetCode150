package BuilderPattern;

public class House {
	
	

	public int doors;
	public int windows;
	public int rooms;
	public String name;
	
	private House(HouseBuilder builder) {
		
	}
	
	public static class HouseBuilder {
		
		private int doors;
		private int windows;
		private int rooms;
		private String names;
		
		public HouseBuilder setName(String name) {
			name = this.names;
			return this;
			
		}
		
		public HouseBuilder setWindows(int windows) {
			windows = this.windows;
			return this;
		}
		
		public HouseBuilder setRooms(int rooms) {
			rooms = this.rooms;
			return this;
			
		}
		
		public HouseBuilder setdoors(int doors) {
			doors = this.doors;
			return this;
			
		}
		
		public House builde() {
			return new House(this);
		}
	}
	
	
	
}




