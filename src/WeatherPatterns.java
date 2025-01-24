import java.util.ArrayList;

/**
 * The class WeatherPatterns finds the longest span of days in which
 * each day’s temperature is higher than on the previous day in that sequence.
 *
 * @author Zach Blick
 * @author Stefan Perkovic
 */

public class WeatherPatterns {

    /**
     * Longest Warming Trend
     * @param temperatures
     * @return the longest run of days with increasing temperatures
     */
    public static int longestWarmingTrend(int[] temperatures) {
        int n = temperatures.length;
        // Edge case check where result is array length
        if (n <= 1) {
            return n;
        }
        // Initialize array to store length of longest increasing subsequence at each index starting at 1
        int[] dynamic = new int[n];
        for (int i = 0; i < n; i++) {
            dynamic[i] = 1;
        }
        int maxLength = 1;
        // Goes through the temperatures to compute the longest increasing subsequence for each index.
        for (int i = 1; i < n; i++) {
            // Check all previous temperatures
            for (int j = 0; j < i; j++) {
                // Check if it has longer subsequence
                if (temperatures[i] > temperatures[j]) {
                    // Update dynamic[i] to maximize subsequence length
                    if (dynamic[j] + 1 > dynamic[i]) {
                        dynamic[i] = dynamic[j] + 1;
                    }
                }
            }
            // Update maxLength if new one is higher
            if (dynamic[i] > maxLength) {
                maxLength = dynamic[i];
            }
        }
        return maxLength;
    }
}