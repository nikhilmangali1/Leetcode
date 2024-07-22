class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> mp = new HashMap<>();
        for(int i =0;i<heights.length;i++){
            mp.put(heights[i],names[i]);
        }
        TreeMap<Integer,String> tm = new TreeMap<>(Comparator.reverseOrder());
        tm.putAll(mp);
        int i = 0;
        for(String name:tm.values()){
            names[i] = name;
            i+=1;
        }         
        return names;
    }
}