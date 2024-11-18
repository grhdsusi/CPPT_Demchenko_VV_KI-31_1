

    public class House {
        private String address;
        private Human student;
        private double squareMeters;

        //Constructors
        public House() {
            LoggerInFile.printLogToFile("House is created.");
        }

        public House(String address, Human owner, double squareMeters) {
            this.address = address;
            this.student = owner;
            this.squareMeters = squareMeters;
            LoggerInFile.printLogToFile("House is created.");
        }

        //Getters
        public String getAddress() {
            LoggerInFile.printLogToFile("Get address: " + address + '.');
            return address;
        }

        public Human getOwner() {
            LoggerInFile.printLogToFile("Get owner: " + student + '.');
            return student;
        }

        public double getSquareMeters() {
            LoggerInFile.printLogToFile("Get square meters: " + squareMeters + '.');
            return squareMeters;
        }

        //Setters
        public void setAddress(String address) {
            LoggerInFile.printLogToFile("Set address: " + address + '.');
            this.address = address;
        }

        public void setOwner(Human owner) {
            LoggerInFile.printLogToFile("Set owner: " + owner + '.');
            this.student = student;
        }

        public void setSquareMeters(double squareMeters) {
            LoggerInFile.printLogToFile("Set square meters: " + squareMeters + '.');
            this.squareMeters = squareMeters;
        }

        @Override
        public String toString() {
            LoggerInFile.printLogToFile("Call toString from House class.");
            return "House:\n" +
                    "\taddress: " + address + '\n' +
                    "\towner: " + student + '\n' +
                    "\tsquareMeters: " + squareMeters + '\n';
        }
    }

