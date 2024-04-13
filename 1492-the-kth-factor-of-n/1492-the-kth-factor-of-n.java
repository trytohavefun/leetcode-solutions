class Solution {
    public int kthFactor(int n, int k) {
        for(int i=1;i<=n;i++)
            if(n % i==0 && --k==0)
                return i;
        return -1;
        
        // List<Integer> list = new ArrayList<>();
        // list.add(1);
        // for(int i=2;i<n;i++)
        //     if(n % i==0)
        //         list.add(i);
        // list.add(n);
        // if(list.size() < k)
        //     return -1;
        // return list.get(k-1);
        
    }
}