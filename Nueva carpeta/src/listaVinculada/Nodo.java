package listaVinculada;

public class Nodo<T> {

	T data;
	Nodo<T> next =null;
	public Nodo(T data) {
		this.data=data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
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
