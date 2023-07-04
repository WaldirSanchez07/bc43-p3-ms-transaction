package com.nttdata.mstransaction.application.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConsumptionRequest {

  private String cardId;
  private Double amount;
  private String description;

}
