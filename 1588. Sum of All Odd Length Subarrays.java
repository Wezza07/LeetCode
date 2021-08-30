class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1 ; i<n ; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        int sum = prefix[n-1];
        int i=0 , j=0;
        while (i<n){
            j = i+2;
            while(j<n){
                if((j-i+1)%2!=0){
                    if (i==0){
                        sum+=prefix[j];
                    }else{
                        sum+=prefix[j]-prefix[i-1];
                    }
                }
                j+=2;
            }
            i++;
        }
        return sum;
    }
}
