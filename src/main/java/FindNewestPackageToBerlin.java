import java.util.List;

public class FindNewestPackageToBerlin {

    public static Package findNewestPackageToBerlin(List<Package> packages) {
        Package newestPackage = null;

        for (Package pkg : packages) {
            if (pkg.getCityTo().equalsIgnoreCase("Берлин")) {
                if (newestPackage == null || pkg.getCreationDateTimePackage().isAfter(newestPackage.getCreationDateTimePackage())) {
                    newestPackage = pkg;
                }
            }
        }

        return newestPackage;



        }
    }
