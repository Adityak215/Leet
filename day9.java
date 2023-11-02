import java.util.*;
class day9 {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();

    Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

    for (int[] interval : intervals)
      if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0])
        ans.add(interval);
      else
        ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);

    return ans.toArray(int[][] ::new);
    }
}


// int[][] ans;
//         for(int i=0; i<intervals.length-1;i++)
//         {
//             if(intervals[i][1]>=intervals[i+1][0])
//             {
//                 ans[i]=[intervals[i][0],intervals[i+1][1]];
//             }
//             else
//             {
//                 ans[i]=intervals[i];
//             }
//         }
//         return ans;  
// LOGIC yahi hai, but wayyyy off on syntax

