class GCD
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE
        int hcf=gcd(arr[0],arr[1]);
        for(int i=2;i<num;i++){
            hcf=gcd(arr[i],hcf);
        }
        return hcf;
    }

    int gcd(int a,int b){
        if(b==0)
        {
            return a;
        }
        else{
            return gcd(b,a%b);
        }

    }
    // METHOD SIGNATURE ENDS
}