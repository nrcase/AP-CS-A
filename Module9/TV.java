
public class TV
{
    private String onOrOff; //Declaring Variables
    private int channelNumber;
    private int volume;

    public TV() //Default Constructor
    {
        onOrOff = "Off";
        channelNumber = 1;
        volume = 5;
    }

    public void setOnOrOff(String OnOff) //sets the TV to On or Off
    {
        OnOff = OnOff.toLowerCase(); //setting to lowercase to disregard case


        if (OnOff.equals("on"))
        {
            onOrOff = "On";
        }
        else if (OnOff.equals("off") )
        {
            onOrOff = "Off";
        }

    }

    public void setChannelNumber(int channel) //setting channel number
    {
        if (channel > 0 && channel <= 5) //setting channel if only between 1 and 5
        {
            channelNumber = channel;
        }

    }

    public void setVolume(String upOrDown) //Set volume
    {

          upOrDown = upOrDown.toLowerCase(); //sending to lowercase to disregard case

        if (upOrDown.equals("increase"))
        {
            if (volume >= 0 && volume <= 10) //if the volume is set to increase and is between 0 and 10, increase by 1
            {
                volume++;
            }
        }
        else if (upOrDown.equals("decrease")) //if the volume is set to decrease and is between 0 and 10, decrease by 1
        {
            if (volume >= 0 && volume <= 10)
            {
                volume--;
            }
        }


    }

    public int getVolume() //getting Volume
    {
        return volume;
    }

    public int getChannelNumber() //getting Channel Number
    {
        return channelNumber;
    }

    public String getOnOrOff() //getting on or off status
    {
        return onOrOff;
    }
}
