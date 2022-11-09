import java.util.Objects;

public final class RadResult {
    private int integerPart;
    private int radPart;

    public RadResult(int integerPart, int radPart) {
        this.integerPart = integerPart;
        this.radPart = radPart;
    }

    public int getIntegerPart() {
        return integerPart;
    }

    public int getRadPart() {
        return radPart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RadResult radResult = (RadResult) o;
        return integerPart == radResult.integerPart && radPart == radResult.radPart;
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerPart, radPart);
    }


}
