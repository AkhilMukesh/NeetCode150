package BuilderPattern;
public class Client {
		public static void main(String args[]) {
			House house = new House.HouseBuilder().setdoors(3).setName("Ambani").setRooms(4).builde();
			System.out.println(house.toString());
		}
		
	}