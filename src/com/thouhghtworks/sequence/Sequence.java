package com.thouhghtworks.sequence;

import java.util.HashMap;
import java.util.List;

public class Sequence {

    private List<Integer> sequence;

    public Sequence(List<Integer> sequence) {
        this.sequence = sequence;
    }

    public HashMap<String, Object> getMaximalSequenceIndices() {
        HashMap<String, Object> indexAndSum = new HashMap<String, Object>();
        indexAndSum.put("Sum", 0);
        for (int i = 0; i < sequence.size(); i++) {
            int sum = sequence.get(i);
            for (int j = i + 1; j < sequence.size(); j++) {
                sum = sum + sequence.get(j);
                if (sum > (Integer) indexAndSum.get("Sum")) {
                    indexAndSum.put("Sum", sum);
                    indexAndSum.put("StartIndex",i);
                    indexAndSum.put("EndIndex",j);
                }
            }
        }
        return indexAndSum;
    }

}
