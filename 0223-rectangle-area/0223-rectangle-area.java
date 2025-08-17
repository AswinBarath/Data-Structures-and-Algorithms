class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area_sum = areaCalc(ax1,ax2,ay1,ay2) + areaCalc(bx1,bx2,by1,by2);
        int cx1 = Math.max(ax1, bx1);
        int cy1 = Math.max(ay1, by1);
        int cx2 = Math.min(ax2, bx2);
        int cy2 = Math.min(ay2, by2);
        // int area_overlap = (cx2 - cx1) * (cy2 - cy1);
        int area_overlap = areaCalc(cx1,cx2,cy1,cy2);
        return area_sum - area_overlap;
    }
    int areaCalc(int x1, int x2, int y1, int y2) {
        // Taking max to avoid edge cases of invalid rectangle coordinates
        int area = Math.max(0, x2 - x1) * Math.max(0, y2 - y1);
        // Debugging
        // System.out.println(area);
        return area;
    }
}

/*
answer = sum of two areas - overlap area

overlap rectangle coordinates:
cx1 = max(ax1, bx1)
cx2 = min(ax2, bx2)
cy1 = max(ay1, by1)
cy2 = min(ay2, by2)

overlap area = max(0, cx2 - cx1) * max(0, cy2 - cy1)

done!
Credits to comment: https://leetcode.com/problems/rectangle-area/description/comments/1686985/
*/