class Solution {

    public int countCharacters(String[] words, String chars) {

        int[] freq = new int[26];

        for (char ch : chars.toCharArray()) {
            freq[ch - 'a']++;
        }

        int answer = 0;

        for (String word : words) {

            int[] copy = freq.clone();
            boolean possible = true;

            for (char ch : word.toCharArray()) {

                copy[ch - 'a']--;

                if (copy[ch - 'a'] < 0) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                answer += word.length();
            }
        }

        return answer;
    }
}