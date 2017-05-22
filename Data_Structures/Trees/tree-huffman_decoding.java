/*
 * https://www.hackerrank.com/challenges/tree-huffman-decoding
 */

void decode(String S ,Node root){
    Node p = root;    
    for(int i = 0; i < S.length(); i++){
        p = (S.charAt(i) == '0') ? p.left : p.right;
        if(p.left == null && p.right == null){
            System.out.print(p.data);
            p = root;
        }
    }
}
