class Solution {
    public String destCity(List<List<String>> paths) {
        for (List<String> path : paths) {
            String city = path.get(1);
            boolean found = false;

            for (List<String> p : paths) {
                if (p.get(0).equals(city)) {
                    found = true;
                    break;
                }
            }

            if (!found)
                return city;
        }

        return "";
    }
}