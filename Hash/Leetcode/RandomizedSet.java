package Hash.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {

    private ArrayList<Integer> array;
    private HashMap<Integer, Integer> map;
    private Random random;

    public RandomizedSet() {
        array = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        boolean isExist = map.containsKey(val);
        if (!isExist) {
            array.add(val);
            map.put(val, array.size() - 1);
        }
        return !isExist;
    }

    public boolean remove(int val) {
        boolean isExist = map.containsKey(val);
        if (isExist) {
            int index = map.get(val);
            int lastVal = array.get(array.size() - 1);
            array.set(index, lastVal);
            map.put(lastVal, index);
            array.remove(array.size() - 1);
            map.remove(val);
        }
        return isExist;
    }

    public int getRandom() {
        int idx = random.nextInt(array.size());
        return array.get(idx);
    }

    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        System.out.println(set.insert(45));
        System.out.println(set.insert(45));
        System.out.println(set.insert(15));
        System.out.println(set.getRandom());
        System.out.println(set.remove(45));
        System.out.println(set.array);
        System.out.println(set.map);

    }
}
