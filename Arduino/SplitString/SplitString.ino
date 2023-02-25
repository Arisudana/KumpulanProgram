String MACadd = "AA:BB:CC:11:22:33";
String strs[20];
uint8_t address[6];
int StringCount = 0;

void setup() {
  // put your setup code here, to run once:
  while (MACadd.length() > 0)
  {
    int index = MACadd.indexOf(';');
    if (index == -1) // No space found
    {
      strs[StringCount++] = MACadd;
      break;
    }
    else
    {
      strs[StringCount++] = MACadd.substring(0, index);
      MACadd = MACadd.substring(index+1);
    }
  }

  // Show the resulting substrings
  for (int i = 0; i < StringCount; i++)
  {
    Serial.print(strs[i]);
  }
std::cout << typeid(strs).name();
}

void loop() {
  // put your main code here, to run repeatedly:

}
