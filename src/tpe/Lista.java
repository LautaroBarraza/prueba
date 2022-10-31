package tpe;

import java.util.Comparator;
import java.util.Iterator;

public class Lista<T> implements Iterable<Comparable<T>>{

	Nodo<T> head=null;
	Nodo<T> ultimo=null;
	int size=0;
	public Lista() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(Comparable<T> data) {
		Nodo<T> nodo = new Nodo<T>(data);
		if(ultimo==null) {
			head=nodo;
			ultimo=nodo;
		}else {
			ultimo.setNext(nodo);
			ultimo=nodo;
			
		}
		size++;
	}

	public void ordenar(Comparator<Comparable> c) {

		Nodo current = head, index = null;
		 
        Comparable<T> temp;
 
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                index = current.getNext();
                while (index != null) {
                    // si la data del current es mayor que la de index, las roto entre si
                    if (c.compare(current.getData(), index.getData())>0) {
                        temp = current.getData();
                        current.setData(index.getData());
                        index.setData(temp);
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
	}
	
	public Nodo<T> delete(Comparable<T> data){
		Nodo<T> nodoRetornar = null;
		
		if(size == 0) {
			return null;
		}
		if(size==1) {
			nodoRetornar= head;
			head=null;
			ultimo=null;
			size--;
			return nodoRetornar;
		}
		
		Nodo<T> nodoAnterior= findBefore(data);
		
		if(nodoAnterior != null) {
			if(ultimo.getData().equals(data)) {
				nodoAnterior.setNext(null);
				ultimo=nodoAnterior;
			}else {
				nodoAnterior.setNext(nodoAnterior.getNext().getNext());
			}
			size--;
		}else {
			nodoAnterior=head;
			head=head.getNext();
			return nodoAnterior;
			
			
		}
		return null;
	}
	
	public Nodo<T> findBefore(Comparable<T> data){
		
		if(head.getData().equals(data)) {
			return null;
		}
		
		Nodo<T> nodo = head;
		
		while(nodo.getNext()!=null) {
			if(nodo.getNext().getData().equals(data)) {
				return nodo;
			}
			nodo= nodo.getNext();
		}
		return null;
	}
	
	public Nodo<T> find(Comparable<T> data) {
		if(head==null) {
			return null;
		}
		if(head.getData().equals(data)) {
			return head;
		}
		
		Nodo<T> i=head;
		
		while(i.getNext()!=null) {
			i=i.getNext();
			if(i.getData().equals(data)) {
				return i;
			}
		}
		return null;
		
	}
	
	public String toString() {
		String info="[ ";
		Nodo<T> i = head;
		info += i +", ";
		while (i.getNext()!=null) {
			i=i.getNext();
			info += i + ", ";
			
		}
		return info +" ]";
	}

	@Override
	public Iterator<Comparable<T>> iterator() {
		// TODO Auto-generated method stub
		return new ListaIterable();
	}

	private class ListaIterable implements Iterator<Comparable<T>>{
		
		Nodo<T> actual = null;
		
		public ListaIterable() {
			
		}
		@Override
		public boolean hasNext() {
			if(actual ==null && head != null) {
				return true;
			}else if (actual !=null) {
				return actual.getNext() != null;	
			}
			return false;
		}

		@Override
		public Comparable<T> next() {
			if (actual == null && head !=null) {
				actual = head;
				return head.getData();
			}else if(actual != null) {
				actual = actual.getNext();
				return actual.getData();
			}
			return null;
		}
		
	}
}
