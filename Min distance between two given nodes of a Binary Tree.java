class GfG {
    int findDist(Node root, int a, int b) {
        Node LCA = lca(root, a, b);
        return findLevel(LCA, a) + findLevel(LCA, b);
        
    }
    	Node lca(Node root, int n1,int n2){
		// Your code here
		if(root==null)
		return null;
		
		if(root.data==n1 || root.data== n2)
		return root;
		
		Node left = lca(root.left, n1,n2);
		Node right = lca(root.right, n1,n2);
		
		
		if(left!=null && right!=null)
		return root;
		
		if(left!=null && right==null)
		return left;
		
		else return right;
	}
	//bfs
	int findLevel(Node root, int a) {
    if (root == null)
        return -1;

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int level = 0;

    while (!q.isEmpty()) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            Node curr = q.poll();
            
            if (curr.data == a)
                return level;
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
        level++;
    }

    return -1;
	}
}
