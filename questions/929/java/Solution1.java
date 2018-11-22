class Solution1 {
    public int numUniqueEmails(String[] emails) {
        if (emails.length >100 || emails.length==0){
            return 0;
        }
        HashSet<String> emailSet = new HashSet<>();
        String localName ="";
        String domainName="";
        for (String s: emails){
            if (s.length()==0){
                return 0;
            }
            String[] splitEmail = s.split("@",2);
            localName = splitEmail[0];
            domainName= splitEmail[1];
            localName = processLocalName(localName);
            String newDomain = localName+"@"+domainName;
            emailSet.add(newDomain);
        }
        
        return emailSet.size();
    }
    
    public String processLocalName(String input){
        String ans="";
        //Check if there is a plus in the string
        if (input.contains("+")){
            //Remove everything after +
            int plusIndex = input.indexOf("+");
            ans = input.substring(0,plusIndex);
        }
        ans = ans.replace(".","");
        return ans;
    }
}