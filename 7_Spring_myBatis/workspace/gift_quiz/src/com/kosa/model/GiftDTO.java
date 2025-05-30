package com.kosa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiftDTO {
	private int gno;
	private String gname;
	private int g_start;
	private int g_end;

}

/*
 GNO        NUMBER       
GNAME      VARCHAR2(20) 
G_START    NUMBER       
G_END      NUMBER       

 */
