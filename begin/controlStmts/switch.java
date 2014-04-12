public class switch{
    public static void main(String[] args){
        char choice='a';
        switch(choice){
            case 'a':
            case 'A':
                System.out.println("Adding");
                break;
            case 'd':
            case 'D':
                System.out.println("Delete");
                break;
            default:
                System.out.println("Geçersiz seçim");
                break;
    
            }
    }
}
