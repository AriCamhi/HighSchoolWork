import java.io.IOException;

public class Mushroom {
    private char edible; //edible=e,poisonous=p
    private char cap_shape; //bell=b,conical=c,convex=x,flat=f, knobbed=k,sunken=s
    private char cap_surface; //fibrous=f,grooves=g,scaly=y,smooth=s
    private char cap_color; //brown=n,buff=b,cinnamon=c,gray=g,green=r,pink=p,purple=u,red=e,white=w,yellow=y
    private char bruises; //bruises=t,no=f
    private char odor; //almond=a,anise=l,creosote=c,fishy=y,foul=f,musty=m,none=n,pungent=p,spicy=s
    private char gill_attachment; //attached=a,descending=d,free=f,notched=n
    private char gill_spacing; //close=c,crowded=w,distant=d
    private char gill_size; //broad=b,narrow=n
    private char gill_color; //black=k,brown=n,buff=b,chocolate=h,gray=g, green=r,orange=o,pink=p,purple=u,red=e,white=w,yellow=y
    private char stalk_shape; //enlarging=e,tapering=t
    private char stalk_root; //bulbous=b,club=c,cup=u,equal=e,rhizomorphs=z,rooted=r,missing=?
    private char stalk_surface_above_ring; //fibrous=f,scaly=y,silky=k,smooth=s
    private char stalk_surface_below_ring; //fibrous=f,scaly=y,silky=k,smooth=s
    private char stalk_color_above_ring; //brown=n,buff=b,cinnamon=c,gray=g,orange=o,pink=p,red=e,white=w,yellow=y
    private char stalk_color_below_ring; //brown=n,buff=b,cinnamon=c,gray=g,orange=o,pink=p,red=e,white=w,yellow=y
    private char veil_type; //partial=p,universal=u
    private char veil_color; //brown=n,orange=o,white=w,yellow=y
    private char ring_number; //none=n,one=o,two=t
    private char ring_type; //cobwebby=c,evanescent=e,flaring=f,large=l,none=n,pendant=p,sheathing=s,zone=z
    private char spore_print_color; //black=k,brown=n,buff=b,chocolate=h,green=r,orange=o,purple=u,white=w,yellow=y
    private char population; //abundant=a,clustered=c,numerous=n,scattered=s,several=v,solitary=y
    private char habitat; //grasses=g,leaves=l,meadows=m,paths=p,urban=u,waste=w,woods=d

    char[] mush;

    public Mushroom(String mushAL) throws IOException {
        edible = mushAL.charAt(0);
        cap_shape = mushAL.charAt(2);
        cap_surface = mushAL.charAt(4);
        cap_color = mushAL.charAt(6);
        bruises = mushAL.charAt(8);
        odor = mushAL.charAt(10);
        gill_attachment = mushAL.charAt(12);
        gill_spacing = mushAL.charAt(14);
        gill_size = mushAL.charAt(16);
        gill_color = mushAL.charAt(18);
        stalk_shape = mushAL.charAt(20);
        stalk_root = mushAL.charAt(22);
        stalk_surface_above_ring = mushAL.charAt(24);
        stalk_surface_below_ring = mushAL.charAt(26);
        stalk_color_above_ring = mushAL.charAt(28);
        stalk_color_below_ring = mushAL.charAt(30);
        veil_type = mushAL.charAt(32);
        veil_color = mushAL.charAt(34);
        ring_number = mushAL.charAt(36);
        ring_type = mushAL.charAt(38);
        spore_print_color = mushAL.charAt(40);
        population = mushAL.charAt(42);
        habitat = mushAL.charAt(44);

        mush = new char[]{edible, cap_shape, cap_color, bruises, odor, gill_attachment, gill_spacing, gill_size
                , gill_color, stalk_shape, stalk_root, stalk_surface_above_ring, stalk_surface_below_ring,
                stalk_color_above_ring, stalk_color_below_ring, veil_type, veil_color, ring_number, ring_type,
                spore_print_color, population, habitat};
    }

    //Getters
    public char getEdible() {
        return edible;
    }

    public char getCapShape() {
        return cap_shape;
    }

    public char getCapSurface() {
        return cap_surface;
    }

    public char getCapColor() {
        return cap_color;
    }

    public char getBruises() {
        return bruises;
    }

    public char getOdor() {
        return odor;
    }

    public char getGillAttachment() {
        return gill_attachment;
    }

    public char getGillSpacing() {
        return gill_spacing;
    }

    public char getGillSize() {
        return gill_size;
    }

    public char get_color() {
        return gill_color;
    }

    public char getStalkShape() {
        return stalk_shape;
    }

    public char getStalkRoot() {
        return stalk_root;
    }

    public char getHabitat() {
        return habitat;
    }

    public char getPopulation() {
        return population;
    }

    public char getSporePrintColor() {
        return spore_print_color;
    }

    public char getRingType() {
        return ring_type;
    }

    public char getRingNumber() {
        return ring_number;
    }

    public char getVeilColor() {
        return veil_color;
    }

    public char getVeilType() {
        return veil_type;
    }

    public char getStalkColorBelowRing() {
        return stalk_color_below_ring;
    }

    public char getStalkColorAboveRing() {
        return stalk_color_above_ring;
    }

    public char getStalkSurfaceBelowRing() {
        return stalk_surface_below_ring;
    }

    public char getStalkSurfaceAboveRing() {
        return stalk_surface_above_ring;
    }

    //toString
    public String toString() {
        String output = "";
        output += "Edible: " + edible;
        output += "Cap Shape: " + cap_shape;
        output += "Cap Surface: " + cap_surface;
        output += "Cap color: " + cap_color;
        output += "Bruises: " + cap_surface;
        output += "Oder: " + odor;
        output += "Gill Attachments: " + gill_attachment;
        output += "Gill Spacing: " + gill_spacing;
        output += "Gill Size: " + gill_size;
        output += "Gill Color: " + gill_color;
        output += "Stalk Shape: " + stalk_shape;
        output += "Stalk Root: " + stalk_root;
        output += "Stalk Surface Above Ring: " + stalk_surface_above_ring;
        output += "Stalk Surface Below Ring: " + stalk_surface_below_ring;
        output += "Stalk Color Above Ring: " + stalk_color_above_ring;
        output += "Stalk Color Below Ring: " + stalk_color_below_ring;
        output += "Veil Type: " + veil_type;
        output += "Veil Color: " + veil_color;
        output += "Ring Number: " + ring_number;
        output += "Ring Type: " + ring_type;
        output += "Spore Print Color: " + spore_print_color;
        output += "Population: " + population;
        output += "Habitat: " + habitat;
        return output;
    }
}
