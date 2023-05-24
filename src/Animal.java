    //Q_39
    class Animal{
        String type="Canine";
        int maxSpeed=60;
        Animal(){

        }

       Animal(String type, int maxSpeed) {
            this.type = type;
            this.maxSpeed = maxSpeed;
        }
    }

    class WildAnimal extends Animal{
        String bounds;

         WildAnimal(String bounds) {
          //this("canine",60,"short");
          super();
             this.bounds = bounds;
        }

        public WildAnimal(String type, int maxSpeed, String bounds) {
          super(type, maxSpeed);
            this.bounds = bounds;
        }



    public static void main(String[] args) {
        WildAnimal wolf= new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline",80,"Short");
        System.out.println(wolf.maxSpeed+wolf.bounds+wolf.type);
        System.out.println(tiger.maxSpeed+tiger.bounds+tiger.type);
        System.out.println(""+1+2+"result "+1+2);
    }
}

