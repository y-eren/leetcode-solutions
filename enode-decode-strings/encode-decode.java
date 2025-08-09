class Solution {

    
    public static String encode(List<String> strs) {
        String encodedMessage = "";
        for (int i = 0; i< strs.size(); i++) {
         encodedMessage += strs.get(i).length();
            encodedMessage += "#";
            encodedMessage += strs.get(i);
            
        }
        return encodedMessage;
    }
    
     public static List<String> decode(String str) {
        List<String> liste = new ArrayList<>();
        
        int i = 0;
        
        while(i < str.length()) {
            int j = i;
            
            while(str.charAt(j) != '#') {
                j++;
            }
            
            
        int len = Integer.parseInt(str.substring(i, j));
        
        j++;
        
        liste.add(str.substring(j, j + len));
        
        i = j + len;
            
        }
        
        return liste;
    }
}
