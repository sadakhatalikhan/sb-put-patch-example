package com.sb.sdjpa.crud.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class CustomerAddress {
    private String customerAddress;
}
