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
servo1.write(0);
}

void loop() {
  // put your main code here, to run repeatedly:
  //Tombol ON/OFF
  cekSudut();
buttonRead = digitalRead(buttonPin2);
buttonNew=digitalRead(buttonPin);
if(buttonOld==0 && buttonNew==1 && buttonRead == LOW){
  servo1.write(angle);
  }else{
    digitalWrite(LEDPin, LOW);
    LEDState=0;
  }
  buttonOld=buttonNew;
delay(dt);
}


void cekSudut(){
  if(angle == 0){
  angle = angle += 10;
  do{
    angle = angle += 10;
  }while(angle<180);
}else if(angle == 180){
  angle = angle -= 10;
  do{
  angle = angle -= 10;
}while(angle<180);
}
}
