public class Solution {
    public static void main(String[] args) {
        System.out.println(numOfMatches(7));
    }
    public static int numOfMatches(int n){
        int teams = n;
        int matches = 0;
        int totalmatches = 0;
        while (teams > 1) {
            // if teams are even n/2 matches and n/2 teams advance to the next round
            if(teams%2==0){
                matches = teams/2;
                teams = teams/2;
                totalmatches += matches;
            }
        // if teams are even n-1/2 matches and n-1/2+1 teams advance to the next round
            else{
                matches = (teams - 1)/2;
                teams = (teams - 1)/2 + 1;
                totalmatches += matches;

            }
        }

        return totalmatches;
    }
}
