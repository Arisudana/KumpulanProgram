#include <Servo.h>

Servo servo1;

int led1 = 2;
int led2 = 3;
int button1 = 8;
int button2 = 9;
int flag = 0;

int puter = 0;

void setup() {
  // put your setup code here, to run once:
servo1.attach(10);
pinMode(button1, INPUT);
pinMode(button2, INPUT);
pinMode(led1, OUTPUT);
pinMode(led2, OUTPUT);

servo1.write(0);
}

void loop() {
  // put your main code here, to run repeatedly:
 if(digitalRead(button1)==HIGH){
  if(flag==0){
    flag=1;
    digitalWrite(led1, HIGH);
  }
  }else if(digitalRead(button1)==HIGH){
    if(flag==1){
      flag=0;
    }
    digitalWrite(led1, LOW);
  }
  puterputer();
}

void puterputer(){
  if((flag==1)&&(digitalRead(button2)==HIGH)){
      puter = puter + 10;
    if(puter <= 180){
      servo1.write(puter);
    }else{
    }
}
}



/*
void onOff(){
    if(digitalRead(button1)==HIGH){
  if(flag==0){
    flag=1;
    digitalWrite(led1, HIGH);
  }else{
    flag=0;
    digitalWrite(led1, LOW);
  }
  delay(1000);
}
  }

void servoGerak(){
  if((digitalRead(button2)==HIGH) && (flag==1) == true){
  //for(int i = 0; i <= 180; i+10){
    servo1.write(90);
    digitalWrite(led2, HIGH);
  //}
}else if(flag==0){
  digitalWrite(led2, LOW);
  }
  delay(1000);
 }
 */
