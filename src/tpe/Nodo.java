package tpe;

public class Nodo<T> {

	Comparable<T> data;
	Nodo<T> next =null;
	public Nodo(Comparable<T> data) {
		this.data=data;
	}
	public Comparable<T> getData() {
		return data;
	}
	public void setData(Comparable<T> data) {
		this.data = data;
	}
	public Nodo<T> getNext() {
		return next;
	}
	public void setNext(Nodo<T> next) {
		this.next = next;
	}
	
	public String toString() {
		return " "+ data;
	}
	

}
