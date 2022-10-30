ACCEPT NUM_FILM PROMPT ' Entrez un numéro de film valide : ' ;
select DATE_DE_LA_SEANCE, NUMERO_SEANCE
from FILM natural join SEANCE
where NUMERO_FILM=&NUM_FILM;
