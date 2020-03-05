
public class Address
{
    private String streetAddress; //Declaring variables
    private String city;
    private String state;
    private String zipCode;
    private String trash;
    private String cityTemp;

    public Address() //Default constructor
    {
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
    }

    public void Address(String theAddress) //Gets the address and sets it to the private variable
    {
        streetAddress = theAddress;
    }

    public void otherAddressStuff(String otherStuff) //Gets the other information and breaks it apart
    {
        int cityPosition = otherStuff.indexOf(','); //creates variable holding spot of comma to use later
        city = otherStuff.substring(0,cityPosition).trim(); // creating substring holding the city

        String tempStuff = (otherStuff.substring(cityPosition + 1)).trim(); // Creating a new string with the part of the string that is left

        int streetPosition = tempStuff.indexOf(' '); //create variable with index of the space for later

        state = tempStuff.substring(0,streetPosition).trim(); //Use the new substring without the city to get the state, start of the string to the space at the end of the State
        zipCode = tempStuff.substring(streetPosition).trim(); //Use the new substring without the city to get the zip code, from the space to the end of the substring


        if (zipCode.length() != 5) //if the zipcode is not 5 characters, exit
        {
            System.out.println("Please enter a 5 digit zip code");
            System.exit(1);
        }

        if (state.length() != 2) // if the state is not 2 characters, exit
        {
            System.out.println("Please enter a 2 digit state code");
            System.exit(1);
        }

    }

    public void finalPrint() //printing all the final info in the right format
    {
        System.out.println();
        System.out.println(streetAddress);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zipCode);
    }

    public String getCity() { //getters for all variables
        return city;
    }

    public String getCityTemp() {
        return cityTemp;
    }

    public String getState() {
        return state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getTrash() {
        return trash;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setCity(String city) { //setters for all variables
        this.city = city;
    }

    public void setCityTemp(String cityTemp) {
        this.cityTemp = cityTemp;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setTrash(String trash) {
        this.trash = trash;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}