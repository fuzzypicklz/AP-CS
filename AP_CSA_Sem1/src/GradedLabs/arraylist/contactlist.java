
package GradedLabs.arraylist;
public class contactlist
{
private String first, last, telephone;
private int zip;

public contactlist (String first, String last, String telephone, int zip)
{
this.first = first;
this.last = last;
this.telephone = telephone;
this.zip=zip;
}

public String toString ()
{
return first +" \t " +last + " \t "+ zip + "\t" + telephone;
}

}