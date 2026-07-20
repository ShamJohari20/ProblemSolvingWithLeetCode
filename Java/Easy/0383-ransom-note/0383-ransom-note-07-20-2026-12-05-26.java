class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list = new ArrayList<>();

        for(char ch : magazine.toCharArray()){
            list.add(ch);
        }

        for(char ch : ransomNote.toCharArray()){
            if(!list.contains(ch)){
                return false;
            }
            list.remove(Character.valueOf(ch));
        }
        return true;
    }
}