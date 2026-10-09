class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int prevEnd = intervals[0][1];
        int countToRemove = 0;
        for (int i = 1; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];
            if (currentStart < prevEnd) {
                countToRemove++; 
            } else {
                prevEnd = currentEnd;
            }
        }

        return countToRemove;
    }
}
