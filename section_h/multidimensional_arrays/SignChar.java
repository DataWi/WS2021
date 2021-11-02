package ws2021.section_h.multidimensional_arrays;

// This should work but the throws an error. Created
// https://moodle.technikum-wien.at/mod/forum/discuss.php?d=85606 to ask what is the issue here

public class SignChar {
    public static void setSign(char[][] field, char sign, int row, int column){
        if(sign != 'X' || sign != 'O') {
            return;
        }
        
        if(row > 2) {
            return;
        }
        
        if(field[row][column] == 'X' || field[row][column] ==  'O') {
            return;
        }

        field[row][column] = sign;
    }
}
