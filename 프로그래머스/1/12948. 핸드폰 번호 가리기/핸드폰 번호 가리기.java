class Solution {
    public String solution(String phone_number) {
        int size = phone_number.length();
        String answer = "";
        answer += "*".repeat(size-4);
        answer += phone_number.substring(size-4,size);
        return answer;
    }
}