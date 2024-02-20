# Întrebări MD

1. Ce este un graf?
Un graf este o mulțime de obiecte (numite noduri) legate între ele printr-o mulțime de muchii cărora le pot fi atribuite direcții (în acest caz, se spune că graful este orientat). Un graf poate fi reprezentat geometric ca o mulțime de puncte legate între ele prin linii (de obicei curbe).

2. Care sunt metodele de reprezentare a grafului in memoria calculatorului?
Există trei metode de bază de reprezentare a unui graf:

   - Matricea de incidenţă;
   - Matricea de adiacenţă;
   - Lista de adiacenţă (incidenţă).

3. Care este varful izolat? ce grad are acesta?
Dacă un vârf nu este extremitatea nici unui arc el se numeşte vârf izolat, gradul este 0

4. Ce se numeste bucla?
Un arc pentru care extremitatea iniţială coincide cu cea finală se numeşte buclă.

5. Care este diferenta intre graf partial si subgraf?
Un subgraf poate include o parte din nodurile și muchiile unui graf, dar nu trebuie să le includă pe toate.
un graf parțial este un subgraf care conține toate vârfurile graficului original, dar nu toate muchiile.

    Graful obţinut din graful iniţial suprimând cel puţin un vârf al acestuia precum şi toate arcele
    incidente cu el se numeşte subgraf al grafului iniţial.

6. Care doua arce sunt adiacente?
Două arce se numesc adiacente dacă sunt distincte şi au o extremitate comună.

7. Care doua varfuri se numesc adiacente?
Două vârfuri se zic adiacente dacă sunt distincte şi sunt unite printr-un arc.

8. Ce este si cum se determina semigradul exterior? dar interior?
Cardinalul mulţimei tuturor arcelor incidente cu x spre exterior (pleacă din x) se numeşte semigradul exterior a lui x , iar cardinalul mulţimei tuturor arcelor incidente cu x spre interior (întră în x) se numeşte semigradul interior a lui x

9. Cum se determina gradul lui xi?
Gradul lui xi este numărul de muchii conectate la xi

10. Cum se clasifica varfurile?
Dacă pentru un vârf x, d+x=0 şi d -x>0 atunci el se numeşte vârf terminal.
Dacă pentru un vârf x, d+x>0 şi d -x=0 atunci el se numeşte vârf initial.
Dacă pentru un vârf x, d+x>0 şi d -x>0 atunci el se numeşte vârf intermediar sau tranzitoriu.
Dacă pentru un vârf x, d+x=0 şi d -x=0 atunci el se numeşte vârf izolat.

11. Care sunt dimensiunile matricii de incidenta? dar adiacenta?
Dimensiunea este nxm

12. Cum se completeaza matricea de incidenta?
    • 1 - dacă muchia i este incidentă cu vârful j (dacă arcul i "intră" în vârful j în cazul unui graf
        orientat);
    • 0 - dacă muchia (arcul) i şi vârful j nu sunt incidente;
    •-1 - numai pentru grafuri orientate, dacă arcul i "iese" din vârful j.
    • 2 – dacă arcul i este bucla (xj,xj)

13. Cum se completeaza  matricea de adiacenta?
Fiecare element aij poate fi 1, dacă vârfurile Xi şi xj sunt adiacente, sau 0, în caz contrar.

14. Care forma de reprezentare a grafului este mai eficace din punct de vedere al utilizarii memoriei?
Reprezentarea grafurilor prin intermediul acestei liste permite utilizarea mai eficace a memoriei calculatorului, însă această formă este mai complicată atât în realizare, cât şi în timpul procesării.
