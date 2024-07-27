import java.time.LocalDate;
import java.time.LocalDateTime;

public class Package {

private String  cityFrom;
private String cityTo;
private double weight;
private LocalDateTime creationDateTimePackage;

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDateTime getCreationDateTimePackage() {
        return creationDateTimePackage;
    }

    @Override
    public String toString() {
        return "Package{" +
                "cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", weight=" + weight +
                ", creationDateTimePackage=" + creationDateTimePackage +
                '}';
    }

    public Package(String cityFrom, String cityTo, double weight, LocalDateTime creationDateTimePackage) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.weight = weight;
        this.creationDateTimePackage = creationDateTimePackage;

    }
}
