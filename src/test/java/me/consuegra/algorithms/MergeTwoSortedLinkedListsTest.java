package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import me.consuegra.datastructure.LinkedListUtils;
import me.consuegra.datastructure.ListNode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MergeTwoSortedLinkedListsTest {

    MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists;

    @Before
    public void setUp() {
        mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();
    }

    @Test
    public void testSecondListNullSolution1() {
        ListNode<Integer> list1 = LinkedListUtils.createLinkedListFor(1);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoLists(list1, null), is(list1));
    }

    @Test
    public void testFirstListNullSolution1() {
        ListNode<Integer> list2 = LinkedListUtils.createLinkedListFor(2);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoLists(null, list2), is(list2));
    }

    @Test
    public void test1EntryListsSolution1() {
        ListNode<Integer> list1 = LinkedListUtils.createLinkedListFor(1);
        ListNode<Integer> list2 = LinkedListUtils.createLinkedListFor(2);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1, 2);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoLists(list1, list2), is(result));
    }

    @Test
    public void testSameSizeSolution1() {
        ListNode<Integer> list1 = LinkedListUtils.createLinkedListFor(1, 2);
        ListNode<Integer> list2 = LinkedListUtils.createLinkedListFor(3, 4);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1, 2, 3, 4);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoLists(list1, list2), is(result));
    }

    @Test
    public void testDifferentSizesSolution1() {
        ListNode<Integer> list1 = LinkedListUtils.createLinkedListFor(1, 3);
        ListNode<Integer> list2 = LinkedListUtils.createLinkedListFor(2, 4, 5);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoLists(list1, list2), is(result));
    }

    @Test
    public void testSecondListNullSolution2() {
        ListNode<Integer> list1 = LinkedListUtils.createLinkedListFor(1);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoListsRec(list1, null), is(list1));
    }

    @Test
    public void testFirstListNullSolution2() {
        ListNode<Integer> list2 = LinkedListUtils.createLinkedListFor(2);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoListsRec(null, list2), is(list2));
    }

    @Test
    public void test1EntryListsSolution2() {
        ListNode<Integer> list1 = LinkedListUtils.createLinkedListFor(1);
        ListNode<Integer> list2 = LinkedListUtils.createLinkedListFor(2);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1, 2);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoListsRec(list1, list2), is(result));
    }

    @Test
    public void testSameSizeSolution2() {
        ListNode<Integer> list1 = LinkedListUtils.createLinkedListFor(1, 2);
        ListNode<Integer> list2 = LinkedListUtils.createLinkedListFor(3, 4);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1, 2, 3, 4);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoListsRec(list1, list2), is(result));
    }

    @Test
    public void testDifferentSizesSolution2() {
        ListNode<Integer> list1 = LinkedListUtils.createLinkedListFor(1, 3);
        ListNode<Integer> list2 = LinkedListUtils.createLinkedListFor(2, 4, 5);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoListsRec(list1, list2), is(result));
    }

}