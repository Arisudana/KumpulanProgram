#include <EEPROM.h>
const int buttonPin1 = 8;
const int buttonPin2 = 9;
#include <Servo.h>
Servo myservo;
int buttonState1 = 0;
int buttonState2 = 0;  
int putar= 0;
int d = 0;
int a= 10, c=0;
void setup() {
  pinMode(buttonPin1, INPUT);
  pinMode(buttonPin2, INPUT);
  myservo.attach(10);
  
}
void loop(){
  buttonState1 = digitalRead(buttonPin1);
  buttonState2 = digitalRead(buttonPin2);
  if (buttonState1 == HIGH){
    if( a <=180 && c ==0){
    if(buttonState2 == HIGH){
        myservo.write(a);
        a = a+10; 
        delay(1000); 
      }
     else if(buttonState2 == LOW){
       myservo.write(a);
     }
     if(a==180)
     c=1;
      
    }
    else if( a > 180 || c==1){
      if(buttonState2 == HIGH){
        
        myservo.write(a);
        a = a - 10;
        delay(1000);
          
      }
     else if(buttonState2 == LOW){
       myservo.write(a);
    }
    if(a==0)
    c=0;
      }
   
  else if(buttonState1 == LOW){
    myservo.write(a);
  }
  }

}
