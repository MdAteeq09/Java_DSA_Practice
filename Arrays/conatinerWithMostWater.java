public class conatinerWithMostWater {
    public int maxArea(int[] height) {
        int mw = 0;
        int lp=0, rp= height.length-1;

        while(lp < rp) {
            int w = rp -lp;
            int ht = Math.min(height[lp], height[rp]);
            int cw = w * ht;
            mw = Math.max(mw, cw);

            if(height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return mw;
    }
    public static void main(String[] args) {
        conatinerWithMostWater sol = new conatinerWithMostWater();
        int height [] = {1,8,6,2,5,4,8,3,7};
        System.out.println(sol.maxArea(height));
    }
}
