package eu.telecomnancy.ui;

import eu.telecomnancy.sensor.ISensor;
import eu.telecomnancy.sensor.Observable;
import eu.telecomnancy.sensor.Observer;
import eu.telecomnancy.sensor.SensorButton;
import eu.telecomnancy.sensor.SensorNotActivatedException;
import eu.telecomnancy.sensor.TurnOffSensor;
import eu.telecomnancy.sensor.TurnOnSensor;
import eu.telecomnancy.sensor.UpdateSensor;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SensorView extends JPanel implements Observer{
    private ISensor sensor;

    private JLabel value = new JLabel("N/A");
    private JButton on = new JButton("On");
    private JButton off = new JButton("Off");
    private JButton update = new JButton("Acquire");

    public SensorView(ISensor c) {
        this.sensor = c;
        this.setLayout(new BorderLayout());
        
        // on l'ajoute à la liste des observers
        this.sensor.addObserver(this);
        
        value.setHorizontalAlignment(SwingConstants.CENTER);
        Font sensorValueFont = new Font("Sans Serif", Font.BOLD, 18);
        value.setFont(sensorValueFont);

        this.add(value, BorderLayout.CENTER);

        TurnOnSensor turnOnSensor=new TurnOnSensor(this.sensor);
        final SensorButton buttonOn=new SensorButton(turnOnSensor);
        TurnOffSensor turnOffSensor=new TurnOffSensor(this.sensor);  
        final SensorButton buttonOff=new SensorButton(turnOffSensor);
        UpdateSensor updateSensor=new UpdateSensor(this.sensor);
        final SensorButton buttonUpdate=new SensorButton(updateSensor);
        
        on.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonOn.press();
            }
        });

        off.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               buttonOff.press();
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               buttonUpdate.press();
            }
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 3));
        buttonsPanel.add(update);
        buttonsPanel.add(on);
        buttonsPanel.add(off);

        this.add(buttonsPanel, BorderLayout.SOUTH);
    }

	@Override
	public void update(Observable o) {
		try {
			this.value.setText(" "+sensor.getValue());
		}
		catch (SensorNotActivatedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
