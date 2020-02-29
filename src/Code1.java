public class Code1 {
    public static void main(String[] args) {
        System.out.println(getCityDetails("Lubbock"));
    }
    public static String getCityDetails(String cityName){
        String zipCode= getZipCode(cityName);
        String stateName= getStateName(cityName);
        return zipCode +" "+ stateName;
    }
    public static String getStateName (String cityName){
            return "TX";
}
    public static String getZipCode(String cityName){
    return "79415";
    }
}