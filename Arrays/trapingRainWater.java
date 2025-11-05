public class trapingRainWater {
    public int trap(int[] height) {
        int n = height.length, ans =0, l=0, r=n-1, lm=0, rm=0;

        while(l < r) {

            lm = Math.max(lm, height[l]);// left max
            rm = Math.max(rm, height[r]);//right max

            if(lm < rm) {
                ans += lm - height[l];
                l++;
            } else {
                ans += rm - height[r];
                r--;
            }
        }
        return ans;
    }
    public static void main(String [] args) {
        trapingRainWater sol = new trapingRainWater();
        int ht [] = {4,2,0,3,2,5};
        System.out.print(sol.trap(ht));
    }
}
