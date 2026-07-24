class Solution {

    public int numEquivDominoPairs(int[][] dominoes) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int answer = 0;

        for (int[] domino : dominoes) {

            int small = Math.min(domino[0], domino[1]);
            int large = Math.max(domino[0], domino[1]);

            int key = small * 10 + large;

            answer += map.getOrDefault(key, 0);

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return answer;
    }
}