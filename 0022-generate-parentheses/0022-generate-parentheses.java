class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        myfunction(list, "", 0,0, n);
        return list;
    }
    private void myfunction(ArrayList<String> list, String str, int start, int end , int max){
        if( str.length() == max*2){
            list.add(str);
            return;
        }

        if( start < max ){
            myfunction(list ,str+"(" , start + 1 , end , max);
        }
        if( end < start ){
            myfunction(list , str+")" , start , end + 1, max);
        }
    }
}