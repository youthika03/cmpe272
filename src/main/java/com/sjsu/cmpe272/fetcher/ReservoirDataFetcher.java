package com.sjsu.cmpe272.fetcher;

public class ReservoirDataFetcher {
	static String[] stationIds;
	public static void main(String[] args) {

		String stationIds[] = { "	ALM	", "	ANT	", "	APN	", "	AST	", "	ATN	",
			"	BAR	", "	BCL	", "	BDP	", "	BER	", "	BHC	", "	BIL	", "	BIO	",
			"	BIT	", "	BLB	", "	BMP	", "	BOC	", "	BQC	", "	BRD	", "	BRT	",
			"	BRV	", "	BTH	", "	BTV	", "	BUC	", "	BUL	", "	BUR	", "	BUX	",
			"	BWN	", "	BWS	", "	CAS	", "	CCH	", "	CFW	", "	CGS	", "	CHB	",
			"	CHV	", "	CHY	", "	CKL	", "	CLA	", "	CLE	", "	CLK	", "	CMB	",
			"	CMI	", "	CMN	", "	CNV	", "	COY	", "	CPL	", "	CRW	", "	CRY	",
			"	CSI	", "	CTG	", "	CUY	", "	CVE	", "	CYC	", "	CYL	", "	DAV	",
			"	DLV	", "	DMV	", "	DNL	", "	DNN	", "	DNP	", "	DON	", "	DRE	",
			"	DWN	", "	ECO	", "	EDN	", "	ELC	", "	ENG	", "	ENR	", "	EPK	",
			"	EXC	", "	FLR	", "	FMD	", "	FOL	", "	FRD	", "	FRL	", "	FRM	",
			"	GBL	", "	GBR	", "	GDW	", "	GLK	", "	GLL	", "	GNT	", "	HDG	",
			"	HHL	", "	HHY	", "	HID	", "	HMT	", "	HNN	", "	HNS	", "	HNT	",
			"	HTH	", "	HVS	", "	HWE	", "	ICH	", "	INL	", "	INP	", "	INV	",
			"	IRC	", "	IRG	", "	ISB	", "	JCK	", "	JNC	", "	JNK	", "	JNN	",
			"	KES	", "	KLM	", "	KNT	", "	KRH	", "	LBS	", "	LEW	", "	LFY	",
			"	LGT	", "	LGV	", "	LNG	", "	LON	", "	LOT	", "	LPY	", "	LRA	",
			"	LSB	", "	LUS	", "	LVD	", "	LVQ	", "	LVY	", "	LWB	", "	LYS	",
			"	MAR	", "	MAT	", "	MCO	", "	MCR	", "	MCS	", "	MDO	", "	MEA	",
			"	MFF	", "	MHV	", "	MHW	", "	MIL	", "	MMR	", "	MMW	", "	MNC	",
			"	MOR	", "	MPD	", "	MPL	", "	MRR	", "	MRT	", "	NAT	", "	NCA	",
			"	NCM	", "	NHG	", "	NML	", "	ONF	", "	ORO	", "	OWN	", "	PAR	",
			"	PLL	", "	PNF	", "	PRA	", "	PRR	", "	PRS	", "	PRU	", "	PT6	",
			"	PT7	", "	PWL	", "	PYM	", "	QUL	", "	RBL	", "	RDN	", "	RLC	",
			"	RLF	", "	RLL	", "	RTD	", "	SAT	", "	SCC	", "	SCD	", "	SDB	",
			"	SFL	", "	SGB	", "	SGC	", "	SHA	", "	SHV	", "	SIV	", "	SJT	",
			"	SKN	", "	SLB	", "	SLC	", "	SLF	", "	SLJ	", "	SLK	", "	SLN	",
			"	SLS	", "	SLW	", "	SNL	", "	SNN	", "	SOL	", "	SPB	", "	SPC	",
			"	SPG	", "	SPM	", "	STD	", "	STG	", "	STP	", "	SVO	", "	SVT	",
			"	SW3	", "	SWB	", "	TAB	", "	TAE	", "	TAH	", "	TFR	", "	THD	",
			"	TLC	", "	TMT	", "	TNM	", "	TRM	", "	TUL	", "	TWT	", "	UNV	",
			"	USL	", "	VAR	", "	VIL	", "	VLP	", "	WHI	", "	WHR	", "	WRS	",
			"	WSN	" };
		
		
		}
	public static String getReservoirId(){
		String value = null;
		for(int i=0;i<=stationIds.length;i++){
			value= stationIds[i].trim();
		}
		return value;
	}
	String urlTemplate = "http://cdec.water.ca.gov/cgi-progs/staMeta?station_id=";

}
