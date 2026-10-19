class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),result);
        return result;
    }

    void backtrack(String s,int index, List<String> current,List<List<String>> result){
        //String current="";
        //List<String> currResult=new ArrayList<>();
        if(index==s.length()){
            result.add(new ArrayList<>(current));
        }
        
        // if(s.length()<1){
        //     return;
        // }
        for(int i=index;i<s.length();i++){
            String substring=s.substring(index,i+1);
            if(isValid(substring)){
                current.add(substring);
                backtrack(s,i+1,current,result);
                current.remove(current.size()-1);
            }
        }
    }


    public boolean isValid(String current){
        int i=0,j=current.length()-1;
        while(i<=j){
            if(current.charAt(i)!=current.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}