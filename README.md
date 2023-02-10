# SzpitalRazJeszcze
Ćwiczenie

Napisz program, który będzie symulował zarządzanie szpitalem w polskich realiach. Zdefiniuj klasy:

    Person - przechowuje imię i nazwisko osoby oraz informację o wysokości wypłaty,
    Doctor - rozszerza klasę Person o dodatkowe pole bonus (premia),
    Nurse (pielęgniarka) - rozszerza klasę Person o pole overtime (nadgodziny),
    Hospital - przechowuje informacje o pracownikach szpitala w tablicy. Powinna w niej istnieć metoda add() pozwalająca dodać nowego pracownika do tablicy pracowników,
    HospitalApp - klasa testowa.

Każda z klas powinna posiadać konstruktor pozwalający zainicjować wszystkie pola danej klasy. Załóż, że w szpitalu pracują 3 osoby - 1 lekarz i 2 pielęgniarki, przypisz ich do tablicy w obiekcie Hospital. Zdefiniuj w klasie Hospital metodę getInfo(), która z wykorzystaniem pętli for zwróci połączone informacje o wszystkich pracownikach w postaci Stringa. W przypadku każdego z nich informacja ta powinna mówić o wszystkich polach jakie przechowuje dany obiekt typu Person lub jego pochodne. Klasy Person, Doctor i Nurse powinny być zgodne z konwencją JavaBeans.
