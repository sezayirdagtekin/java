package sealed.rules.interfaces;

public sealed interface Pet extends  Animal permits  Cat, Dog, Fish {
}

// Some rules sealed & records
//Records cannot extend sealed classes
//Records cannot be sealed
//Records can implement sealed interfaces
