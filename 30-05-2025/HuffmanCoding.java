import java.util.*;

class HuffmanNode {
    char ch;
    int freq;
    HuffmanNode left, right;

    HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

class HuffmanCoding {
    static class NodeComparator implements Comparator<HuffmanNode> {
        public int compare(HuffmanNode n1, HuffmanNode n2) {
            return n1.freq - n2.freq;
        }
    }

    static void generateCodes(HuffmanNode root, String code, Map<Character, String> huffmanCodeMap) {
        if (root == null) {
            return;
        }

        // If it's a leaf node
        if (root.left == null && root.right == null) {
            huffmanCodeMap.put(root.ch, code);
            return;
        }

        // Traverse left and right
        generateCodes(root.left, code + "0", huffmanCodeMap);
        generateCodes(root.right, code + "1", huffmanCodeMap);
    }

    static HuffmanNode buildHuffmanTree(Map<Character, Integer> freqMap) {
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(new NodeComparator());

        // Create leaf nodes for each character and add to the priority queue
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        // Iterate until there's only one node left (the root)
        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode newNode = new HuffmanNode('\0', left.freq + right.freq);
            newNode.left = left;
            newNode.right = right;

            pq.add(newNode);
        }

        return pq.poll(); // Root of the Huffman Tree
    }

    public static void main(String[] args) {
        String text = "huffman coding example";

        // Count character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Build Huffman Tree
        HuffmanNode root = buildHuffmanTree(freqMap);

        // Generate Huffman codes
        Map<Character, String> huffmanCodeMap = new HashMap<>();
        generateCodes(root, "", huffmanCodeMap);

        // Print codes
        System.out.println("Huffman Codes:");
        for (Map.Entry<Character, String> entry : huffmanCodeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
