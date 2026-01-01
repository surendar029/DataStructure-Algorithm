package Heap;

import java.util.*;

class WordFreqComparator implements Comparator<Map.Entry<String, Integer>> {
    public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
        if (a.getValue().equals(b.getValue())) {
            return a.getKey().compareTo(b.getKey());
        }
        return a.getValue() - b.getValue();
    }
}

public class TopKFrequent {
    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
        Queue<Map.Entry<String, Integer>> freqs = new PriorityQueue<>(new WordFreqComparator());
        for (Map.Entry<String, Integer> freq : map.entrySet()) {
            freqs.add(freq);
            if (freqs.size() > 2) {
                freqs.poll();
            }
        }
        List<String> result=new ArrayList<>();
        while(!freqs.isEmpty()){
            result.add(0,freqs.poll().getKey());
        }
        System.out.println(map);
        System.out.println(result);
    }
}
