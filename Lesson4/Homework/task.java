// Необходимо превратить собранное на семинаре дерево поиска в полноценное левостороннее красно-черное дерево. И реализовать в нем метод добавления новых элементов с балансировкой.

// Красно-черное дерево имеет следующие критерии:
// • Каждая нода имеет цвет (красный или черный)
// • Корень дерева всегда черный
// • Новая нода всегда красная
// • Красные ноды могут быть только левым ребенком
// • У краной ноды все дети черного цвета

// Соответственно, чтобы данные условия выполнялись, после добавления элемента в дерево необходимо произвести балансировку, благодаря которой все критерии выше станут валидными. 
// Для балансировки существует 3 операции – левый малый поворот, правый малый поворот и смена цвета.

package Lesson4.Homework;

public class task {
    Node root;

    public boolean add(int value) {
        if (root == null) {
            root = new Node(value);
            root.color = Color.black;
            return true;
        }
        if (addNode(root, value) != null)
            return true;
        return false;

    }
    private Node addNode(Node node, int value) {
        if (node.value == value)
            return null;
        if (node.value > value) {
            if (node.left == null) {
                node.left = new Node(value);
                return node.left;
            } else
                return addNode(node.left, value);
        } else  {
            if (node.right == null) {
                node.right = new Node(value);
                return node.right;
            } else
                return addNode(node.right, value);
        }
    }
    public boolean contain(int value) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.value == value)
                return true;
            if (currentNode.value > value)
                currentNode = currentNode.left;
            else
                currentNode = currentNode.right;
        }
        return false;
    }

    


    private class Node {
        int value;
        Node left;
        Node right;
        Color color;
        Node() {
            this.color = Color.red;
        }

        Node(int _value) {
            this.value = _value;
            this.color = Color.red;
        }
    }
    enum Color {red, black}
}
