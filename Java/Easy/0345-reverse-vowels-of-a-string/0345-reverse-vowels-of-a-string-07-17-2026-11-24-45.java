class Solution {
    public String reverseVowels(String s) {

        int left = 0;
        int right = s.length() - 1;

        StringBuilder sb = new StringBuilder(s);

        while (left < right) {

            if ("aeiouAEIOU".indexOf(sb.charAt(left)) != -1 &&
                "aeiouAEIOU".indexOf(sb.charAt(right)) != -1) {

                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);

                left++;
                right--;

            } else if ("aeiouAEIOU".indexOf(sb.charAt(left)) == -1) {

                left++;

            } else {

                right--;
            }
        }

        return sb.toString();
    }
}