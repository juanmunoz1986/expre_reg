# expre_reg
expreciones regulares

 Aquí tienes una explicación detallada de cada elemento utilizado en las expresiones regulares:

String placa = "[A-Z]{3}[0-9]{3}";

[A-Z] representa una clase de caracteres que acepta cualquier letra mayúscula de la A a la Z.
{3} indica que la clase de caracteres anterior debe aparecer exactamente tres veces.
[0-9] representa una clase de caracteres que acepta cualquier dígito del 0 al 9.

String CodigoPostal = "05\\d{4}";

0 representa el carácter literal 0.
5 representa el carácter literal 5.
\\d representa cualquier dígito del 0 al 9.
{4} indica que el dígito anterior debe aparecer exactamente cuatro veces.
String TelMed = "\\d{7}";
\\d representa cualquier dígito del 0 al 9.
{7} indica que el dígito anterior debe aparecer exactamente siete veces.

String NumCel = "\\(3\\d{2}\\)\\d{7}\\b";

\\( y \\) representan los caracteres literales "(" y ")" respectivamente.
3 representa el carácter literal 3.
\\d representa cualquier dígito del 0 al 9.
{2} indica que el dígito anterior debe aparecer exactamente dos veces.
\\d{7} indica que cualquier dígito del 0 al 9 debe aparecer exactamente siete veces.
\\b representa un límite de palabra para asegurar que no haya caracteres adicionales después del número de teléfono.

String DirMede = "(calle|carrera|circular|diagonal)\\s+\\d+\\s+#(\\s*(calle|carrera|circular|diagonal)\\s+\\d+)?(-\\s*\\d+)?";

(calle|carrera|circular|diagonal) es un grupo de opciones que acepta una de las palabras clave especificadas.
\\s+ representa uno o más espacios en blanco.
\\d+ representa uno o más dígitos del 0 al 9.
\\s* representa cero o más espacios en blanco.
\\s*(calle|carrera|circular|diagonal)\\s+\\d+ es una parte opcional que representa otra combinación de palabra clave y número.
(-\\s*\\d+)? es una parte opcional que representa un guión seguido de otro número opcional.
String CorrElc = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
[A-Za-z0-9._%+-] representa una clase de caracteres que acepta letras mayúsculas, letras minúsculas, dígitos del 0 al 9 y los caracteres especiales "_", ".", "%", "+", y "-".
+ indica que la clase de caracteres anterior debe aparecer una o más veces.
@ representa el carácter literal "@".
[A-Za-z0-9.-] representa una clase de caracteres que acepta letras mayúsculas, letras minúsculas, dígitos del 0 al 9, el carácter especial "." y el carácter especial "-".
\\. representa el carácter literal ".".
[A-Za-z]{2,} representa una clase de caracteres que acepta letras mayúsculas y minúsculas y debe aparecer al menos dos veces.

String FromFecha = "(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/\\d{4}";

(0[1-9]|[1-2][0-9]|3[0-1]) es un grupo de opciones que acepta días del 01 al 31.
/ representa el carácter literal "/".
(0[1-9]|1[0-2]) es un grupo de opciones que acepta meses del 01 al 12.
/ representa el carácter literal "/".
\\d{4} representa cualquier dígito del 0 al 9 que debe aparecer exactamente cuatro veces.

String Hora = "(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])";

(0[0-9]|1[0-9]|2[0-3]) es un grupo de opciones que acepta horas del 00 al 23.
: representa el carácter literal ":".
([0-5][0-9]) es un grupo que acepta minutos y segundos del 00 al 59.

String Cedula = "(cedula de ciudadania es|CC)\\s*\\d{7,11}";

(cedula de ciudadania es|CC) es un grupo de opciones que acepta la frase "cedula de ciudadania es" o las letras "CC".
\\s* representa cero o más espacios en blanco.
\\d{7,11} representa cualquier dígito del 0 al 9 que debe aparecer entre 7 y 11 veces.

String DecJava = "(int|double|String)\\s+[a-zA-Z_$][a-zA-Z_$0-9]*\\s*;?";

(int|double|String) es un grupo de opciones que acepta las palabras clave "int", "double" o "String".
\\s+ representa uno o más espacios en blanco.
[a-zA-Z_$] representa una clase de caracteres que acepta letras mayúsculas, letras minúsculas, el carácter especial "_" y el carácter especial "$".
[a-zA-Z_$0-9]* representa cualquier combinación de letras mayúsculas, letras minúsculas, el carácter especial "_", el carácter especial "$" y dígitos del 0 al 9, cero o más veces.
\\s* representa cero o más espacios en blanco.
;? representa el carácter literal ";" que puede aparecer una vez o no aparecer en absoluto.

String Url = "(https?|ftp)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(?:/[^\\s]*)?";

(https?|ftp) es un grupo de opciones que acepta el protocolo "http" o "https" o "ftp".
:// representa los caracteres literales "://".
[a-zA-Z0-9.-]+ representa una clase de caracteres que acepta letras mayúsculas, letras minúsculas, dígitos del 0 al 9, el carácter especial "." y el carácter especial "-" una o más veces.
\\. representa el carácter literal ".".
[a-zA-Z]{2,} representa una clase de caracteres que acepta letras mayúsculas y minúsculas y debe aparecer al menos dos veces.
(?:/[^\\s]*)? es una parte opcional que representa una barra seguida de cualquier caracter excepto espacios en blanco cero o más veces.

String Nombre = "(?:[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+\\s?){2,}";

(?: ... ) indica un grupo de no captura.
[A-ZÁÉÍÓÚÑ] representa una clase de caracteres que acepta letras mayúsculas acentuadas o sin acentuar.
[a-záéíóúñ]+ representa una clase de caracteres que acepta letras minúsculas acentuadas o sin acentuar una o más veces.
\\s? representa un espacio en blanco opcional.
{2,} indica que el grupo anterior puede aparecer al menos dos veces.

String Contraseña = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=])(?!\\s).{8,}";

(?= ... ) indica una afirmación positiva hacia adelante (positive lookahead).
(?=.*[A-Z]) asegura que la contraseña contenga al menos una letra mayúscula.
(?=.*[a-z]) asegura que la contraseña contenga al menos una letra minúscula.
(?=.*\\d) asegura que la contraseña contenga al menos un dígito.
(?=.*[@#$%^&+=]) asegura que la contraseña contenga al menos un carácter especial de los siguientes: "@", "#", "$", "%", "^", "&", "+", "=".
(?!\\s) asegura que la contraseña no contenga espacios en blanco.
.{8,} representa cualquier carácter que debe aparecer al menos ocho veces.

String NumDou = "[+-]?\\d{1,100}\\.\\d+";

[+-]? representa el signo "+" o "-" como opcional.
\\d{1,100} representa cualquier dígito del 0 al 9 que debe aparecer entre 1 y 100 veces.
\\. representa el carácter literal ".".
\\d+ representa cualquier dígito del 0 al 9 que debe aparecer al menos una vez.
