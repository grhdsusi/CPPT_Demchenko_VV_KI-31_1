
public class Main {
        public static void main(String[] args) {
            House house = new House();

            house.setAddress("City: Lviv, Lviv Polytechnic National University, group 301");
            house.setOwner(new Human("Demchenko","Viktoriia"));
            house.setSquareMeters(4000.5);

            System.out.println(house.toString());
        }
    }
    
