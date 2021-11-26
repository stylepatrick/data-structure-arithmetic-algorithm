package com;

import java.io.IOException;
import java.util.*;

class Main {

    class Node {
        int data;
        Node left;
        Node right;

        Node() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    int visibleNodes(Node root) {
        int o = getDepth(root);

        float[] levelSum = new float[o];
        calculateLevelSum(root, 0, levelSum);
        System.out.println(Arrays.toString(levelSum));

        float[] levelNodes = new float[o];
        calculateLevelNodes(root, 0, levelNodes);
        System.out.println(Arrays.toString(levelNodes));

        int evenNumbers = 0;
        HashMap<Integer, LinkedList<Integer>> hashMap = new HashMap<>();
        getEvenNumbers(root, 0, hashMap);
        float[] biggestPerLevel = new float[o];
        for (Map.Entry<Integer, LinkedList<Integer>> entry : hashMap.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                if ((entry.getValue().get(i) % 2) == 0) {
                    evenNumbers++;
                }
            }
            biggestPerLevel[entry.getKey()] = Collections.max(entry.getValue());
        }
        System.out.println(evenNumbers);
        System.out.println(Arrays.toString(biggestPerLevel));


        float[] avgOfLevel = new float[o];
        for (int i = 0; i < levelSum.length; i++) {
            avgOfLevel[i] = levelSum[i] / levelNodes[i];
        }
        System.out.println(Arrays.toString(avgOfLevel));

        float allSum = 0;
        for (int i = 0; i < levelSum.length; i++) {
            allSum = allSum + levelSum[i];
        }
        System.out.println(allSum);
        return o;
    }

    // get depth of tree node
    private int getDepth(Node temp) {
        int leftHeight = 0, rightHeight = 0;
        if (temp.left != null)
            leftHeight = getDepth(temp.left);
        if (temp.right != null)
            rightHeight = getDepth(temp.right);
        int max = Math.max(leftHeight, rightHeight);
        return (max + 1);
    }

    // build sum of each level
    private void calculateLevelSum(Node node, int level, float[] sum) {
        if (node == null) {
            return;
        }
        sum[level] = sum[level] + node.data;

        calculateLevelSum(node.left, level + 1, sum);
        calculateLevelSum(node.right, level + 1, sum);

    }

    // get amount of level nodes
    private void calculateLevelNodes(Node node, int level, float[] levelNodes) {
        if (node == null) {
            return;
        }
        levelNodes[level] = levelNodes[level] + 1;

        calculateLevelNodes(node.left, level + 1, levelNodes);
        calculateLevelNodes(node.right, level + 1, levelNodes);
    }

    // convert tree to HashMap
    private void getEvenNumbers(Node node, int level, HashMap<Integer, LinkedList<Integer>> map) {
        if (node == null) {
            return;
        }
        LinkedList<Integer> list;
        if (map.containsKey(level)) {
            list = map.get(level);
        } else {
            list = new LinkedList<>();
        }
        list.add(node.data);
        map.put(level, list);

        getEvenNumbers(node.right, level + 1, map);
        getEvenNumbers(node.left, level + 1, map);

        //  Can be used if children are not left and right objects but lists of objects
        // for (int i = 0; i < node.children.size(); i++) {
        //     createHashMap(node.children.get(i), level + 1, tree);
        // }
    }

    // Tests
    int test_case_number = 1;

    void check(int expected, int output) {
        boolean result = (expected == output);
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        } else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printInteger(expected);
            System.out.print(" Your output: ");
            printInteger(output);
            System.out.println();
        }
        test_case_number++;
    }

    void printInteger(int n) {
        System.out.print("[" + n + "]");
    }

    public void run() throws IOException {

        Node root_1 = new Node(8);
        root_1.left = new Node(3);
        root_1.right = new Node(10);
        root_1.left.left = new Node(1);
        root_1.left.right = new Node(6);
        root_1.right.right = new Node(14);
        root_1.left.right.left = new Node(4);
        root_1.left.right.right = new Node(7);
        root_1.right.right.left = new Node(13);
        int expected_1 = 4;
        int output_1 = visibleNodes(root_1);
        check(expected_1, output_1);

        Node root_2 = new Node(10);
        root_2.left = new Node(8);
        root_2.right = new Node(15);
        root_2.left.left = new Node(4);
        root_2.left.left.right = new Node(5);
        root_2.left.left.right.right = new Node(6);
        root_2.right.left = new Node(14);
        root_2.right.right = new Node(16);

        int expected_2 = 5;
        int output_2 = visibleNodes(root_2);
        check(expected_2, output_2);

    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }
}