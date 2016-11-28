package org.kosta.wikipictures.vo;

public class ReportVO {
	private int reportNo;
	private String reportType;
	private String reportContent;
	private String reportDate;
	private PictureVO pictureVO;
	
	public ReportVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReportVO(int reportNo, String reportType, String reportContent, String reportDate, PictureVO pictureVO) {
		super();
		this.reportNo = reportNo;
		this.reportType = reportType;
		this.reportContent = reportContent;
		this.reportDate = reportDate;
		this.pictureVO = pictureVO;
	}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getReportContent() {
		return reportContent;
	}

	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public PictureVO getPictureVO() {
		return pictureVO;
	}

	public void setPictureVO(PictureVO pictureVO) {
		this.pictureVO = pictureVO;
	}

	@Override
	public String toString() {
		return "ReportVO [reportNo=" + reportNo + ", reportType=" + reportType + ", reportContent=" + reportContent
				+ ", reportDate=" + reportDate + ", pictureVO=" + pictureVO + "]";
	}
	
	
	
}
