public class Listener {
	public void addListener(O obj) {
		obj.notNull();
		obj.validate();
		listeners.add(obj.getListener());
	}
}
