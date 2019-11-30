# TestInc1000

Il programma incrementa il contatore di 1000 per ogni oggetto della sua classe.

All'inizio il codice era scritto in modo adatto, a prima vista esso poteva sembrare errato, tuttavia ci si faceva ingannare dall'output "0" perchè la stampa veniva eseguita prima che i thread potessero terminare l'esecuzione.

Dopo la prima modifica il programma restituiva l'output corretto, i thread andavano in conflitto quando tentavano di accedere alla variabile static *cont*.

Successivamente all'ultima modifica il programma è perfetto, scritto come lo si poteva immaginare leggendo la consegna.
