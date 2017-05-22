/*
 * https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor
 */

static Node lca(Node root,int v1,int v2){
    Node p = root;
    
    while(! p.equals(null)){
        if(v1 == p.data || v2 == p.data) return p;
        else if(v1 < p.data && v2 < p.data) p = p.left;
        else if(v1 > p.data && v2 > p.data) p = p.right;
        else return p;
    }
    return root;
}