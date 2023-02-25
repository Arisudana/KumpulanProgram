#include <ESP32Servo.h>

Servo myServo;

int servoPin =18;

void setup() {
  // Allow allocation of all timers
  ESP32PWM::allocateTimer(0);
  ESP32PWM::allocateTimer(1);
  ESP32PWM::allocateTimer(2);
  ESP32PWM::allocateTimer(3);
  myServo.setPeriodHertz(50);    // standard 50 hz servo
  myServo.attach(servoPin, 500, 2400); // attaches the servo on pin 18 to the servo object

}

void loop() {
  // put your main code here, to run repeatedly:
  myServo.write(0);
  delay(1000);
  myServo.write(180);
  delay(1000);
}
