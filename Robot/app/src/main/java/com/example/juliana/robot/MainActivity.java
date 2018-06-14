package com.example.juliana.robot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import lejos.remote.nxt.NXTConnection;
import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.remote.nxt.BTConnector;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.DexterPressureSensor250;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTConnector connector = new BTConnector();

        System.out.println("0. Auf Signal warten");

        NXTConnection conn = connector.waitForConnection(0, NXTConnection.RAW);

        InputStream is = conn.openInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String message = "";

        while (true){

            System.out.println("1. Schleife gestartet");
            message = "";

            try {
                message = br.readLine();
                System.out.println("2. Message: " + message);
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }

    }
}
