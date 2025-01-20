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

        ArrayList<Integer> temps = new ArrayList<Integer>();

        for(int t : temperatures){

            for (int i = 0; i < temps.size(); i++){


                if (temps.get(i) >= t){


                }


            }

        }


        return temps.size();

    }
}
