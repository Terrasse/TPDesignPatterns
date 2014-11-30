package eu.telecomnancy.sensor;

public abstract class ISensor extends Observable  {
    /**
     * Enable the sensor.
     */
    public abstract void on();

    /**
     * Disable the sensor.
     */
    public abstract void off();

    /**
     * Get the status (enabled/disabled) of the sensor.
     *
     * @return the current sensor's status.
     */
    public abstract boolean getStatus();

    /**
     * Tell the sensor to acquire a new value.
     *
     * @throws SensorNotActivatedException if the sensor is not activated.
     */
    public abstract void update() throws SensorNotActivatedException;

    /**
     * Get the latest value recorded by the sensor.
     *
     * @return the last recorded value.
     * @throws SensorNotActivatedException if the sensor is not activated.
     */
    public abstract double getValue() throws SensorNotActivatedException;
    
}
