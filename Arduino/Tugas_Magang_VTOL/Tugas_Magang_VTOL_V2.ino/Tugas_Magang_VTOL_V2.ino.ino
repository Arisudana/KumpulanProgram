#include<Servo.h>

Servo myservo;  // create servo object to control a servo
#define servoPin 10 //~
#define pushButtonPin 9

int angle =0;    // initial angle  for servo (beteen 1 and 179)
int angleStep =10;
const int minAngle = 0;
const int maxAngle = 180;

const int type =2;//watch video for details. Link is at the top of this code (robojax)

int buttonPushed =0;

void setup() {
  // Servo button demo by Robojax.com
  Serial.begin(9600);          //  setup serial
  myservo.attach(servoPin);  // attaches the servo on pin 3 to the servo object
  pinMode(pushButtonPin,INPUT_PULLUP);
   Serial.println("Robojax Servo Button ");
   myservo.write(angle);//initial position
}

void loop() {
  if(digitalRead(pushButtonPin) == HIGH){
    buttonPushed = 1;
  }
   if( buttonPushed ){
  // change the angle for next time through the loop:
  angle = angle + angleStep;

    // reverse the direction of the moving at the ends of the angle:
    if (angle >= maxAngle) {
      angleStep = -angleStep;
        if(type ==1)
        {
            buttonPushed =0;                   
        }
    }
    
    if (angle <= minAngle) {
      angleStep = -angleStep;
       if(type ==2)
        {
            buttonPushed =0;       
        }
    }
    
    myservo.write(angle); // move the servo to desired angle
      Serial.print("Moved to: ");
      Serial.print(angle);   // print the angle
      Serial.println(" degree");    
  delay(100); // waits for the servo to get there
   }

  
}
