class RandomizedSet {

    private HashMap<Integer, Integer> randomSet;
    private List<Integer> randomList;
    private Random rand;

    public RandomizedSet() {
        randomSet = new HashMap<Integer, Integer>();
        randomList = new ArrayList<Integer>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (randomSet.containsKey(val)) {
            return false;
        }
        randomList.add(val);
        randomSet.put(val, randomList.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!randomSet.containsKey(val)) {
            return false;
        }
        int index = randomSet.get(val);
        int lastElement = randomList.get(randomList.size() - 1);
        randomList.set(index, lastElement);
        randomSet.put(lastElement, index);
        randomList.remove(randomList.size() - 1);
        randomSet.remove(val);
        return true;
    }

    public int getRandom() {
        int rndIndex = rand.nextInt(randomList.size());
        return randomList.get(rndIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */