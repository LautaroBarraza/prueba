package listaVinculada;

import java.util.Comparator;
import java.util.Iterator;

public class Lista<T> implements Iterable<Comparable>{

	Nodo<T> head=null;
	int size=0;
	Comparator orden;
	public Lista(Comparator c) {
		this.orden=c;
		// TODO Auto-generated constructor stub
	}
	
	public void setOrden(Comparator c) {
		this.orden=c;
		this.sort();
	}
	
	public int getSize() {
		return size;
	}
	
	
	public void add(Comparable data) {
		// creo un nodo para encapsular
		Nodo<T> nodo = new Nodo<T>(data);
		Nodo<T> current=head;
		//si ultimo null, primero y ultimo se vuelven el nuevo nodo
		if(this.head == null) {
			head=nodo;
		}else {
			while(current.getNext() != null) {
				current=current.getNext();
			}
			current.setNext(nodo);
			this.sort();
		}
		size++;
	}
	
	
	//ordenar dado un comparator
	private void sort() {
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
                    if (this.orden.compare(current.getData(), index.getData())>0) {
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
	
	public Comparable delete(int pos) {
		Nodo<T> current = head;
		int i=0;
		if(pos==0) {
			head=head.getNext();
			size--;
			return current.getData();
		}
		while(current!=null && i<size) {
			if(i==pos-1) {
				Comparable aux = current.getNext().getData();
				current.setNext(current.getNext().getNext());
				size--;
				return aux;
			}else {
				i++;
				current= current.getNext();
			}
		}
		return null;
		
	}
	
	//borrar todas las ocurrencias dado un elemento
	public void deleteAllOcurrences(Comparable data){
		
		while (head != null && head.getData().equals(data)) {
			head = head.getNext();
			size--;
		}
		Nodo<T> current=head;
		while (current != null && current.getNext() != null) {
			if (current.getNext().getData().equals(data)) {
				current.setNext(current.getNext().getNext());
				size--;
			}
			else {
				current = current.getNext();
			}
		}
	}
	//encontrar un elemento dado el elemento
	public Integer find(Comparable data) {
		int pos=0;
		if(head==null) {
			return null;
		}
		if(head.getData().equals(data)) {
			return pos;
		}
		
		Nodo<T> i=head;
		
		while(i.getNext()!=null) {
			pos++;
			i=i.getNext();
			if(i.getData().equals(data)) {
				return pos;
			}
			
		}
		return null;	
	}
	
	public String toString() {
		if(head !=null) {
			String info="[ ";
			Nodo<T> i = head;
			info += i +", ";
			while (i.getNext()!=null) {
				i=i.getNext();
				info += i + ", ";
				
			}
			return info +" ]";
		}
			return "";

	}

	@Override
	public Iterator<Comparable> iterator() {
		// TODO Auto-generated method stub
		return new ListaIterable();
	}

	private class ListaIterable implements Iterator<Comparable>{
		
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
		public Comparable next() {
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
