package io.cygnux.console.api;

public final class PackageUtil {

    private PackageUtil() {
    }

    /**
     * @param obj Object
     * @return boolean
     */
    public static boolean isInConsoleBeansPackage(Object obj) {
        return obj != null && obj.getClass().getPackageName().startsWith(PackageUtil.class.getPackageName());
    }

}
