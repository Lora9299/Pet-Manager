User story 1 - Kreiranje entiteta user Kreirati entitet User User mora imati polja:

  ime i prezime,
  oib (identifikacijski broj) DODATNI ZADATAK: potrebno napraviti provjeru valjanosti oib-a
  email mora biti unique,
  adresa (opet napraviti kao embeddable - sva polja ista kao u Car Service),
  password (ovo polje će trebati zbog autorizacije).

User story 2 - Spremanje usera Potrebno je napraviti spremanje usera u bazu. Implementirati cijeli flow, od repository-a do thymeleaf templatea

User story 3 - Editiranje usera Potrebno je napraviti editiranje postojećeg usera. Implementirati cijeli flow, od repository-a do thymeleaf templatea

User story 4 - Brisanje usera Potrebno je napraviti editiranje postojećeg usera. Implementirati cijeli flow, od repository-a do thymeleaf templatea

User story 5 - dohvaćanje usera po ID-u Potrebno je napraviti dohvaćanje usera po ID-u. Implementirati cijeli flow, od repository-a do thymeleaf templatea

User story 6 - Kreiranje eniteta ANIMAL.
  Animal type (ENUM),
  Name (STRING),
  Height (INT),
  Weight (INT),
  Adoptable (napraviti kao embeddable, dodati proizvoljne podatke vezane uz udomljavnje),
  Valued (napraviti kao enbeddable, dodati proizvoljne podatke vezane uz prodaju).

User story 7 - Spremanje Animal objekta  u bazu (Implementacija cijelog flowa, od repozitorija do template).

User story 8 - Editiranje Animal objekta (Implementacija cijelog flowa, od repozitorija do template).

User story 9 - Brisanje Animal objekta  (Implementacija cijelog flowa, od repozitorija do template).

User story 8 - Dohvaćanje liste Animala iz baze za user id kako bi se prikazala lista svih životinja koje imaju poveznicu s nekim userom  (Implementacija cijelog flowa, od repozitorija do template).

User story 9 - Dohvaćanje Animala po idu za prikaz detalja pojedinog Animala (Implementacija cijelog flowa, od repozitorija do template).


User story 10 - Implementacija pretraživanja Animala po kriterijima:
Udomljavanje/kupovina (Padajući izbornik - provjera da li postoji objekt “Adoptable” ili “Valued” unutar Animal objekta kako bi se koristio kriteriji)
  Tip životinje (filter prema tipu)
  Težina (filter prema težini)
  Visina (filter prema visini)
Za implementaciju koristiti “Criteria builder” ili “Specifications”. Radi sa “Specifications”, to je preporuka šefa kuhinje Davora Aleksića

User story 12 - Dodavanje logina - dodavanje autentikacije i autorizacije (basic auth - Spring security).
