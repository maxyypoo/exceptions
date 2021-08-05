public class NumberGuesser {
	
	protected int high;
	protected int low;
	
	private int originalHigh;
	private int originalLow;
	
	public NumberGuesser(int l, int h) {
		low = originalLow = l;
		high = originalHigh = h;
	}
	
	public int getCurrentGuess() {
		return (high + low) / 2;
	}
	
	public void higher() throws NumberGuesserIllegalStateException {
		if (getCurrentGuess() == low)
			throw new NumberGuesserIllegalStateException("There is only 1 possible number choice, please don't cheat!!!");
		low = getCurrentGuess() + 1;
	}
	
	public void lower() throws NumberGuesserIllegalStateException {
		if (getCurrentGuess() == high)
			throw new NumberGuesserIllegalStateException("There is only 1 possible number choice, please don't cheat!!!");
		high = getCurrentGuess() - 1;
	}
	
	public void reset() {
		low = originalLow;
		high = originalHigh;
	}
}