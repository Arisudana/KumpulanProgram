#include <Servo.h>

Servo servo1;

int button1 = 4;
int button2 = 3;
int button3 = 2;
int led = 11 ;

void setup() {
  // put your setup code here, to run once:
servo1.attach(10);
pinMode(button1, INPUT);
pinMode(button2, INPUT);
pinMode(button3, INPUT);
pinMode(led, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
int ButtonRead1 = digitalRead(button1);
int ButtonRead2 = digitalRead(button2);
int ButtonRead3 = digitalRead(button3);

if(ButtonRead1 == HIGH){
  servo1.write(0);
  digitalWrite(led, LOW);
}else if(ButtonRead2 == HIGH){
  servo1.write(90);
  analogWrite(led, 150);
}else if(ButtonRead3 ==HIGH){
  servo1.write(180);
  analogWrite(led, 250);
}
}
