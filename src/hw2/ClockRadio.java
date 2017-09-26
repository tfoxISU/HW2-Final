/**
 * 
 */
package hw2;

/**
 * @author Trent Fox
 *
 */
public class ClockRadio {
	
	private int pastMidnight;
	
	
	public ClockRadio(int givenMinutesPastMidnight) {
		
	pastMidnight = givenMinutesPastMidnight;
		
		
	}
	
	public static final int SNOOZE_MINUTES = 9;
	public static final int MINUTES_PER_DAY= 1440;
	
	
	public void advanceTime(int givenHours, int givenMinutes) 
	{
		
	}

	public void alarmDisabled()
	{
		
	}
	
	public void alarmEnabled()
	{
		
	}
	
	public String getAlarmTimeAsString()
	{
		return "hello";
	}
	
	public int getAlarmTimeRaw()
	{
		return 5;
	}
	
	public String getEffectiveAlarmTimeAsString()
	{
		return "effectivalarm";
	}
	
	public int getEffectiveAlarmTimeRaw()
	{
		return 5;
	}
	
	public boolean isBuzzing()
	{
		return true;
	}
	
	public boolean isPlayingRadio()
	{
		return true;
	}
	
	public boolean isSounding()
	{
		return true;
	}
	
	public void set24HourDisplay(boolean use24HourDisplay)
	{
		
	}
	
	public void setAlarmTime(int givenMinutesPastMidnight)
	{
		
	}
	
	public void setRadioMode(boolean useRadio)
	{
		
	
	}
	
	public void setTime(int givenMinutesPastMidnight)
	{
		
		
	}
	
	public void snooze()
	{
		
	}
}
