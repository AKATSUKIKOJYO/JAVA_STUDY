package icehs.science.chapter08;

import icehs.science.chapter07.Book;

public class BookArrayEx {

	public static void main(String[] args) {
		
		Book[] books = { new Book("������ ��", 16000), new Book("�� ��ó", 12000), new Book("7�� ��", 13500) };
		
		for(int inx = 0; inx < books.length; inx++) {
			System.out.print(books[inx].getTitle() + ":");
			System.out.println(books[inx].getPrice() );
		}
	}

}
