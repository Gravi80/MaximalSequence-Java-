package com.thouhghtworks.sequence;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;

public class SequenceTest {

    Sequence sequence;

    @Test
    public void case1_shouldGiveTheMaximalSubSequence() {
        sequence = new Sequence(Arrays.asList(1,2,3));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("Sum"),IsEqual.equalTo(6));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("StartIndex"),IsEqual.equalTo(0));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("EndIndex"),IsEqual.equalTo(2));
    }

    @Test
    public void case2_shouldGiveTheMaximalSubSequence() {
        sequence = new Sequence(Arrays.asList(-1, 5, 3, 8, 2));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("Sum"),IsEqual.equalTo(18));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("StartIndex"),IsEqual.equalTo(1));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("EndIndex"),IsEqual.equalTo(4));

    }

    @Test
    public void case3_shouldGiveTheMaximalSubSequence() {
        sequence = new Sequence(Arrays.asList(-1, 5, -3, 8, 2));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("Sum"),IsEqual.equalTo(12));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("StartIndex"),IsEqual.equalTo(1));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("EndIndex"),IsEqual.equalTo(4));

    }

    @Test
    public void case4_shouldGiveTheMaximalSubSequence() {
        sequence = new Sequence(Arrays.asList(-1, -5, 3, 8, 2));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("Sum"),IsEqual.equalTo(13));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("StartIndex"),IsEqual.equalTo(2));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("EndIndex"),IsEqual.equalTo(4));

    }

    @Test
    public void case5_shouldGiveTheMaximalSubSequence() {
        sequence = new Sequence(Arrays.asList(-1,5, 3, 8, -2));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("Sum"),IsEqual.equalTo(16));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("StartIndex"),IsEqual.equalTo(1));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("EndIndex"),IsEqual.equalTo(3));

    }

    @Test
    public void case6_shouldGiveTheMaximalSubSequence() {
        sequence = new Sequence(Arrays.asList(1,5, -3, 8, -2));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("Sum"),IsEqual.equalTo(11));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("StartIndex"),IsEqual.equalTo(0));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("EndIndex"),IsEqual.equalTo(3));

    }

    @Test
    public void case7_shouldGiveTheMaximalSubSequence() {
        sequence = new Sequence(Arrays.asList(1,2,-3,4));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("Sum"),IsEqual.equalTo(4));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("StartIndex"),IsEqual.equalTo(0));
        assertThat((Integer)sequence.getMaximalSequenceIndices().get("EndIndex"),IsEqual.equalTo(3));

    }

}
