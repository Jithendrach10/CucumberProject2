Feature: verifying  adactinHotel details

  Scenario Outline: verifying adactin login with invalid credentails
    When user should enter "<username>"and"<password>"
    When user should  searchhotel "<location>","<hotels>","<roomTypes>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>","<childrenPerRoom>"
    When user should selectHotel 
    When user should bookAHotel  "<firstName>","<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<expMonth>","<expYear>","<CVVNumber>"
   
    Then user should verify success message

Examples:
   |username     |password |location|hotels     |roomTypes|noOfRooms|checkInDate|checkOutDate|adultPerRoom|childrenPerRoom|firstName|lastName|billingAddress|creditCardNo    |creditCardType|expMonth|expYear|CVVNumber|value|OrderNo|myItinerary|
   |Jithendra7989|Jith8888@|Sdyney  |Hotel Creek|Standard |2 - Two  | 20/05/2022| 21/05/2022 |1 - One     |1 - One        |Jithendra|ch      |Chennai       |1234567891987654|VISA          |May      |2022  |456  |
   
  

