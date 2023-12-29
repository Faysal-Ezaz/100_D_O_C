public class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int n = batteryPercentages.length;
        int testedDevices = 0;

        for (int i = 0; i < n; ++i) {
            if (batteryPercentages[i] > 0) {
                ++testedDevices;

                for (int j = i + 1; j < n; ++j) {
                    batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
                }
            }
        }

        return testedDevices;
    }
}
