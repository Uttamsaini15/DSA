class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0, MaxLen=0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int high=0; high<fruits.length; high++){
            freq.put(fruits[high], freq.getOrDefault(fruits[high],0)+1);
            while(freq.size()>2){    //Shrink the size of window
                int leftFruit = fruits[low];
                freq.put(leftFruit, freq.get(leftFruit)-1);
                if(freq.get(leftFruit)==0){
                    freq.remove(leftFruit);
                }
                low++;
            }
            MaxLen = Math.max(MaxLen, high-low+1);
        }
        return MaxLen;
    }
}