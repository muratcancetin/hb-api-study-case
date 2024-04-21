@StatusCodeCheck
Feature: Status Code degeri 200 ise basarili degilse basarisiz degerlendirilecek test case senaryosu

  @StatusCode200 @GETMethod
  Scenario: GET method ile istek atilarak status code degeri basarili olarak kabul edilir
    * Status Code degerini 200 olarak ayarla ve "GET" metodu ile istek at
    Then Status Code degerinin 200 oldugu dogrulanir

  @StatusCode400 @GETMethod
  Scenario: GET method ile istek atilarak status code degeri basarisiz kabul edilir
    * Status Code degerini 400 olarak ayarla ve "GET" metodu ile istek at
    Then Status Code degerinin 400 oldugu dogrulanir ve test basarisiz kabul edilir

#  @StatusCode500 @GETMethod
#  Scenario: GET metod ile istek atilarak status code degeri kontrol edilir
#    * Status Code degerini 500 olarak ayarla ve "GET" metodu ile istek at
#    Then Status Code degerinin 500 oldugu dogrulanir

  @StatusCode200 @POSTMethod
  Scenario: POST method ile istek atilarak status code degeri basarili olarak kabul edilir
    * Status Code degerini 200 olarak ayarla ve "POST" metodu ile istek at
    Then Status Code degerinin 200 oldugu dogrulanir

  @StatusCode400 @POSTMethod
  Scenario: POST method ile istek atilarak status code degeri basarisiz kabul edilir
    * Status Code degerini 400 olarak ayarla ve "POST" metodu ile istek at
    Then Status Code degerinin 400 oldugu dogrulanir ve test basarisiz kabul edilir

#  @StatusCode500 @POSTMethod
#  Scenario: POST metod ile istek atilarak status code degeri kontrol edilir
#    * Status Code degerini 500 olarak ayarla ve "POST" metodu ile istek at
#    Then Status Code degerinin 500 oldugu dogrulanir ve test basarisiz kabul edilir