class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles; 
        int emptyBottles = numBottles;
        while(emptyBottles >= numExchange){
            numBottles = emptyBottles/numExchange;
            res += numBottles;
            emptyBottles = (emptyBottles % numExchange) + numBottles;
        }
        return res;
    }
}