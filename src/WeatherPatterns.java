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

        if (n <= 1) {
            return n;
        }

        int[] dynamic = new int[n];
        int maxLength = 1;


        for (int i = 0; i < n; i++) {
            dynamic[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (temperatures[i] > temperatures[j]) {
                    if (dynamic[j] + 1 > dynamic[i]) {
                        dynamic[i] = dynamic[j] + 1;
                    }

                }
            }

            if (dynamic[i] > maxLength) {
                maxLength = dynamic[i];
            }


        }


        return maxLength;

    }
}
