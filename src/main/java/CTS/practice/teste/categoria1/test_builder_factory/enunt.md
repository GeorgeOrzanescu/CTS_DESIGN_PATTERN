### 4p. Pentru un magazin care produce și vinde Biciclete se dorește implementarea unei aplicații care să ajute la gestionarea fabricării de biciclete. Astfel în cadrul aplicației inginerii au posibilitatea creării obiectelor pentru seturi de biciclete care au mai multe caracteristici, dintre care unele sunt opționale: diametruRoti, tipFrana, cascaProtectie, ochelari, etc. Orice set creat nu mai poate fi modificat urmand sa fie vandut asa cum a fost creat. Să se implementeze modulul care îi va ajuta pe gestionari în procesul de creare al obiectelor de tip Bicicleta. Clasa Bicicleta trebuie sa implementeze interfata IBicicleta.
### 1p. Să se testeze soluția prin crearea a cel puțin patru obiecte prin intermediul modulului implementat
### 4p. Soluția trebuie să permită crearea de Biciclete de diferite tipuri: MTB, Electrica, Trekking. Pentru fiecare tip de bicicleta este folosită o clasă aferentă tipului de bicicletă care implementează interfața IBicicleta. Să se implementeze modulul care îi va ajuta pe inginerii magazinului producator de biciclete în procesul de creare al obiectelor din familia IBicicleta..


 - Rezolvarea nu este corecta;

 - la o privire cu atentia oferirea interfetei IBicicleta cu toate metodele public este facuta sa pacaleasca
 - toate acele metode trebuiesc sa arunce exceptie in implementare pentru a nu permite modificarea ulterioara a obiectului creat
 - o abordare mai corecta ar fi sa folosim o clasa Builder nested in clasa Bicicleta
 - pana la urma am mers pe solutia validari in setter ( nu este prea eleganta dar functioneaza)