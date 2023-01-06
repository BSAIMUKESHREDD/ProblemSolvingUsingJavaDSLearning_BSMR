package LeetCode;

import java.util.PriorityQueue;

public class E1921liminateMaximumNumberofMonsters {


    public int eliminateMaximum(int[] dist, int[] speed) {
        /* Calculate the time for each monster to reach the
           city and start elimiating one every minute starting
           from 0 with one with least time until any monster
           reaches a city. */
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (int i = 0; i < dist.length; i++) {
            pq.add(dist[i] * 1.0 / speed[i]);
        }

        double min = 0.0;
        int count = 0;
        while (!pq.isEmpty() && pq.poll() > min) {
            min += 1.0;
            count++;
        }

        return count;}

}

/*
    public int eliminateMaximum(int[] dist, int[] speed) {
        int eliminatedMonsters = 0;
        if(dist.length==0)return eliminatedMonsters;
        for (int i = 0; i < speed.length; i++) {
            decreaseArrayByOne(dist);
            if(dist[i]<speed[i] || dist[i]==0) return eliminatedMonsters;
            else eliminatedMonsters++;
        }
        return eliminatedMonsters;
    }


    public void decreaseArrayByOne(int[] dist){
        for (int i = 0; i < dist.length; i++) {
            dist[i]--;
        }
    }

 */

