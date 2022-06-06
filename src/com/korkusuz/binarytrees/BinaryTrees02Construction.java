package com.korkusuz.binarytrees;

public class BinaryTrees02Construction {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if (value < this.value && left == null) {
                left = new BST(value);
            } else if (value < this.value) {
                left.insert(value);
            }
            else if (right == null) {
                right = new BST(value);
            }
            else {
                right.insert(value);
            }
            return this;
        }

        public boolean contains(int value) {
            if (value == this.value)
                return true;
            else if (left == null && right == null) {
                return false;
            } else if (value > this.value && right != null) {
                return right.contains(value);
            }
            else if (value < this.value && left != null) {
                return left.contains(value);
            }
            return false;
        }

        public BST remove(int value) {
            //TODO remove function
            return this;
        }
    }
}
