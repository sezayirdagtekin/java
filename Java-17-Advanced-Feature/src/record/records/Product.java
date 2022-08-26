package record.records;

// Records are implicitly final
// Records cannot extend classes, but can implement interfaces  such as Comparable
// The common superclass for records is java.lang.Record
// Records can not be used for JPA entities

public record Product(long id, String name, String description) {

}

