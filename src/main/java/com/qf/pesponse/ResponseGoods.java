package com.qf.pesponse;

import lombok.Data;

import java.util.List;
@Data
public class ResponseGoods<G> {
    private List<G> list;
    private Long total;
}
