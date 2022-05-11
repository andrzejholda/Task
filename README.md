# Task
It's a FlightApp where are two functionalities:
1. For requested Flight Number and date will respond with following :

  a. Cargo Weight for requested Flight
  http://localhost:8080/flightCargoWeight/{number}/{departure_Date}

  b. Baggage Weight for requested Flight
http://localhost:8080/flightBaggageWeight/{number}/{departure_Date}
  c. Total Weight for requested Flight
http://localhost:8080/flightTotalWeight/{number}/{departure_Date}
2. For requested IATA Airport Code and date will respond with following :

  a. Number of flights departing from this airport,
http://localhost:8080/flightDepart/{departure_AirportIATACode}/{departure_Date}
  b. Number of flights arriving to this airport,
http://localhost:8080/flightArriv/{arrival_AirportIATACode}/{departure_Date}
  c. Total number (pieces) of baggage arriving to this airport,
http://localhost:8080//flightBaggageArriv/{arrival_AirportIATACode}/{departure_Date}
  d. Total number (pieces) of baggage departing from this airport.
http://localhost:8080//flightBaggageDepart/{arrival_AirportIATACode}/{departure_Date}
