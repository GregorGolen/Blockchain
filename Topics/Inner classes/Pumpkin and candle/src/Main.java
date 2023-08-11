class Pumpkin {

    private boolean forHalloween;

    public Pumpkin(boolean forHalloween) {
        this.forHalloween = forHalloween;
    }

    void addCandle(){
        if(this.forHalloween) {
            Pumpkin.Candle candle = this.new Candle();
            candle.burning();
        }
        else {
            System.out.println("We don't need a candle.");
        }
    }

    class Candle {

        void burning() {
            System.out.println("The candle is burning! Boooooo!");
        }
    }
}
