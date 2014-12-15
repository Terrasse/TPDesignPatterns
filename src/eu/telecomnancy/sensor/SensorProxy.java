package eu.telecomnancy.sensor;

/**
 * Created with IntelliJ IDEA.
 * User: charoy
 * Date: 13/12/13
 * Time: 18:07
 */
public class SensorProxy extends ISensor {
    private ISensor sensor;
    private SensorLogger log;

    public SensorProxy(ISensor _sensor, SensorLogger sensorLogger) {
        sensor = _sensor;
        log = sensorLogger;
    }

    @Override
    public void on() {
        log.log("on()", "void");
        sensor.on();
    }

    @Override
    public void off() {
        log.log("off()", "void");
        sensor.off();
    }

    @Override
    public boolean getStatus() {
    	boolean value = sensor.getStatus();
        log.log("getStatus()", ""+value);
        return value;
    }

    @Override
    public void update() throws SensorNotActivatedException {
        log.log("update()", "void");
        sensor.update();
        this.notifyObservers();
    }
    
    @Override
    public double getValue() throws SensorNotActivatedException {
    	double value = sensor.getValue();
        log.log("getValue()", ""+value);
        return value;
    }
    
    /**
     * Méthode redefinir pour pouvoir réutiliser le design pattern observer
     */
	public void addObserver(Observer o){
		log.log("addObserver()", "void");
		this.sensor.addObserver(o);
	}
	
    /**
     * Méthode redefinir pour pouvoir réutiliser le design pattern observer
     */
	public void removeObserver(Observer o){
		log.log("removeObserver()", "void");
		this.sensor.removeObserver(o);
	}
	
    /**
     * Méthode redefinir pour pouvoir réutiliser le design pattern observer
     */
	public void notifyObservers(){
		log.log("notifyObservers()", "void");
		this.sensor.notifyObservers();
	}
}
