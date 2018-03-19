# Nalazenje-poslednjeg-digita-N-tog-fibonacijevog-broja

##  Objasnjenje:
 Ulaz je uradjen preko klase Scanner. Po unosu provera se dali je broj veci od nule, ako jeste poziva se metoda getNumbersList(input)
 koja izracunava trazeni broj. Metod radi tako sto kreira niz numbers koji ima dva clana 0 i 1, koji imaju vrednost prva dva clana
 fibonacijev niza - zato for petlja krece od indeksa 2. Na osnovu njih se racuna sledeci fibonacijev broj kao res = number1 + number
 i zatim se niz setuje tako sto se res stavlja na poziciju sa indeksom 1 a predhodni n-1 broj zauzima mesto sa indeksom 0 - pomera se
 na levo. For petlja tako racuna sve do trazenog fibonacijevo broja a u nizu se nalaze samo dva clana. Poslednji
 digit moze da se racuna na dva nacina. Prevede se u string pa se nadje duzina stringa i onda se preko naredbe
 substring(duzina Stringa umanjena za jedan) nadje poslednji digit. Drugi nacin je preko number % 10 moduo broja podeljen sa deset.
 Za izlazak pritisnite bilo koji slovni taster