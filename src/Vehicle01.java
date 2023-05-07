 class Vehicle01 {
    int x;
     Vehicle01() {
        this(10);
    }
   Vehicle01(int x) {
        this.x = x;
    }

    public static class car extends Vehicle01{
        int y;

       car() {
            super(10);
        }

      car( int y) {
            super(y);
            this.y = y;
        }
        public String toString(){
            return super.x+" : "+this.y;
        }
    }

    public static void main(String[] args) {
        Vehicle01 y= new car(20);
        System.out.println(y);
    }
}
