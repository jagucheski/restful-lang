package br.com.jagucheski.restfullang.uitls.time;

import java.time.Duration;
import java.time.Instant;

public enum SpeedTimeType {

    /**
     * The minutos.
     */
    MINUTOS {
        @Override
        public String getMessageAndCalculate(Instant initialTime) {
            return getDuration(initialTime) + getMessage();
        }

        @Override
        public long getDuration(Instant initialTime) {
            return Duration.between(initialTime, Instant.now()).toMinutes();
        }

        @Override
        public String getMessage() {
            return " minuto(s)";
        }
    },

    /**
     * The segundos.
     */
    SEGUNDOS {
        @Override
        public String getMessageAndCalculate(Instant initialTime) {
            return getDuration(initialTime) + getMessage();
        }

        @Override
        public long getDuration(Instant initialTime) {
            return Duration.between(initialTime, Instant.now()).getSeconds();
        }

        @Override
        public String getMessage() {
            return " segundo(s)";
        }
    },

    /**
     * The milisegundos.
     */
    MILISEGUNDOS {
        @Override
        public String getMessageAndCalculate(Instant initialTime) {
            return getDuration(initialTime) + getMessage();
        }

        @Override
        public long getDuration(Instant initialTime) {
            return Duration.between(initialTime, Instant.now()).toMillis();
        }

        @Override
        public String getMessage() {
            return " milisegundo(s)";
        }
    };

    /**
     * Gets the message and calculate.
     *
     * @param initialTime the initial time
     * @return the message and calculate
     */
    public abstract String getMessageAndCalculate(Instant initialTime);

    /**
     * Gets the message.
     *
     * @return the message
     */
    public abstract String getMessage();

    /**
     * Gets the duration.
     *
     * @param initialTime the initial time
     * @return the duration
     */
    public abstract long getDuration(Instant initialTime);

}
