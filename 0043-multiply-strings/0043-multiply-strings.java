class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int n = num1.length();
        int m= num2.length();

        int[] res= new int[n+m]; 

        for(int i= n-1; i >= 0 ; i--){
            for(int j= m-1 ; j >= 0; j--){
                int di1= num1.charAt(i) - '0';
                int di2 = num2.charAt(j) - '0';

                int pro= di1 * di2;

                int pos1= i+j;
                int pos2 = i + j+1;

                int sum = pro + res[pos2];

                res[pos2]= sum % 10;
                res[pos1] += sum / 10;
            }
        }
        StringBuilder val = new StringBuilder();
        for(int dig : res){
            if(val.length() == 0 && dig ==0){
                continue;
            }
            val.append(dig);
        }
        return val.toString();
    }
}