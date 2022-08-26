package record.records;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;


@Builder
public record OderRecordBuilder(long id, Customer customer, LocalDateTime localDateTime, List<OrderLine> orderLine) {
}
