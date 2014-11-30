package eu.telecomnancy.sensor;

public class LegacyTemperatureSensorAdapter extends ISensor {
	boolean state;
    private double value=0;
    LegacyTemperatureSensor toAdpat;
    
    public LegacyTemperatureSensorAdapter(LegacyTemperatureSensor toAdapt){
    	this.state=false;
    	this.value=0;
    	this.toAdpat = toAdapt;
    }
    
	@Override
	public void on() {
		if(!this.state){
			this.toAdpat.onOff();
			this.state = true;
		}
	}

	@Override
	public void off() {
		if(this.state){
			this.toAdpat.onOff();
			this.state = false;
		}
	}

	@Override
	public void update() throws SensorNotActivatedException {
		if (this.state) {
			this.value=this.toAdpat.getTemperature();
			notifyObservers();
		}
		else throw new SensorNotActivatedException("Sensor must be activated before acquiring new values.");
	}

	@Override
	public boolean getStatus() {
		return this.state;
	}
	
	@Override
	public double getValue() throws SensorNotActivatedException {
		if (this.state) {
			return this.value;
		}
		else {
			throw new SensorNotActivatedException("Sensor must be activated to get its value.");
		}

	}

}
