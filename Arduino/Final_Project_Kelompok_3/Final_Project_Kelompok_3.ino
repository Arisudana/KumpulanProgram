int BUTTON_PIN = 3;
int RELAY_PIN  = 2; 

int relayState = LOW;   
int lastButtonState;    
int currentButtonState; 

void setup() {
  Serial.begin(9600);               
  pinMode(BUTTON_PIN, INPUT_PULLUP);
  pinMode(RELAY_PIN, OUTPUT);        

  currentButtonState = digitalRead(BUTTON_PIN);
}

void loop() {
  lastButtonState    = currentButtonState;      
  currentButtonState = digitalRead(BUTTON_PIN); 

  if(lastButtonState == HIGH && currentButtonState == LOW) {
    relayState = !relayState;

    // control relay arccoding to the toggled state
    digitalWrite(RELAY_PIN, relayState); 
  }
}
