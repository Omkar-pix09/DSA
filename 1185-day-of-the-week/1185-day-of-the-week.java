class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", 
                          "Thursday", "Friday", "Saturday"};
        
        // Zeller's algorithm treats Jan and Feb as months 13, 14 of the previous year
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        
        int k = y % 100;
        int j = y / 100;
        
        int h = (day + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        // h: 0 = Saturday, 1 = Sunday, 2 = Monday, ...
        
        int index = (h + 6) % 7; // shift so 0 = Sunday
        return days[index];
    }
}