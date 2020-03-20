# Nyilvantarto

Egyszerű nyílvántartó rendszer, amibe jelenleg 3 könyv és 3 folyóirat van beleégetve.
Jelenlegi állapotában csak keresni lehet az "adatbázisban".

Két keresési lehetőség van:
- Összes listázása + bekér egy kölcsönzési időt
- Típus (Könyv,Folyóirat) + cím részlet alapján keres és bekér egy kölcsönzési időt itt is

A bekért kölcsönzési idővel tudja kiszámítani a kölcsönzés pénzbeni értékét.

2-en tesztelték a programot, névszerint: Nagy Bence és Tenzlinger Kristóf

Sajnos hibát véltem benne felfedezni, amennyiben nem az IntelliJ IDEA által biztosított környezetben futtatom le, hanem konzol (cmd) segítségével magát a jar fájlt indítom el, lehetséges hogy nem a megfelelő Java verzióval próbálja meg a gép lefuttatni, ezért nem fogja engedi az elindítását. (Ez annyiban módosítja a dolgokat, hogy a képernyő törlés funkció a fejlesztői környezetben nem működik, csak Linux és Windows konzol ablakban)
