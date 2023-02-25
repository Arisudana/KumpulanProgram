uint8_t limitState;

#define limitSwitch             2                   // PWM motor pin



void setup(){

  pinMode(limitSwitch, INPUT_PULLUP);
  Serial.begin(115200);  

delay(1000);
}


void loop(){
  limitState = digitalRead(limitSwitch);
  Serial.println(!limitState);
}
