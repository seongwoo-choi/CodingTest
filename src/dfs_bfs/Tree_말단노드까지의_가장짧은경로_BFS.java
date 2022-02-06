package dfs_bfs;

import java.util.*;

public class Tree_말단노드까지의_가장짧은경로_BFS {
    Node root;

    private static class Node {
        int data;
        Node lt, rt;
        public Node(int val) {
            data = val;
            lt = rt = null;
        }
    }

    public int BFS(int L, Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i=0; i<len; i++) {
                Node n = Q.poll();
                if(n.lt != null) Q.offer(n.lt);
                if(n.rt != null) Q.offer(n.rt);
                if(n.rt == null && n.rt == null) return L;
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Tree_말단노드까지의_가장짧은경로_BFS tree = new Tree_말단노드까지의_가장짧은경로_BFS();
        tree.root = new Tree_말단노드까지의_가장짧은경로_BFS.Node(1);
        tree.root.lt = new Tree_말단노드까지의_가장짧은경로_BFS.Node(2);
        tree.root.rt = new Tree_말단노드까지의_가장짧은경로_BFS.Node(3);
        tree.root.lt.lt = new Tree_말단노드까지의_가장짧은경로_BFS.Node(4);
        tree.root.lt.rt = new Tree_말단노드까지의_가장짧은경로_BFS.Node(5);
        System.out.println(tree.BFS(0, tree.root));
    }
}
