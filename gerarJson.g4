grammar gerarJson;

INT: [0-9]+;
STRING: '"' ( ~[\\"\n\r] | '\\' [\\"] )* '"' ;
BOOL: 'True' | 'False';
SKP: [ \t\n\r]+ -> skip ;

exp:
    STRING #string |
    INT #int |
    BOOL #bool |
    vetor #array|
    objeto  #obj;

par: 'par' '(' STRING ',' exp ')';
vetor: 'vetor' '(' ((exp ',')* exp | ) ')';
objeto: 'json' '(' ((par ',')* par | ) ')';

program: vetor | objeto;