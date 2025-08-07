class Solution {
    public boolean isAnagram(String s, String t) {

        char[] aray1 = s.toCharArray();
        char[] aray2 = t.toCharArray();

        Arrays.sort(aray1);
        Arrays.sort(aray2);
        
        String a = new String(aray1);
        String b = new String(aray2);
        if(a.equals(b))
        return true;
        return false;

    }
}
