package com.vaskoz.algs4j.tree;

public final class BinaryTree<V> {
	public static final class Node<V> {
		private final V value;
		private Node<V> left;
		private Node<V> right;

		private Node(V value, Node<V> left, Node<V> right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}

		public static <V> Node<V> createNode(V value, Node<V> left, Node<V> right) {
			return new Node<>(value, left, right);
		}

		public static <V> Node<V> createNode(V value) {
			return createNode(value, null, null);
		}

		public V getValue() {
			return value;
		}

		public Node<V> getLeft() {
			return left;
		}

		public Node<V> getRight() {
			return right;
		}
	}

	private final Node<V> root;

	private BinaryTree(V rootValue) {
		this.root = Node.createNode(rootValue);
	}

	public static <V> BinaryTree<V> createTree(V rootValue) {
		return new BinaryTree<>(rootValue);
	}
}
