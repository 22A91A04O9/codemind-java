class Solution {
    static int setKthBit(int n, int k) {
        // code here
        int mask = 1<< k;
        k = n | mask;
        return k;
    }
}