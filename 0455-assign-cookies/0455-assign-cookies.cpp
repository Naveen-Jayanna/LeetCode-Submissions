class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.begin(), g.end());
        sort(s.begin(), s.end());
        int child = 0;
        for(double cookie = 0; child < g.size() && cookie < s.size(); cookie++){
            if(s[cookie]>=g[child]){
                child++;
            }
        }
        return child;
    }
};