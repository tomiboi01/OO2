PROGRAM P1; 
var 
 a:integer; 
 b:char; 
 c: array[1..10] of integer 
 
Procedure PP1; 
var 
 a:char; 
 p:integer; 
Function x: integer; 
var 
 z:integer; 
begin 
 a:="j"; 
 z=-1; 
 return z; 
end; 
 
Begin 
 p:=x; 
 write(a); 
 p:=x+3; 
 c[p]=8; 
 p:=x+2; 
 c[p]=x; 
end;