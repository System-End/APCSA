public class TemperatureMonth {

    private double[][] temperatures;

    public TemperatureMonth(double[][] t) {
        temperatures = t;
    }

    public double[] getMaxTempWeekly() {
        double[] maxes = new double[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            double max = temperatures[i][0];
            for (int j = 1; j < temperatures[i].length; j++) {
                if (temperatures[i][j] > max) max = temperatures[i][j];
            }
            maxes[i] = max;
        }
        return maxes;
    }

    public double[] getMinTempWeekly() {
        double[] mins = new double[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            double min = temperatures[i][0];
            for (int j = 1; j < temperatures[i].length; j++) {
                if (temperatures[i][j] < min) min = temperatures[i][j];
            }
            mins[i] = min;
        }
        return mins;
    }

    public double getRange() {
        double overallMax = temperatures[0][0];
        double overallMin = temperatures[0][0];

        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures[i].length; j++) {
                if (temperatures[i][j] > overallMax) overallMax =
                    temperatures[i][j];
                if (temperatures[i][j] < overallMin) overallMin =
                    temperatures[i][j];
            }
        }

        return overallMax - overallMin;
    }

    public double getCertainTemp(int week, int day) {
        return temperatures[week][day];
    }
}
