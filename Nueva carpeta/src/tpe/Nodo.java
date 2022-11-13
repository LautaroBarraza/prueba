package tpe;

public class Nodo<T> {

	Comparable data;
	Nodo<T> next =null;
	public Nodo(Comparable data) {
		this.data=data;
	}
	public Comparable getData() {
		return data;
	}
	public void setData(Comparable data) {
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
