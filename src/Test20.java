abstract class Animals {



        private String name;

        Animals(String name) {
            this.name = name;
        }


        public String getName() {
            return name;
        }
    }

    class Dog extends Animals {
        private String breed;
        Dog(String breed) {
super("");
            this.breed = breed;
        }

        Dog(String name, String breed) {
            super(name);
            this.breed = breed;
        }

        public String getBreed() {
            return breed;
        }
    }

    public class Test20 {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Beagle");
            Dog dog2 = new Dog("Bubbly", "Poodle");
            System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
                    dog2.getName() + ":" + dog2.getBreed());
        }
    }

