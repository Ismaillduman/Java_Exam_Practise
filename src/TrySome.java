
 class TrySome {

        String msg;
        TrySome(String msg){
            this.msg=msg;
        }

    public static void main(String[] args) {
        System.out.println(new StringBuilder("Java"));
        System.out.println(new TrySome("Java") {
        }.msg);
    }
}
