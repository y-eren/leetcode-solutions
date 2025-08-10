class Solution {
    public boolean isValidSudoku(char[][] board) {
      
      for (int i = 0; i < 9; i++) {
        Set<Character> sutun = new HashSet<Character>();
        for (int j = 0; j < 9; j++) {
            char ch = board[i][j];
            if (ch == '.') continue;
            if(!sutun.add(ch)) return false;
        }
      }

       for (int i = 0; i < 9; i++) {
        Set<Character> sutun = new HashSet<Character>();
        for (int j = 0; j < 9; j++) {
            char ch = board[j][i];
            if (ch == '.') continue;
            if(!sutun.add(ch)) return false;
        }
      }
for (int kutusatir = 0; kutusatir < 9; kutusatir+=3)
{
     for (int kutusutun = 0; kutusutun <9; kutusutun+=3) {
          Set<Character> kutu = new HashSet<Character>();
      for (int satir = kutusatir; satir < kutusatir + 3; satir++) {
        for (int sutun = kutusutun; sutun < kutusutun + 3; sutun++) {
            char ch = board[satir][sutun];
            if (ch == '.') continue;
            if(!kutu.add(ch)) return false;
        }
      }
     }
   
}
   
return true;
}
}
