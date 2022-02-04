package dfs_bfs;

import java.util.*;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt=rt=null;
    }
}

public class 이진트리순회 {
    Node root;
    public void DFS(Node root) {
        // 말단 노드
        if(root == null) return;
        // 말단 노드가 될 때 까지 재귀를 돌린다.
        // 왼쪽과 오른쪽으로 뻗는 케이스 두가지를 지정
        else {
            // 전위 순회
//            System.out.println(root.data);
            DFS(root.lt);
            // 중위 순회
//            System.out.println(root.data);
            DFS(root.rt);
            // 후위 순회
//            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        이진트리순회 tree = new 이진트리순회();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
