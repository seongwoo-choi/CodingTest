package pattern;

public class SecondQuestion {
    public static void main(String[] args) {
        ViewVisitor viewVisitor = new ExprViewVisitor();
        System.out.println(new StarExpr(new AndExpr(new Character("a").visist(viewVisitor), new OrExpr(new Character("a").visist(viewVisitor), new Character("b").visist(viewVisitor)).visist(viewVisitor)).visist(viewVisitor)).visist(viewVisitor));
    }
}

class ExprViewVisitor implements ViewVisitor {

    @Override
    public String visit(StarExpr starExpr) {
        return starExpr.interpret();
    }

    @Override
    public String visit(AndExpr andExpr) {
        return andExpr.interpret();
    }

    @Override
    public String visit(OrExpr orExpr) {
        return orExpr.interpret();
    }

    @Override
    public String visit(Character character) {
        return character.interpret();
    }

    @Override
    public String visit(Epsilon epsilon) {
        return epsilon.interpret();
    }
}

interface ViewVisitor {
    String visit(StarExpr starExpr);

    String visit(AndExpr andExpr);

    String visit(OrExpr orExpr);

    String visit(Character character);

    String visit(Epsilon epsilon);
}

interface RegularExpr {
    String interpret();

    String visist(ViewVisitor viewVisitor);
}

class StarExpr implements RegularExpr {
    String i;

    public StarExpr(String i) {
        this.i = i;
    }

    @Override
    public String interpret() {
        return i + "*";
    }

    @Override
    public String visist(ViewVisitor viewVisitor) {
        return viewVisitor.visit(this);
    }
}

class Character implements RegularExpr {
    private String i;

    public Character(String i) {
        this.i = i;
    }

    @Override
    public String interpret() {
        return i;
    }

    @Override
    public String visist(ViewVisitor viewVisitor) {
        return viewVisitor.visit(this);
    }
}

class OrExpr implements RegularExpr {
    private String i, j;

    public OrExpr(String i, String j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String interpret() {
        return "(" + i + " + " + j + ")";
    }

    @Override
    public String visist(ViewVisitor viewVisitor) {
        return viewVisitor.visit(this);
    }
}

class AndExpr implements RegularExpr {
    private String i, j;

    public AndExpr(String i, String j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String interpret() {
        return "(" + i + " . " + j + ")";
    }

    @Override
    public String visist(ViewVisitor viewVisitor) {
        return viewVisitor.visit(this);
    }
}

class Epsilon implements RegularExpr {
    private String i, j;

    public Epsilon(String i, String j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String interpret() {
        return "";
    }

    @Override
    public String visist(ViewVisitor viewVisitor) {
        return viewVisitor.visit(this);
    }
}

