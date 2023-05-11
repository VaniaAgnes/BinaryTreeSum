
        class NodeofTree {
            int key;
            NodeofTree left;
            NodeofTree right;

            public NodeofTree(int key) {
                this.key = key;
                this.left = null;
                this.right = null;
            }
        }

        public class SumofBinaryTree {
            public static int sumOfKeys(NodeofTree root) {
                if (root == null) {
                    return 0;
                }

                return root.key + sumOfKeys(root.left) + sumOfKeys(root.right);
            }

            public static void main(String[] args) {
                // Create a sample binary tree
                NodeofTree root = new NodeofTree(1);
                root.left = new NodeofTree(2);
                root.right = new NodeofTree(3);
                root.left.left = new NodeofTree(4);
                root.left.right = new NodeofTree(5);


                int sum = sumOfKeys(root);

                System.out.println("The sum of all the keys : " + sum);
            }
        }
