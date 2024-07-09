public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(15000);

        System.out.println("Начальный баланс: " + bankAccount.getAmount() + " сом");

        while(true){
            try {
                bankAccount.withDraw(6000);
                System.out.println("Успешно выведено: 6000 сом. Ваш остаток баланса на счету:  "
                        + bankAccount.getAmount() + " сом");
            } catch (LimitExpection e) {
                System.out.println("На вашем счету недостаточно средств для выполнения операции. ");
                System.out.println("C вашего счета была снято отсаток суммы: " + e.getRemainingAmount() + " сом");
                try{
                    bankAccount.withDraw((int) e.getRemainingAmount());
                } catch (LimitExpection expection) {

                }
                break;
            }
        }
    }
}