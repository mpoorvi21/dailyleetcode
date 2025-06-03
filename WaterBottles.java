public class WaterBottles {

    public static void main(String[] args) {
WaterBottles waterBottles = new WaterBottles();
waterBottles.numWaterBottles(15,4);
    }
    public int numWaterBottles(int numBottles, int numExchange)
    {
        int ans = numBottles;
        while (numBottles>=numExchange){
            int newBottles = numBottles/numExchange;
            int remBottle = numBottles % numExchange;

            ans = ans + newBottles;
            newBottles = numBottles + remBottle;
        }
        return ans;
    }
}
