package Condition2;

public class NestedSwitch {
    // Metode untuk menerima nilai category & choice bertipe int
    public String getSelection(int category, int choice) {
        String result; // Membuat variabel result

        // Pemilihan bersarang untuk membuat opsi-opsi pesanan
        switch (category) {
            case 1:
                switch (choice) {
                    case 1:
                    result = "1, You selected: Tea";
                    break;
                    case 2:
                    result = "1, You selected: Coffee";
                    break;
                    case 3:
                    result = "1, You selected: Juice";
                    break;
                    case 4:
                    result = "1, You selected: Mineral";
                    break; 
                    default:
                    result = "1, Invalid drink choice";
                    break;

                }
            break;    
            case 2:
                switch (choice) {
                    case 1:
                    result = "2, You selected: Pizza";  
                    break;
                    case 2:
                    result = "2, You selected: Burger";
                    break;
                    case 3:
                    result = "2, You selected: Fries";
                    break;
                    default:
                    result = "2, Invalid food choice";
                    break;
                }
            break;    
            default:
            result = category + ", Invalid category";
            break;    
        }

        // Mengembalikan nilai dari result
        return result;
    }
}
