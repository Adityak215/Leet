class day1 {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
        return 0;
        int min=prices[0];
        int prof=0,maxprof=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            min=prices[i];

            prof=prices[i]-min;

            if(maxprof<prof)
            maxprof=prof;
        }
        return maxprof;
    }
}