grammar gerarJson;

INT: [0-9]+;
STRING: '"' ( ~[\\"\n\r] | '\\' [\\"] )* '"' ;
BOOL: 'True' | 'False';
SKP: [ \t\n\r]+ -> skip ;

vetor: '[' ((exp ',')* exp | ) ']' ;
obj: '{' ((tupla ',')* tupla | )'}';
tupla: STRING ':' exp ;

exp:
        STRING #string |
        INT #int |
        BOOL #bool |
        vetor #array|
        obj  #objeto

;

json: vetor | obj;
