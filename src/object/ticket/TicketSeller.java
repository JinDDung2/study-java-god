package object.ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // TicketSeller가 ticketOffice 객체의 상태를 변경시킴 -> 객체의 자율성 저해
    // 객체의 자율성을 지키려면 TicketOffice가 Audience를 알아야 함 -> 객체간 결합도 증가
    // Trade-off 관계가 발생 -> 결합도를 낮추는 것을 선택함
    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buyTicket(ticketOffice.getTicket()));
    }

    @Override
    public String toString() {
        return "TicketSeller{" +
                "ticketOffice=" + ticketOffice +
                '}';
    }
}
