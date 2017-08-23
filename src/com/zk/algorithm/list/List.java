package com.zk.algorithm.list;

import java.io.Serializable;

/**
 * 线性表
 * 
 * @author Kor_Zhang
 *
 * @param <E>
 *            线性表储存的值的类型;
 * 
 * @see DoubleLinkedList
 * @see SingleLinkedList
 */
public interface List<E> extends Serializable, Comparable<List<E>> {
	/**
	 * 移除指定位置的元素;
	 * @param index
	 */
	void remove(int index);

	/**
	 * 移除指定的元素;<br/>
	 * 将调用{@link Object#equals(Object)}比较对象;
	 * @param e
	 */
	void removeElement(E e);

	/**
	 * 添加一个元素
	 * 
	 * @param e
	 */
	void add(E e);

	/**
	 * 获取指定位置元素
	 * 
	 * @param index
	 *            [0,n]
	 * @return
	 */
	E get(Integer index);

	/**
	 * 获取元素的指定位置;<br/>
	 * 将调用{@link Object#equals(Object)}比较对象;
	 * @param o
	 * @return
	 */
	Integer indexOf(E e);

	/**
	 * 获取线性表长度
	 * 
	 * @return
	 */
	Integer size();
	/**
	 * 将链表元素转化为数组;
	 * @return
	 */
	E[] toArray();

	/**
	 * 追加一个新链表到现有链表
	 * 
	 * @param subList
	 *            追加的链表
	 */
	void addAll(List<E> subList);

	/**
	 * 清空线性表
	 */
	void clear();

}