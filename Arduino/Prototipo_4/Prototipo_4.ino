#include <Servo.h>

Servo servo;
const byte buttonPins[] = {A1, A2};
byte previousButtonStates[] = {HIGH, HIGH};

int servoPosition = 0;
const int servoIncrements[] = {10, -10};

void setup()
{
  Serial.begin(115200);
  for (int p = 0; p < 2; p++)
  {
    pinMode(buttonPins[p], INPUT);
  }
  servo.attach(10);
  servo.write(0);
}

void loop()
{
  for (int b = 0; b < 2; b++)
  {
    boolean moved = false;
    byte currentButtonState = digitalRead(buttonPins[b]);
    if (currentButtonState != previousButtonStates[b] && currentButtonState == LOW)
    {
      servoPosition += servoIncrements[b];
      moved = true;
    }
    if (servoPosition > 180 || servoPosition < 0)
    {
      servoPosition -= servoIncrements[b];
    }
    if (moved)
    {
      servo.write(servoPosition);
      delay(10);
      Serial.println(servoPosition);
    }
    previousButtonStates[b] = currentButtonState;
  }
}
