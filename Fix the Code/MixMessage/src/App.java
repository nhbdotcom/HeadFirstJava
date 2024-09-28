public class App {
    public static void main(String [] args) {
    int x = 0;
    int y = 0;
    while ( x < 5 ) {
        //Missing code here
        System.out.print(x + "" + y + "");
        x = x + 1;
        }
    }
}
/*Candidates:				Possible output:
y = x - y;                  22 46
y = y + x;                  11 34 59
y = y + 2;                  02 14 26 38
if( y > 4 ) {               02 14 36 48
y = y - 1;
}               
x = x + 1;                  00 11 21 32 42
y = y + x;                  11 21 32 42 53

if ( y < 5 ) {              ```00 11 23 36 410```
    x = x + 1;
    if ( y < 3 ) {          ```02 14 25 36 47```
    x = x - 1;
    }
}
y = y + 2;*/
