package Models;
import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L;
    private int memberNumber;
    private String name;

    public Member(int memberNumber, String name) {
        this.memberNumber = memberNumber;
        this.name = name;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public String getName() {
        return name;
    }

    public static Member getMemberByNumber(int memberNumber) {
        switch (memberNumber) {
            case 1: return new Member(1, "Charles Rodriguez");
            case 2: return new Member(2, "Thomas Davis");
            case 3: return new Member(3, "John Hernandez");
            case 4: return new Member(4, "Barbara Anderson");
            case 5: return new Member(5, "Barbara Smith");
            case 6: return new Member(6, "Joseph Smith");
            case 7: return new Member(7, "William Johnson");
            case 8: return new Member(8, "John Martin");
            case 9: return new Member(9, "Linda Moore");
            case 10: return new Member(10, "Barbara Taylor");
            case 11: return new Member(11, "Barbara Lopez");
            case 12: return new Member(12, "Jennifer Davis");
            case 13: return new Member(13, "Robert Taylor");
            case 14: return new Member(14, "Jennifer Taylor");
            case 15: return new Member(15, "Linda Moore");
            case 16: return new Member(16, "Robert Anderson");
            case 17: return new Member(17, "Joseph Martinez");
            case 18: return new Member(18, "Karen Thomas");
            case 19: return new Member(19, "John Martinez");
            case 20: return new Member(20, "Jennifer Smith");
            case 21: return new Member(21, "Linda Jones");
            case 22: return new Member(22, "Jessica Martin");
            case 23: return new Member(23, "Mary Moore");
            case 24: return new Member(24, "Susan Martin");
            case 25: return new Member(25, "Joseph Williams");
            case 26: return new Member(26, "Jennifer Jones");
            case 27: return new Member(27, "Robert Brown");
            case 28: return new Member(28, "Jessica Brown");
            case 29: return new Member(29, "Robert Brown");
            case 30: return new Member(30, "Jessica Smith");
            case 31: return new Member(31, "Susan Wilson");
            case 32: return new Member(32, "Linda Gonzalez");
            case 33: return new Member(33, "Barbara Rodriguez");
            case 34: return new Member(34, "Susan Johnson");
            case 35: return new Member(35, "John Martinez");
            case 36: return new Member(36, "James Moore");
            case 37: return new Member(37, "David Johnson");
            case 38: return new Member(38, "Michael Jackson");
            case 39: return new Member(39, "John Wilson");
            case 40: return new Member(40, "Joseph Smith");
            case 41: return new Member(41, "Susan Miller");
            case 42: return new Member(42, "Robert Martin");
            case 43: return new Member(43, "Sarah Williams");
            case 44: return new Member(44, "Susan Smith");
            case 45: return new Member(45, "Linda Moore");
            case 46: return new Member(46, "Mary Anderson");
            case 47: return new Member(47, "James Rodriguez");
            case 48: return new Member(48, "Elizabeth Martin");
            case 49: return new Member(49, "Charles Brown");
            case 50: return new Member(50, "William Brown");
            case 51: return new Member(51, "Joseph Rodriguez");
            case 52: return new Member(52, "Richard Davis");
            case 53: return new Member(53, "James Martinez");
            case 54: return new Member(54, "Jessica Wilson");
            case 55: return new Member(55, "John Anderson");
            case 56: return new Member(56, "Mary Anderson");
            case 57: return new Member(57, "Richard Taylor");
            case 58: return new Member(58, "William Jackson");
            case 59: return new Member(59, "William Martinez");
            case 60: return new Member(60, "Susan Moore");
            case 61: return new Member(61, "Joseph Rodriguez");
            case 62: return new Member(62, "Richard Davis");
            case 63: return new Member(63, "James Martinez");
            case 64: return new Member(64, "Jessica Wilson");
            case 65: return new Member(65, "John Anderson");
            case 66: return new Member(66, "Mary Anderson");
            case 67: return new Member(67, "Richard Taylor");
            case 68: return new Member(68, "William Jackson");
            case 69: return new Member(69, "William Martinez");
            case 70: return new Member(70, "Susan Moore");
            case 71: return new Member(71, "Susan Thomas");
            case 72: return new Member(72, "Sarah Wilson");
            case 73: return new Member(73, "Elizabeth Thomas");
            case 74: return new Member(74, "James Garcia");
            case 75: return new Member(75, "Karen Martin");
            case 76: return new Member(76, "Michael Davis");
            case 77: return new Member(77, "Jessica Miller");
            case 78: return new Member(78, "James Wilson");
            case 79: return new Member(79, "Joseph Thomas");
            case 80: return new Member(80, "Karen Jackson");
            case 81: return new Member(81, "William Johnson");
            case 82: return new Member(82, "Jennifer Moore");
            case 83: return new Member(83, "Thomas Rodriguez");
            case 84: return new Member(84, "Mary Wilson");
            case 85: return new Member(85, "Mary Gonzalez");
            case 86: return new Member(86, "Sarah Hernandez");
            case 87: return new Member(87, "Mary Garcia");
            case 88: return new Member(88, "Jennifer Jones");
            case 89: return new Member(89, "Jennifer Thomas");
            case 90: return new Member(90, "Robert Garcia");
            case 91: return new Member(91, "Elizabeth Brown");
            case 92: return new Member(92, "Linda Wilson");
            case 93: return new Member(93, "James Martinez");
            case 94: return new Member(94, "Jennifer Smith");
            case 95: return new Member(95, "James Hernandez");
            case 96: return new Member(96, "Susan Brown");
            case 97: return new Member(97, "Charles Brown");
            case 98: return new Member(98, "Robert Hernandez");
            case 99: return new Member(99, "Richard Thomas");
            case 100: return new Member(100, "Linda Williams");
            default: return null;
        }
    }
}
