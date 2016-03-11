public class Props {
        private Properties props;

        /**
         * Method for parse String property of object props, by name
         * @param name  property name to parse
         * @return      the integer represented by the string argument of props object in the decimal radix
         * @throws MissingPropertiesException   if property missing or value less or equal zero
         * @throws NumberFormatException        if string in property doesn't contain a parsable int
         */
        private int getIntProperty(String name) throws Exception {
            String strValue = props.getProperty(name);
            // check existence of property
            if (strValue == null)
                throw new MissingPropertiesException("Property \"" + name + "\" missing");

            int value = Integer.parseInt(strValue, 10);
            // check the positivity
            if (value <= 0)
                throw new Exception("Property \"" + name + "\" must be positive");

            return value;
        }

        private void checkDivisibility(int number, int divisor, String message) throws Exception {
            if ((number % divisor) != 0)
                throw new Exception(message);
        }

        public void getTimes(Properties props) throws Exception {
            this.props = props;
            int interval = getIntProperty("interval");
            int duration = getIntProperty("duration");
            checkDivisibility(duration, interval, "Duration must be a multiply of interval");
            // export to global
            monitorTime = duration;
            int departure = getIntProperty("departure");
            checkDivisibility(departure, interval, "Departure must be a multiply of interval");
            // export to global
            departureOffset = departure;
        }
    }
