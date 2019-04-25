package annoshoepack;

import org.springframework.stereotype.Component;

abstract public class Shoe { }

@Component("ss")
class SportShoe extends Shoe { }
@Component("ls")
class LeatherShoe extends Shoe { }