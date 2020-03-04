package main;

public class ColorRepository implements Container {
	public String colors[] = {"red", "yellow", "green" };

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new ColorIterator();
	}
	
	private class ColorIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			
			if(index < colors.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return colors[index++];
			}
			return null;
		}
	}
}
