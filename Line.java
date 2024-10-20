public class Line {
    private Dot first, second;

    Line(Dot first, Dot second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(Dot f) {
        this.first = f;
    }

    public void setSecond(Dot s) {
        this.second = s;
    }

    public Dot getFirst () {
        return this.first;
    }

    public Dot getSecond () {
        return this.second;
    }

    public String toString() {
        return "Линия от " + first.toString() + " до " + second.toString();
    }
}
