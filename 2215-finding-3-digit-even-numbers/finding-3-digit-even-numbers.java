class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int d : digits){
            map.put(d,map.getOrDefault(d,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=100; i<1000; i+=2){
            int x = i;
            int c = x%10; x/=10;
            int b = x%10; x/=10;
            int a = x;
            if(map.getOrDefault(a,0)>0){
                map.put(a,map.get(a)-1);
                if(map.getOrDefault(b,0)>0){
                    map.put(b,map.get(b)-1);
                    if(map.getOrDefault(c,0)>0){
                        list.add(i);
                    }
                    map.put(b,map.get(b)+1);
                }
                map.put(a,map.get(a)+1);
            }
    }
    int res[] = new int[list.size()];
    for(int i=0; i<list.size();i++){
        res[i] = list.get(i);
    }
    return res;
}
}