Rappel des règles de deplacement:

- la case directement au Nord de la position (x, y) a pour coordonnées (x, y+1).(indiqué dans l'enoncé)
- la case directement au Sud de la position (x, y) a pour coordonnées (x, y-1).
- la case directement a l'Est de la position (x, y) a pour coordonnées (x+1, y).
- la case directement a l'Ouest de la position (x, y) a pour coordonnées (x-1, y).

J'ai rajouté la contrainte suivante : Si l'aspirateur se trouve au bord de la grille et que le prochain deplacement 
lui ferait sortir de celle-ci, alors il reste bloqué au bord et n'executera pas les instructions restantes. 
Ex: supposons que l'aspirateur se trouve à la position (1,9) et orienté vers le nord sur une grille 10*10,Si la prochaine
instruction est Avance, alors l'aspirateur ne pourra plus avancer car ce mouvement le placerait à la case (1,10) qui est 
hors de la grille. 
 