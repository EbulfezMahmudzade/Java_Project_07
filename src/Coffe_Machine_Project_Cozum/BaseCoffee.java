package JavaProje07.Coffe_Machine_Project_Cozum;

abstract class BaseCoffee implements ICoffee {
    protected String name;
    protected boolean isCold;

    public BaseCoffee(String name, boolean isCold) {
        this.name = name;
        this.isCold = isCold;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing your " + name + "...");
    }

    @Override
    public boolean requiresMilk() {
        return true;
    }

    @Override
    public boolean requiresSugar() {
        return true;
    }
}
class Americano extends BaseCoffee {
    public Americano() {
        super("Americano", false);
    }
}

class Espresso extends BaseCoffee {
    public Espresso() {
        super("Espresso", false);
    }
}

class Cappuccino extends BaseCoffee {
    public Cappuccino() {
        super("Cappuccino", false);
    }
}

class Latte extends BaseCoffee {
    public Latte() {
        super("Latte", false);
    }
}
class Mocha extends BaseCoffee {
    public Mocha() {
        super("Mocha", false);
    }
}

class Macchiato extends BaseCoffee {
    public Macchiato() {
        super("Macchiato", false);
    }
}

class Affogato extends BaseCoffee {
    public Affogato() {
        super("Affogato", false);
    }
}

class IcedICoffee implements ICoffee {
    @Override
    public void prepare() {
        System.out.println("Preparing your Iced Coffee...");
    }

    @Override
    public boolean requiresMilk() {
        return true;
    }

    @Override
    public boolean requiresSugar() {
        return true;
    }
}
class Frappuccino implements ICoffee {
    @Override
    public void prepare() {
        System.out.println("Preparing your Frappuccino...");
    }

    @Override
    public boolean requiresMilk() {
        return true;
    }

    @Override
    public boolean requiresSugar() {
        return true;
    }
}

class IrishCoffee extends BaseCoffee {
    public IrishCoffee() {
        super("Irish Coffee", false);
    }

    @Override
    public boolean requiresSugar() {
        return false;
    }
}
