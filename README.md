# 🎬 Sistem Gestiune Videotecă (Java OOP)

Acesta este un proiect personal de tip consolă, dezvoltat în **Java**, care simulează sistemul de gestiune al unei videoteci. Scopul principal al proiectului este aplicarea practică a conceptelor de bază din Programarea Orientată pe Obiecte (OOP) și implementarea unui flux de tip **CRUD**.

## ✨ Funcționalități curente
Aplicația permite utilizatorului să interacționeze printr-un meniu simplu din consolă, având următoarele opțiuni:
* **Adăugare film nou:** Salvarea unui film în sistem (Create).
* **Afișare catalog:** Vizualizarea tuturor filmelor disponibile în videotecă (Read).
* **Închiriere film:** Modificarea statusului unui film din "disponibil" în "închiriat" (Update).

## 🛠️ Tehnologii folosite
* **Limbaj:** Java
* **Concepte aplicate:** Clase și Obiecte, Încapsulare, Colecții (List/ArrayList), Scanner (pentru input).
* **Mediu de dezvoltare:** IntelliJ IDEA
* **Version Control:** Git & GitHub

## 📂 Structura proiectului
Proiectul este împărțit în trei componente logice principale:
1. `Movie` - Clasa model care definește atributele unui film (titlu, disponibilitate etc.).
2. `VideoStore` - Clasa care gestionează logica de business (lista de filme și operațiunile CRUD).
3. `Main` - Interfața cu utilizatorul (meniul din consolă).

## 🚀 Cum urmează să fie îmbunătățit
Pe viitor, planific să adaug:
- [ ] Funcționalitatea de Ștergere (Delete) a unui film din sistem.
- [ ] O opțiune de returnare a filmelor închiriate.
- [ ] Persistența datelor (salvarea filmelor într-un fișier text sau bază de date, pentru a nu se pierde la închiderea programului).