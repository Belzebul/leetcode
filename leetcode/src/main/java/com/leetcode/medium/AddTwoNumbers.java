package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        char[] l1Array = listNodeToChar(l1).toCharArray();
        char[] l2Array = listNodeToChar(l2).toCharArray();
        int maxLength = Math.max(l1Array.length, l2Array.length);
        int acc = 0;
        String buffer = "";

        for (int i = 0; i < maxLength; i++) {
            int a = (l1Array.length > i) ? l1Array[i] - '0' : 0;
            int b = (l2Array.length > i) ? l2Array[i] - '0' : 0;

            int sum = a + b + acc;
            char[] aux = String.valueOf(sum).toCharArray();
            if (aux.length == 2) {
                buffer += i == maxLength - 1 ? "" + aux[1] + aux[0] : aux[1];
                acc = aux[0] - '0';
            } else {
                buffer += aux[0];
                acc = 0;
            }
        }

        List<Character> auxCharList = new ArrayList<Character>();
        for (char c : buffer.toCharArray()) {
            auxCharList.add(c);
        }

        return stringToListNode(auxCharList);
    }

    private ListNode stringToListNode(List<Character> cArray) {
        if (cArray.size() == 1) {
            return new ListNode(cArray.getLast() - '0');
        } else {
            int aux = cArray.removeFirst() - '0';
            return new ListNode(aux, stringToListNode(cArray));
        }
    }

    public String listNodeToChar(ListNode l1) {
        if (l1.next == null) {
            return String.valueOf(l1.val);
        } else {
            return String.valueOf(l1.val) + listNodeToChar(l1.next);
        }
    }
}
