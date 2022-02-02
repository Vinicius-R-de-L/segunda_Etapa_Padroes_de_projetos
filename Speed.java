public class Speed{

	private SpeedState state;

	public Speed() {
		super();
		this.state = new Padrao(this);
	}
	
	public void changeSpeed() {
		state.changeSpeed();
	}

	public SpeedState getState() {
		return state;
	}

	public void setState(SpeedState state) {
		this.state = state;
	}

}
