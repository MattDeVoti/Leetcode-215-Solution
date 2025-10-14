package org.example;

import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};

        System.out.println(new Solution().findKthLargest(nums, 2));
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> topK = new PriorityQueue<Integer>();

        for(int n : nums){
            if(topK.size()==k && topK.peek()<n){
                topK.poll();
                topK.add(n);
            } else if(topK.size()<k){
                topK.add(n);
            }
        }

        return topK.peek();
    }
}