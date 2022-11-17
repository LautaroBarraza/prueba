package listaVinculada;

import java.util.Comparator;
import java.util.Iterator;

public class Lista<T> implements Iterable<T>{

	Nodo<T> head=null;
	int size=0;
	Comparator<T> orden;
	
	
	
	//constructor
	public Lista(Comparator<T> c) {
		this.orden=c;
	}
	
	
	
	//set orden
	public void setOrden(Comparator<T> c) {
		this.orden=c;
		this.sort();
	}
	//obtener tamaño
	public int getSize() {
		return size;
	}
	
	//agregar nodo y ordenar
	public void add(T data) {
		// creo un nodo para encapsular
		Nodo<T> nodo = new Nodo<T>(data);
		
		//recorro la lista y agrego el nodo al final y luego ordeno
		Nodo<T> current=head;
		
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
	
	
	//ordenar dado el comparator de la lista
	private void sort() {
		Nodo<T> current = head, index = null;
        T temp;
 
        //recorro la lista y comparo con el siguiente, si es mayor intercambia la data de los nodos
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
	
	
	//borrar un nodo dado una posicion
	public T delete(int pos) {
		Nodo<T> current = head;
		int i=0;
		
		//recorro la lista hasta llegar a la pos, luego elimino ese nodo
		if(pos==0) {
			head=head.getNext();
			size--;
			return current.getData();
		}
		while(current!=null && i<size) {
			if(i==pos-1) {
				T aux = current.getNext().getData();
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
	public void deleteAllOcurrences(T data){
		
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
	public Integer find(T data) {
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
	
	
	//to string
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
	public Iterator<T> iterator() {
		return new ListaIterable();
	}

	private class ListaIterable implements Iterator<T>{
		
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
		public T next() {
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
