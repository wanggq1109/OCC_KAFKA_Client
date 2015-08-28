package com.plocc.kafka.producter;

import kafka.utils.VerifiableProperties;

import java.util.Random;

/**
 * Created by wgq on 2015/7/29.
 */
public class PartitionerImpl implements kafka.producer.Partitioner {
    private Random random = new Random();

    public PartitionerImpl(VerifiableProperties verifiableProperties) {
    }

    public int partition(Object key, int numPartitions) {
        try {
            return random.nextInt(numPartitions);
        } catch (Exception e) {
            return Math.abs(key.hashCode() % numPartitions);
        }
    }
}
