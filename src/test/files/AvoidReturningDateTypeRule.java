import java.util.Date;

class AvoidAnnotationRule {

  public LocalDate returningLocalDate(){ // Compliant
    return null;
  }

  public Date returningDate(){ // Noncompliant {{Avoid returning java.util.Date type}}
    return null;
  }

}
