#include <Servo.h>

Servo servo1;

int LEDState=0;
int LEDPin=2;
int buttonPin=8;
int buttonNew;
int buttonOld=0;
int dt=100;

int LEDPin2=3;
int buttonPin2=9;
int buttonRead;
int angle =1;

void setup() {
  // put your setup code here, to run once:
pinMode(LEDPin, OUTPUT);
pinMode(LEDPin2, OUTPUT);
pinMode(buttonPin, INPUT);
pinMode(buttonPin2, INPUT);

servo1.attach(10);
}

void loop() {
  // put your main code here, to run repeatedly:
buttonNew=digitalRead(buttonPin);
buttonRead=digitalRead(buttonPin2);
if(buttonOld==0 && buttonNew==1){
  if(buttonRead==LOW){
    for(angle==angle, angle<=180, angle+10){
      do{
      servo1.write(angle);
    }while(angle <= 180);
}
}
buttonOld=buttonNew;
delay(dt);
}
}
