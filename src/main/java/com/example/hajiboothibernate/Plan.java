package com.example.hajiboothibernate;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PLAN")
public class Plan implements java.io.Serializable {
	 /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    private PlanId            id;

    private String            planPmsPackageId;

    private String            planPmsBlockId;

    private Byte              planPmsTypeKbn;

    private String            planPmsSlipId1;

    private Integer           planPmsSlipCost1;

    private Byte              planPmsSlipDateKbn1;

    private String            planPmsSlipId2;

    private Integer           planPmsSlipCost2;

    private Byte              planPmsSlipDateKbn2;

    private String            planPmsSlipId3;

    private Integer           planPmsSlipCost3;

    private Byte              planPmsSlipDateKbn3;

    private String            planPmsReserveKind;

    private String            planPmsReserveAdd;

    private String            optId;

    private String            inputOptId;

    private Date              planPeriodFrom;

    private Date              planPeriodTo;

    private int               planSort;

    private Integer           planCalendarType;

    private Byte              planThxMailFlg;

    private String            planThxMailFrom;

    private String            planThxMailTo;

    private String            planThxMailBcc;

    private Byte              planResMailFlg;

    private Byte              planResMailFromKbn;

    private String            planResMailFrom;

    private String            planResMailTo;

    private String            planResMailBcc;

    private Byte              planRankCalPmsKbn;

    private Byte              planChargePmsKbn;

    private String            planStandbyFlg;

    private String            planLangFlg;

    private String            planThxMailKbn;

    private String            planManageDetails;

    private String            planManageName;

    private String            planManageText;

    private String            planResMailFromName;

    private String            planResMailSubject;

    private String            planResMailText;

    private Byte              planShowFlg;

    private Byte              planDispFlg;

    private Byte              secPlanFlg;

    private String            secUserid;

    private String            secPass;

    private Date              checkInTime;

    private Date              checkOutTime;

    private String            planImg1;

    private String            planImg2;

    private String            planImg3;

    private String            planImg4;

    private String            planImg5;

    private Byte              planChargeDispTypKbn;

    private Date              planShowFrom;

    private Date              planShowTo;

    private Byte              planStayCheckFlg;

    private Integer           planMinStay;

    private Integer           planMaxStay;

    private Byte              planPmsIndividualFlg;

    private Byte              planChargeAdultUseFlg;

    private Byte              planChargeChildUseFlg;

    private Byte              planChargeInfantUseFlg;

    private Byte              planChargeBabyUseFlg;

    private Byte              planPmsWriteAdultKbn;

    private Byte              planPmsWriteChildKbn;

    private Byte              planPmsWriteInfantKbn;

    private Byte              planPmsWriteBabyKbn;

    private String            planLimitDay;

    private Date              planLimitHour;

    private Byte              planRoomCheckFlg;

    private Integer           planMaxRoom;

    private Integer           planMinRoom;

    private Byte              planNightLimit;

    private String            createdBy;

    private Date              createdDate;

    private String            modifiedBy;

    private Date              modifiedDate;

    private boolean           delFlg;

    private String            planChangeDispTypKbn;

    private String            planLimitStartDay;

    private Date              planLimitStartHour;

    private Byte              searchableOtherPlanFlg;

    private Byte              specializeRoomFlg;

    private int               planRoomSort;

    private String            plandirectSearchDefaultDay;

    private String            gdoCouponNoteImport1;

    private String            gdoCouponNoteClassification1;

    private String            gdoCouponNoteContent1;

    private String            gdoCouponNoteImport2;

    private String            gdoCouponNoteClassification2;

    private String            gdoCouponNoteContent2;

    private String            gdoCouponNoteImport3;

    private String            gdoCouponNoteClassification3;

    private String            gdoCouponNoteContent3;

    private String            gdoCouponNoteImport4;

    private String            gdoCouponNoteClassification4;

    private String            gdoCouponNoteContent4;

    private String            gdoCouponNoteImport5;

    private String            gdoCouponNoteClassification5;

    private String            gdoCouponNoteContent5;

    private Byte              tbLinkDisplay;

    private Byte              tbLinkOtherPlan;

    private String            tbLinkPlanId;

    private String            rankCalendarCode;

    private Byte              accountPlanFlg;

    private Date              checkInEndTime;

    private Boolean           useDefaultResMail;

    private Boolean           usePlanConsumptionTaxRate;

    private Short             consumptionTaxRate;

    private Boolean           mailDomainCheckFlg;

    private String            permissionDomain;

    private Integer           prePaymentRatio;

    private Integer           checkInSettingId;

    private Boolean           useAccount2Flg;

    private Boolean           gttInvalidFlg;

    private Boolean           planSalesAreaFlg;

    private Boolean           usePlanCheckTime;

    private String            displayCheckIn;

    private String            displayCheckOut;

    private Integer           mealFlg;

    public Plan()
    {}

    public Plan(PlanId id, String planPmsPackageId, Byte planPmsTypeKbn, Date planPeriodFrom, Date planPeriodTo, int planSort, Byte planResMailFlg, Byte planResMailFromKbn, Byte secPlanFlg,
            String planImg1, Byte planChargeDispTypKbn, Date planShowFrom, Date planShowTo, Byte planStayCheckFlg, Byte planPmsIndividualFlg, Byte planChargeAdultUseFlg, Byte planChargeChildUseFlg,
            Byte planChargeInfantUseFlg, Byte planChargeBabyUseFlg, Byte planPmsWriteAdultKbn, Byte planPmsWriteChildKbn, Byte planPmsWriteInfantKbn, Byte planPmsWriteBabyKbn, Byte planNightLimit,
            String createdBy, String modifiedBy, boolean delFlg, Byte searchableOtherPlanFlg, Byte specializeRoomFlg, int planRoomSort, String gdoCouponNoteImport1,
            String gdoCouponNoteClassification1, String gdoCouponNoteContent1, String gdoCouponNoteImport2, String gdoCouponNoteClassification2, String gdoCouponNoteContent2,
            String gdoCouponNoteImport3, String gdoCouponNoteClassification3, String gdoCouponNoteContent3, String gdoCouponNoteImport4, String gdoCouponNoteClassification4,
            String gdoCouponNoteContent4, String gdoCouponNoteImport5, String gdoCouponNoteClassification5, String gdoCouponNoteContent5)
    {
        this.id = id;
        this.planPmsPackageId = planPmsPackageId;
        this.planPmsTypeKbn = planPmsTypeKbn;
        this.planPeriodFrom = planPeriodFrom;
        this.planPeriodTo = planPeriodTo;
        this.planSort = planSort;
        this.planResMailFlg = planResMailFlg;
        this.planResMailFromKbn = planResMailFromKbn;
        this.secPlanFlg = secPlanFlg;
        this.planImg1 = planImg1;
        this.planChargeDispTypKbn = planChargeDispTypKbn;
        this.planShowFrom = planShowFrom;
        this.planShowTo = planShowTo;
        this.planStayCheckFlg = planStayCheckFlg;
        this.planPmsIndividualFlg = planPmsIndividualFlg;
        this.planChargeAdultUseFlg = planChargeAdultUseFlg;
        this.planChargeChildUseFlg = planChargeChildUseFlg;
        this.planChargeInfantUseFlg = planChargeInfantUseFlg;
        this.planChargeBabyUseFlg = planChargeBabyUseFlg;
        this.planPmsWriteAdultKbn = planPmsWriteAdultKbn;
        this.planPmsWriteChildKbn = planPmsWriteChildKbn;
        this.planPmsWriteInfantKbn = planPmsWriteInfantKbn;
        this.planPmsWriteBabyKbn = planPmsWriteBabyKbn;
        this.planNightLimit = planNightLimit;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.delFlg = delFlg;
        this.searchableOtherPlanFlg = searchableOtherPlanFlg;
        this.specializeRoomFlg = specializeRoomFlg;
        this.planRoomSort = planRoomSort;
        this.gdoCouponNoteImport1 = gdoCouponNoteImport1;
        this.gdoCouponNoteClassification1 = gdoCouponNoteClassification1;
        this.gdoCouponNoteContent1 = gdoCouponNoteContent1;
        this.gdoCouponNoteImport2 = gdoCouponNoteImport2;
        this.gdoCouponNoteClassification2 = gdoCouponNoteClassification2;
        this.gdoCouponNoteContent2 = gdoCouponNoteContent2;
        this.gdoCouponNoteImport3 = gdoCouponNoteImport3;
        this.gdoCouponNoteClassification3 = gdoCouponNoteClassification3;
        this.gdoCouponNoteContent3 = gdoCouponNoteContent3;
        this.gdoCouponNoteImport4 = gdoCouponNoteImport4;
        this.gdoCouponNoteClassification4 = gdoCouponNoteClassification4;
        this.gdoCouponNoteContent4 = gdoCouponNoteContent4;
        this.gdoCouponNoteImport5 = gdoCouponNoteImport5;
        this.gdoCouponNoteClassification5 = gdoCouponNoteClassification5;
        this.gdoCouponNoteContent5 = gdoCouponNoteContent5;
    }

    public Plan(PlanId id, String planPmsPackageId, String planPmsBlockId, Byte planPmsTypeKbn, String planPmsSlipId1, Integer planPmsSlipCost1, Byte planPmsSlipDateKbn1, String planPmsSlipId2,
            Integer planPmsSlipCost2, Byte planPmsSlipDateKbn2, String planPmsSlipId3, Integer planPmsSlipCost3, Byte planPmsSlipDateKbn3, String planPmsReserveKind, String planPmsReserveAdd,
            String optId, String inputOptId, Date planPeriodFrom, Date planPeriodTo, int planSort, Integer planCalendarType, Byte planThxMailFlg, String planThxMailFrom, String planThxMailTo,
            String planThxMailBcc, Byte planResMailFlg, Byte planResMailFromKbn, String planResMailFrom, String planResMailTo, String planResMailBcc, Byte planRankCalPmsKbn, Byte planChargePmsKbn,
            String planStandbyFlg, String planLangFlg, String planThxMailKbn, String planManageDetails, String planManageName, String planManageText, String planResMailFromName,
            String planResMailSubject, String planResMailText, Byte planShowFlg, Byte planDispFlg, Byte secPlanFlg, String secUserid, String secPass, Date checkInTime, Date checkOutTime,
            String planImg1, String planImg2, String planImg3, String planImg4, String planImg5, Byte planChargeDispTypKbn, Date planShowFrom, Date planShowTo, Byte planStayCheckFlg,
            Integer planMinStay, Integer planMaxStay, Byte planPmsIndividualFlg, Byte planChargeAdultUseFlg, Byte planChargeChildUseFlg, Byte planChargeInfantUseFlg, Byte planChargeBabyUseFlg,
            Byte planPmsWriteAdultKbn, Byte planPmsWriteChildKbn, Byte planPmsWriteInfantKbn, Byte planPmsWriteBabyKbn, String planLimitDay, Date planLimitHour, Byte planRoomCheckFlg,
            Integer planMaxRoom, Integer planMinRoom, Byte planNightLimit, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate, boolean delFlg, String planChangeDispTypKbn,
            String planLimitStartDay, Date planLimitStartHour, Byte searchableOtherPlanFlg, Byte specializeRoomFlg, int planRoomSort, String gdoCouponNoteImport1, String gdoCouponNoteClassification1,
            String gdoCouponNoteContent1, String gdoCouponNoteImport2, String gdoCouponNoteClassification2, String gdoCouponNoteContent2, String gdoCouponNoteImport3,
            String gdoCouponNoteClassification3, String gdoCouponNoteContent3, String gdoCouponNoteImport4, String gdoCouponNoteClassification4, String gdoCouponNoteContent4,
            String gdoCouponNoteImport5, String gdoCouponNoteClassification5, String gdoCouponNoteContent5, Byte accountPlanFlg)
    {
        this.id = id;
        this.planPmsPackageId = planPmsPackageId;
        this.planPmsBlockId = planPmsBlockId;
        this.planPmsTypeKbn = planPmsTypeKbn;
        this.planPmsSlipId1 = planPmsSlipId1;
        this.planPmsSlipCost1 = planPmsSlipCost1;
        this.planPmsSlipDateKbn1 = planPmsSlipDateKbn1;
        this.planPmsSlipId2 = planPmsSlipId2;
        this.planPmsSlipCost2 = planPmsSlipCost2;
        this.planPmsSlipDateKbn2 = planPmsSlipDateKbn2;
        this.planPmsSlipId3 = planPmsSlipId3;
        this.planPmsSlipCost3 = planPmsSlipCost3;
        this.planPmsSlipDateKbn3 = planPmsSlipDateKbn3;
        this.planPmsReserveKind = planPmsReserveKind;
        this.planPmsReserveAdd = planPmsReserveAdd;
        this.optId = optId;
        this.inputOptId = inputOptId;
        this.planPeriodFrom = planPeriodFrom;
        this.planPeriodTo = planPeriodTo;
        this.planSort = planSort;
        this.planCalendarType = planCalendarType;
        this.planThxMailFlg = planThxMailFlg;
        this.planThxMailFrom = planThxMailFrom;
        this.planThxMailTo = planThxMailTo;
        this.planThxMailBcc = planThxMailBcc;
        this.planResMailFlg = planResMailFlg;
        this.planResMailFromKbn = planResMailFromKbn;
        this.planResMailFrom = planResMailFrom;
        this.planResMailTo = planResMailTo;
        this.planResMailBcc = planResMailBcc;
        this.planRankCalPmsKbn = planRankCalPmsKbn;
        this.planChargePmsKbn = planChargePmsKbn;
        this.planStandbyFlg = planStandbyFlg;
        this.planLangFlg = planLangFlg;
        this.planThxMailKbn = planThxMailKbn;
        this.planManageDetails = planManageDetails;
        this.planManageName = planManageName;
        this.planManageText = planManageText;
        this.planResMailFromName = planResMailFromName;
        this.planResMailSubject = planResMailSubject;
        this.planResMailText = planResMailText;
        this.planShowFlg = planShowFlg;
        this.planDispFlg = planDispFlg;
        this.secPlanFlg = secPlanFlg;
        this.secUserid = secUserid;
        this.secPass = secPass;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.planImg1 = planImg1;
        this.planImg2 = planImg2;
        this.planImg3 = planImg3;
        this.planImg4 = planImg4;
        this.planImg5 = planImg5;
        this.planChargeDispTypKbn = planChargeDispTypKbn;
        this.planShowFrom = planShowFrom;
        this.planShowTo = planShowTo;
        this.planStayCheckFlg = planStayCheckFlg;
        this.planMinStay = planMinStay;
        this.planMaxStay = planMaxStay;
        this.planPmsIndividualFlg = planPmsIndividualFlg;
        this.planChargeAdultUseFlg = planChargeAdultUseFlg;
        this.planChargeChildUseFlg = planChargeChildUseFlg;
        this.planChargeInfantUseFlg = planChargeInfantUseFlg;
        this.planChargeBabyUseFlg = planChargeBabyUseFlg;
        this.planPmsWriteAdultKbn = planPmsWriteAdultKbn;
        this.planPmsWriteChildKbn = planPmsWriteChildKbn;
        this.planPmsWriteInfantKbn = planPmsWriteInfantKbn;
        this.planPmsWriteBabyKbn = planPmsWriteBabyKbn;
        this.planLimitDay = planLimitDay;
        this.planLimitHour = planLimitHour;
        this.planRoomCheckFlg = planRoomCheckFlg;
        this.planMaxRoom = planMaxRoom;
        this.planMinRoom = planMinRoom;
        this.planNightLimit = planNightLimit;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.delFlg = delFlg;
        this.planChangeDispTypKbn = planChangeDispTypKbn;
        this.planLimitStartDay = planLimitStartDay;
        this.planLimitStartHour = planLimitStartHour;
        this.searchableOtherPlanFlg = searchableOtherPlanFlg;
        this.specializeRoomFlg = specializeRoomFlg;
        this.planRoomSort = planRoomSort;
        this.gdoCouponNoteImport1 = gdoCouponNoteImport1;
        this.gdoCouponNoteClassification1 = gdoCouponNoteClassification1;
        this.gdoCouponNoteContent1 = gdoCouponNoteContent1;
        this.gdoCouponNoteImport2 = gdoCouponNoteImport2;
        this.gdoCouponNoteClassification2 = gdoCouponNoteClassification2;
        this.gdoCouponNoteContent2 = gdoCouponNoteContent2;
        this.gdoCouponNoteImport3 = gdoCouponNoteImport3;
        this.gdoCouponNoteClassification3 = gdoCouponNoteClassification3;
        this.gdoCouponNoteContent3 = gdoCouponNoteContent3;
        this.gdoCouponNoteImport4 = gdoCouponNoteImport4;
        this.gdoCouponNoteClassification4 = gdoCouponNoteClassification4;
        this.gdoCouponNoteContent4 = gdoCouponNoteContent4;
        this.gdoCouponNoteImport5 = gdoCouponNoteImport5;
        this.gdoCouponNoteClassification5 = gdoCouponNoteClassification5;
        this.gdoCouponNoteContent5 = gdoCouponNoteContent5;
        this.accountPlanFlg = accountPlanFlg;
    }

    @EmbeddedId
    @AttributeOverrides(
    {@AttributeOverride(name = "hotelId", column = @Column(name = "HOTEL_ID", nullable = false, length = 10)),
            @AttributeOverride(name = "planId", column = @Column(name = "PLAN_ID", nullable = false, length = 10))})
    public PlanId getId()
    {
        return this.id;
    }

    public void setId(PlanId id)
    {
        this.id = id;
    }

    @Column(name = "PLAN_PMS_PACKAGE_ID", nullable = false)
    public String getPlanPmsPackageId()
    {
        return this.planPmsPackageId;
    }

    public void setPlanPmsPackageId(String planPmsPackageId)
    {
        this.planPmsPackageId = planPmsPackageId;
    }

    @Column(name = "PLAN_PMS_BLOCK_ID", length = 3)
    public String getPlanPmsBlockId()
    {
        return this.planPmsBlockId;
    }

    public void setPlanPmsBlockId(String planPmsBlockId)
    {
        this.planPmsBlockId = planPmsBlockId;
    }

    @Column(name = "PLAN_PMS_TYPE_KBN", nullable = false)
    public Byte getPlanPmsTypeKbn()
    {
        return this.planPmsTypeKbn;
    }

    public void setPlanPmsTypeKbn(Byte planPmsTypeKbn)
    {
        this.planPmsTypeKbn = planPmsTypeKbn;
    }

    @Column(name = "PLAN_PMS_SLIP_ID1", length = 10)
    public String getPlanPmsSlipId1()
    {
        return this.planPmsSlipId1;
    }

    public void setPlanPmsSlipId1(String planPmsSlipId1)
    {
        this.planPmsSlipId1 = planPmsSlipId1;
    }

    @Column(name = "PLAN_PMS_SLIP_COST1")
    public Integer getPlanPmsSlipCost1()
    {
        return this.planPmsSlipCost1;
    }

    public void setPlanPmsSlipCost1(Integer planPmsSlipCost1)
    {
        this.planPmsSlipCost1 = planPmsSlipCost1;
    }

    @Column(name = "PLAN_PMS_SLIP_DATE_KBN1")
    public Byte getPlanPmsSlipDateKbn1()
    {
        return this.planPmsSlipDateKbn1;
    }

    public void setPlanPmsSlipDateKbn1(Byte planPmsSlipDateKbn1)
    {
        this.planPmsSlipDateKbn1 = planPmsSlipDateKbn1;
    }

    @Column(name = "PLAN_PMS_SLIP_ID2", length = 10)
    public String getPlanPmsSlipId2()
    {
        return this.planPmsSlipId2;
    }

    public void setPlanPmsSlipId2(String planPmsSlipId2)
    {
        this.planPmsSlipId2 = planPmsSlipId2;
    }

    @Column(name = "PLAN_PMS_SLIP_COST2")
    public Integer getPlanPmsSlipCost2()
    {
        return this.planPmsSlipCost2;
    }

    public void setPlanPmsSlipCost2(Integer planPmsSlipCost2)
    {
        this.planPmsSlipCost2 = planPmsSlipCost2;
    }

    @Column(name = "PLAN_PMS_SLIP_DATE_KBN2")
    public Byte getPlanPmsSlipDateKbn2()
    {
        return this.planPmsSlipDateKbn2;
    }

    public void setPlanPmsSlipDateKbn2(Byte planPmsSlipDateKbn2)
    {
        this.planPmsSlipDateKbn2 = planPmsSlipDateKbn2;
    }

    @Column(name = "PLAN_PMS_SLIP_ID3", length = 10)
    public String getPlanPmsSlipId3()
    {
        return this.planPmsSlipId3;
    }

    public void setPlanPmsSlipId3(String planPmsSlipId3)
    {
        this.planPmsSlipId3 = planPmsSlipId3;
    }

    @Column(name = "PLAN_PMS_SLIP_COST3")
    public Integer getPlanPmsSlipCost3()
    {
        return this.planPmsSlipCost3;
    }

    public void setPlanPmsSlipCost3(Integer planPmsSlipCost3)
    {
        this.planPmsSlipCost3 = planPmsSlipCost3;
    }

    @Column(name = "PLAN_PMS_SLIP_DATE_KBN3")
    public Byte getPlanPmsSlipDateKbn3()
    {
        return this.planPmsSlipDateKbn3;
    }

    public void setPlanPmsSlipDateKbn3(Byte planPmsSlipDateKbn3)
    {
        this.planPmsSlipDateKbn3 = planPmsSlipDateKbn3;
    }

    @Column(name = "PLAN_PMS_RESERVE_KIND", length = 50)
    public String getPlanPmsReserveKind()
    {
        return this.planPmsReserveKind;
    }

    public void setPlanPmsReserveKind(String planPmsReserveKind)
    {
        this.planPmsReserveKind = planPmsReserveKind;
    }

    @Column(name = "PLAN_PMS_RESERVE_ADD", length = 1000)
    public String getPlanPmsReserveAdd()
    {
        return this.planPmsReserveAdd;
    }

    public void setPlanPmsReserveAdd(String planPmsReserveAdd)
    {
        this.planPmsReserveAdd = planPmsReserveAdd;
    }

    @Column(name = "OPT_ID", length = 10)
    public String getOptId()
    {
        return this.optId;
    }

    public void setOptId(String optId)
    {
        this.optId = optId;
    }

    @Column(name = "INPUT_OPT_ID", length = 10)
    public String getInputOptId()
    {
        return this.inputOptId;
    }

    public void setInputOptId(String inputOptId)
    {
        this.inputOptId = inputOptId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PLAN_PERIOD_FROM", nullable = false, length = 19)
    public Date getPlanPeriodFrom()
    {
        return this.planPeriodFrom;
    }

    public void setPlanPeriodFrom(Date planPeriodFrom)
    {
        this.planPeriodFrom = planPeriodFrom;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PLAN_PERIOD_TO", nullable = false, length = 19)
    public Date getPlanPeriodTo()
    {
        return this.planPeriodTo;
    }

    public void setPlanPeriodTo(Date planPeriodTo)
    {
        this.planPeriodTo = planPeriodTo;
    }

    @Column(name = "PLAN_SORT", nullable = false)
    public int getPlanSort()
    {
        return this.planSort;
    }

    public void setPlanSort(int planSort)
    {
        this.planSort = planSort;
    }

    @Column(name = "PLAN_CALENDAR_TYPE")
    public Integer getPlanCalendarType()
    {
        return this.planCalendarType;
    }

    public void setPlanCalendarType(Integer planCalendarType)
    {
        this.planCalendarType = planCalendarType;
    }

    @Column(name = "PLAN_THX_MAIL_FLG")
    public Byte getPlanThxMailFlg()
    {
        return this.planThxMailFlg;
    }

    public void setPlanThxMailFlg(Byte planThxMailFlg)
    {
        this.planThxMailFlg = planThxMailFlg;
    }

    @Column(name = "PLAN_THX_MAIL_FROM", length = 50)
    public String getPlanThxMailFrom()
    {
        return this.planThxMailFrom;
    }

    public void setPlanThxMailFrom(String planThxMailFrom)
    {
        this.planThxMailFrom = planThxMailFrom;
    }

    @Column(name = "PLAN_THX_MAIL_TO", length = 45)
    public String getPlanThxMailTo()
    {
        return this.planThxMailTo;
    }

    public void setPlanThxMailTo(String planThxMailTo)
    {
        this.planThxMailTo = planThxMailTo;
    }

    @Column(name = "PLAN_THX_MAIL_BCC", length = 200)
    public String getPlanThxMailBcc()
    {
        return this.planThxMailBcc;
    }

    public void setPlanThxMailBcc(String planThxMailBcc)
    {
        this.planThxMailBcc = planThxMailBcc;
    }

    @Column(name = "PLAN_RES_MAIL_FLG", nullable = false)
    public Byte getPlanResMailFlg()
    {
        return this.planResMailFlg;
    }

    public void setPlanResMailFlg(Byte planResMailFlg)
    {
        this.planResMailFlg = planResMailFlg;
    }

    @Column(name = "PLAN_RES_MAIL_FROM_KBN", nullable = false)
    public Byte getPlanResMailFromKbn()
    {
        return this.planResMailFromKbn;
    }

    public void setPlanResMailFromKbn(Byte planResMailFromKbn)
    {
        this.planResMailFromKbn = planResMailFromKbn;
    }

    @Column(name = "PLAN_RES_MAIL_FROM", length = 50)
    public String getPlanResMailFrom()
    {
        return this.planResMailFrom;
    }

    public void setPlanResMailFrom(String planResMailFrom)
    {
        this.planResMailFrom = planResMailFrom;
    }

    @Column(name = "PLAN_RES_MAIL_TO", length = 200)
    public String getPlanResMailTo()
    {
        return this.planResMailTo;
    }

    public void setPlanResMailTo(String planResMailTo)
    {
        this.planResMailTo = planResMailTo;
    }

    @Column(name = "PLAN_RES_MAIL_BCC", length = 200)
    public String getPlanResMailBcc()
    {
        return this.planResMailBcc;
    }

    public void setPlanResMailBcc(String planResMailBcc)
    {
        this.planResMailBcc = planResMailBcc;
    }

    @Column(name = "PLAN_RANK_CAL_PMS_KBN")
    public Byte getPlanRankCalPmsKbn()
    {
        return this.planRankCalPmsKbn;
    }

    public void setPlanRankCalPmsKbn(Byte planRankCalPmsKbn)
    {
        this.planRankCalPmsKbn = planRankCalPmsKbn;
    }

    @Column(name = "PLAN_CHARGE_PMS_KBN")
    public Byte getPlanChargePmsKbn()
    {
        return this.planChargePmsKbn;
    }

    public void setPlanChargePmsKbn(Byte planChargePmsKbn)
    {
        this.planChargePmsKbn = planChargePmsKbn;
    }

    @Column(name = "PLAN_STANDBY_FLG")
    public String getPlanStandbyFlg()
    {
        return this.planStandbyFlg;
    }

    public void setPlanStandbyFlg(String planStandbyFlg)
    {
        this.planStandbyFlg = planStandbyFlg;
    }

    @Column(name = "PLAN_LANG_FLG", length = 200)
    public String getPlanLangFlg()
    {
        return this.planLangFlg;
    }

    public void setPlanLangFlg(String planLangFlg)
    {
        this.planLangFlg = planLangFlg;
    }

    @Column(name = "PLAN_THX_MAIL_KBN")
    public String getPlanThxMailKbn()
    {
        return this.planThxMailKbn;
    }

    public void setPlanThxMailKbn(String planThxMailKbn)
    {
        this.planThxMailKbn = planThxMailKbn;
    }

    @Column(name = "PLAN_MANAGE_DETAILS", length = 65535)
    public String getPlanManageDetails()
    {
        return this.planManageDetails;
    }

    public void setPlanManageDetails(String planManageDetails)
    {
        this.planManageDetails = planManageDetails;
    }

    @Column(name = "PLAN_MANAGE_NAME")
    public String getPlanManageName()
    {
        return this.planManageName;
    }

    public void setPlanManageName(String planManageName)
    {
        this.planManageName = planManageName;
    }

    @Column(name = "PLAN_MANAGE_TEXT")
    public String getPlanManageText()
    {
        return this.planManageText;
    }

    public void setPlanManageText(String planManageText)
    {
        this.planManageText = planManageText;
    }

    @Column(name = "PLAN_RES_MAIL_FROM_NAME")
    public String getPlanResMailFromName()
    {
        return this.planResMailFromName;
    }

    public void setPlanResMailFromName(String planResMailFromName)
    {
        this.planResMailFromName = planResMailFromName;
    }

    @Column(name = "PLAN_RES_MAIL_SUBJECT")
    public String getPlanResMailSubject()
    {
        return this.planResMailSubject;
    }

    public void setPlanResMailSubject(String planResMailSubject)
    {
        this.planResMailSubject = planResMailSubject;
    }

    @Column(name = "PLAN_RES_MAIL_TEXT")
    public String getPlanResMailText()
    {
        return this.planResMailText;
    }

    public void setPlanResMailText(String planResMailText)
    {
        this.planResMailText = planResMailText;
    }

    @Column(name = "PLAN_SHOW_FLG")
    public Byte getPlanShowFlg()
    {
        return this.planShowFlg;
    }

    public void setPlanShowFlg(Byte planShowFlg)
    {
        this.planShowFlg = planShowFlg;
    }

    @Column(name = "PLAN_DISP_FLG")
    public Byte getPlanDispFlg()
    {
        return this.planDispFlg;
    }

    public void setPlanDispFlg(Byte planDispFlg)
    {
        this.planDispFlg = planDispFlg;
    }

    @Column(name = "SEC_PLAN_FLG", nullable = false)
    public Byte getSecPlanFlg()
    {
        return this.secPlanFlg;
    }

    public void setSecPlanFlg(Byte secPlanFlg)
    {
        this.secPlanFlg = secPlanFlg;
    }

    @Column(name = "SEC_USERID", length = 10)
    public String getSecUserid()
    {
        return this.secUserid;
    }

    public void setSecUserid(String secUserid)
    {
        this.secUserid = secUserid;
    }

    @Column(name = "SEC_PASS", length = 6)
    public String getSecPass()
    {
        return this.secPass;
    }

    public void setSecPass(String secPass)
    {
        this.secPass = secPass;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "CHECK_IN_TIME", length = 8)
    public Date getCheckInTime()
    {
        return this.checkInTime;
    }

    public void setCheckInTime(Date checkInTime)
    {
        this.checkInTime = checkInTime;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "CHECK_IN_END_TIME", length = 8)
    public Date getCheckInEndTime()
    {
        return this.checkInEndTime;
    }

    public void setCheckInEndTime(Date checkInEndTime)
    {
        this.checkInEndTime = checkInEndTime;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "CHECK_OUT_TIME", length = 8)
    public Date getCheckOutTime()
    {
        return this.checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime)
    {
        this.checkOutTime = checkOutTime;
    }

    @Column(name = "PLAN_IMG1", nullable = false, length = 50)
    public String getPlanImg1()
    {
        return this.planImg1;
    }

    public void setPlanImg1(String planImg1)
    {
        this.planImg1 = planImg1;
    }

    @Column(name = "PLAN_IMG2", length = 50)
    public String getPlanImg2()
    {
        return this.planImg2;
    }

    public void setPlanImg2(String planImg2)
    {
        this.planImg2 = planImg2;
    }

    @Column(name = "PLAN_IMG3", length = 50)
    public String getPlanImg3()
    {
        return this.planImg3;
    }

    public void setPlanImg3(String planImg3)
    {
        this.planImg3 = planImg3;
    }

    @Column(name = "PLAN_IMG4", length = 50)
    public String getPlanImg4()
    {
        return this.planImg4;
    }

    public void setPlanImg4(String planImg4)
    {
        this.planImg4 = planImg4;
    }

    @Column(name = "PLAN_IMG5", length = 50)
    public String getPlanImg5()
    {
        return this.planImg5;
    }

    public void setPlanImg5(String planImg5)
    {
        this.planImg5 = planImg5;
    }

    @Column(name = "PLAN_CHARGE_DISP_TYP_KBN", nullable = false)
    public Byte getPlanChargeDispTypKbn()
    {
        return this.planChargeDispTypKbn;
    }

    public void setPlanChargeDispTypKbn(Byte planChargeDispTypKbn)
    {
        this.planChargeDispTypKbn = planChargeDispTypKbn;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PLAN_SHOW_FROM", nullable = false, length = 19)
    public Date getPlanShowFrom()
    {
        return this.planShowFrom;
    }

    public void setPlanShowFrom(Date planShowFrom)
    {
        this.planShowFrom = planShowFrom;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PLAN_SHOW_TO", nullable = false, length = 19)
    public Date getPlanShowTo()
    {
        return this.planShowTo;
    }

    public void setPlanShowTo(Date planShowTo)
    {
        this.planShowTo = planShowTo;
    }

    @Column(name = "PLAN_STAY_CHECK_FLG", nullable = false)
    public Byte getPlanStayCheckFlg()
    {
        return this.planStayCheckFlg;
    }

    public void setPlanStayCheckFlg(Byte planStayCheckFlg)
    {
        this.planStayCheckFlg = planStayCheckFlg;
    }

    @Column(name = "PLAN_MIN_STAY")
    public Integer getPlanMinStay()
    {
        return this.planMinStay;
    }

    public void setPlanMinStay(Integer planMinStay)
    {
        this.planMinStay = planMinStay;
    }

    @Column(name = "PLAN_MAX_STAY")
    public Integer getPlanMaxStay()
    {
        return this.planMaxStay;
    }

    public void setPlanMaxStay(Integer planMaxStay)
    {
        this.planMaxStay = planMaxStay;
    }

    @Column(name = "PLAN_PMS_INDIVIDUAL_FLG", nullable = false)
    public Byte getPlanPmsIndividualFlg()
    {
        return this.planPmsIndividualFlg;
    }

    public void setPlanPmsIndividualFlg(Byte planPmsIndividualFlg)
    {
        this.planPmsIndividualFlg = planPmsIndividualFlg;
    }

    @Column(name = "PLAN_CHARGE_ADULT_USE_FLG", nullable = false)
    public Byte getPlanChargeAdultUseFlg()
    {
        return this.planChargeAdultUseFlg;
    }

    public void setPlanChargeAdultUseFlg(Byte planChargeAdultUseFlg)
    {
        this.planChargeAdultUseFlg = planChargeAdultUseFlg;
    }

    @Column(name = "PLAN_CHARGE_CHILD_USE_FLG", nullable = false)
    public Byte getPlanChargeChildUseFlg()
    {
        return this.planChargeChildUseFlg;
    }

    public void setPlanChargeChildUseFlg(Byte planChargeChildUseFlg)
    {
        this.planChargeChildUseFlg = planChargeChildUseFlg;
    }

    @Column(name = "PLAN_CHARGE_INFANT_USE_FLG", nullable = false)
    public Byte getPlanChargeInfantUseFlg()
    {
        return this.planChargeInfantUseFlg;
    }

    public void setPlanChargeInfantUseFlg(Byte planChargeInfantUseFlg)
    {
        this.planChargeInfantUseFlg = planChargeInfantUseFlg;
    }

    @Column(name = "PLAN_CHARGE_BABY_USE_FLG", nullable = false)
    public Byte getPlanChargeBabyUseFlg()
    {
        return this.planChargeBabyUseFlg;
    }

    public void setPlanChargeBabyUseFlg(Byte planChargeBabyUseFlg)
    {
        this.planChargeBabyUseFlg = planChargeBabyUseFlg;
    }

    @Column(name = "PLAN_PMS_WRITE_ADULT_KBN", nullable = false)
    public Byte getPlanPmsWriteAdultKbn()
    {
        return this.planPmsWriteAdultKbn;
    }

    public void setPlanPmsWriteAdultKbn(Byte planPmsWriteAdultKbn)
    {
        this.planPmsWriteAdultKbn = planPmsWriteAdultKbn;
    }

    @Column(name = "PLAN_PMS_WRITE_CHILD_KBN", nullable = false)
    public Byte getPlanPmsWriteChildKbn()
    {
        return this.planPmsWriteChildKbn;
    }

    public void setPlanPmsWriteChildKbn(Byte planPmsWriteChildKbn)
    {
        this.planPmsWriteChildKbn = planPmsWriteChildKbn;
    }

    @Column(name = "PLAN_PMS_WRITE_INFANT_KBN", nullable = false)
    public Byte getPlanPmsWriteInfantKbn()
    {
        return this.planPmsWriteInfantKbn;
    }

    public void setPlanPmsWriteInfantKbn(Byte planPmsWriteInfantKbn)
    {
        this.planPmsWriteInfantKbn = planPmsWriteInfantKbn;
    }

    @Column(name = "PLAN_PMS_WRITE_BABY_KBN", nullable = false)
    public Byte getPlanPmsWriteBabyKbn()
    {
        return this.planPmsWriteBabyKbn;
    }

    public void setPlanPmsWriteBabyKbn(Byte planPmsWriteBabyKbn)
    {
        this.planPmsWriteBabyKbn = planPmsWriteBabyKbn;
    }

    @Column(name = "PLAN_LIMIT_DAY", length = 15)
    public String getPlanLimitDay()
    {
        return this.planLimitDay;
    }

    public void setPlanLimitDay(String planLimitDay)
    {
        this.planLimitDay = planLimitDay;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "PLAN_LIMIT_HOUR", length = 8)
    public Date getPlanLimitHour()
    {
        return this.planLimitHour;
    }

    public void setPlanLimitHour(Date planLimitHour)
    {
        this.planLimitHour = planLimitHour;
    }

    @Column(name = "PLAN_ROOM_CHECK_FLG")
    public Byte getPlanRoomCheckFlg()
    {
        return this.planRoomCheckFlg;
    }

    public void setPlanRoomCheckFlg(Byte planRoomCheckFlg)
    {
        this.planRoomCheckFlg = planRoomCheckFlg;
    }

    @Column(name = "PLAN_MAX_ROOM")
    public Integer getPlanMaxRoom()
    {
        return this.planMaxRoom;
    }

    public void setPlanMaxRoom(Integer planMaxRoom)
    {
        this.planMaxRoom = planMaxRoom;
    }

    @Column(name = "PLAN_MIN_ROOM")
    public Integer getPlanMinRoom()
    {
        return this.planMinRoom;
    }

    public void setPlanMinRoom(Integer planMinRoom)
    {
        this.planMinRoom = planMinRoom;
    }

    @Column(name = "PLAN_NIGHT_LIMIT", nullable = false)
    public Byte getPlanNightLimit()
    {
        return this.planNightLimit;
    }

    public void setPlanNightLimit(Byte planNightLimit)
    {
        this.planNightLimit = planNightLimit;
    }

    @Column(name = "CREATED_BY", nullable = false, length = 50)
    public String getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE", length = 19)
    public Date getCreatedDate()
    {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate)
    {
        this.createdDate = createdDate;
    }

    @Column(name = "MODIFIED_BY", nullable = false, length = 50)
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }

    public void setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MODIFIED_DATE", length = 19)
    public Date getModifiedDate()
    {
        return this.modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate)
    {
        this.modifiedDate = modifiedDate;
    }

    @Column(name = "DEL_FLG", nullable = false)
    public boolean isDelFlg()
    {
        return this.delFlg;
    }

    public void setDelFlg(boolean delFlg)
    {
        this.delFlg = delFlg;
    }

    @Column(name = "PLAN_CHANGE_DISP_TYP_KBN")
    public String getPlanChangeDispTypKbn()
    {
        return this.planChangeDispTypKbn;
    }

    public void setPlanChangeDispTypKbn(String planChangeDispTypKbn)
    {
        this.planChangeDispTypKbn = planChangeDispTypKbn;
    }

    @Column(name = "PLAN_LIMIT_START_DAY", length = 15)
    public String getPlanLimitStartDay()
    {
        return this.planLimitStartDay;
    }

    public void setPlanLimitStartDay(String planLimitStartDay)
    {
        this.planLimitStartDay = planLimitStartDay;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "PLAN_LIMIT_START_HOUR", length = 8)
    public Date getPlanLimitStartHour()
    {
        return this.planLimitStartHour;
    }

    public void setPlanLimitStartHour(Date planLimitStartHour)
    {
        this.planLimitStartHour = planLimitStartHour;
    }

    @Column(name = "SEARCHABLE_OTHER_PLAN_FLG", nullable = false)
    public Byte getSearchableOtherPlanFlg()
    {
        return this.searchableOtherPlanFlg;
    }

    public void setSearchableOtherPlanFlg(Byte searchableOtherPlanFlg)
    {
        this.searchableOtherPlanFlg = searchableOtherPlanFlg;
    }

    @Column(name = "SPECIALIZE_ROOM_FLG", nullable = false)
    public Byte getSpecializeRoomFlg()
    {
        return this.specializeRoomFlg;
    }

    public void setSpecializeRoomFlg(Byte specializeRoomFlg)
    {
        this.specializeRoomFlg = specializeRoomFlg;
    }

    @Column(name = "PLAN_ROOM_SORT", nullable = false)
    public int getPlanRoomSort()
    {
        return this.planRoomSort;
    }

    public void setPlanRoomSort(int planRoomSort)
    {
        this.planRoomSort = planRoomSort;
    }

    @Column(name = "PLANDIRECT_SEARCH_DEFAULT_DAY", nullable = false)
    public String getPlandirectSearchDefaultDay()
    {
        return this.plandirectSearchDefaultDay;
    }

    public void setPlandirectSearchDefaultDay(String plandirectSearchDefaultDay)
    {
        this.plandirectSearchDefaultDay = plandirectSearchDefaultDay;
    }

    @Column(name = "GDO_COUPON_NOTE_IMPORT_1", length = 50)
    public String getGdoCouponNoteImport1()
    {
        return gdoCouponNoteImport1;
    }

    public void setGdoCouponNoteImport1(String gdoCouponNoteImport1)
    {
        this.gdoCouponNoteImport1 = gdoCouponNoteImport1;
    }

    @Column(name = "GDO_COUPON_NOTE_CLASSIFICATION_1", length = 50)
    public String getGdoCouponNoteClassification1()
    {
        return gdoCouponNoteClassification1;
    }

    public void setGdoCouponNoteClassification1(String gdoCouponNoteClassification1)
    {
        this.gdoCouponNoteClassification1 = gdoCouponNoteClassification1;
    }

    @Column(name = "GDO_COUPON_NOTE_CONTENT_1", length = 2000)
    public String getGdoCouponNoteContent1()
    {
        return gdoCouponNoteContent1;
    }

    public void setGdoCouponNoteContent1(String gdoCouponNoteContent1)
    {
        this.gdoCouponNoteContent1 = gdoCouponNoteContent1;
    }

    @Column(name = "GDO_COUPON_NOTE_IMPORT_2", length = 50)
    public String getGdoCouponNoteImport2()
    {
        return gdoCouponNoteImport2;
    }

    public void setGdoCouponNoteImport2(String gdoCouponNoteImport2)
    {
        this.gdoCouponNoteImport2 = gdoCouponNoteImport2;
    }

    @Column(name = "GDO_COUPON_NOTE_CLASSIFICATION_2", length = 50)
    public String getGdoCouponNoteClassification2()
    {
        return gdoCouponNoteClassification2;
    }

    public void setGdoCouponNoteClassification2(String gdoCouponNoteClassification2)
    {
        this.gdoCouponNoteClassification2 = gdoCouponNoteClassification2;
    }

    @Column(name = "GDO_COUPON_NOTE_CONTENT_2", length = 2000)
    public String getGdoCouponNoteContent2()
    {
        return gdoCouponNoteContent2;
    }

    public void setGdoCouponNoteContent2(String gdoCouponNoteContent2)
    {
        this.gdoCouponNoteContent2 = gdoCouponNoteContent2;
    }

    @Column(name = "GDO_COUPON_NOTE_IMPORT_3", length = 50)
    public String getGdoCouponNoteImport3()
    {
        return gdoCouponNoteImport3;
    }

    public void setGdoCouponNoteImport3(String gdoCouponNoteImport3)
    {
        this.gdoCouponNoteImport3 = gdoCouponNoteImport3;
    }

    @Column(name = "GDO_COUPON_NOTE_CLASSIFICATION_3", length = 50)
    public String getGdoCouponNoteClassification3()
    {
        return gdoCouponNoteClassification3;
    }

    public void setGdoCouponNoteClassification3(String gdoCouponNoteClassification3)
    {
        this.gdoCouponNoteClassification3 = gdoCouponNoteClassification3;
    }

    @Column(name = "GDO_COUPON_NOTE_CONTENT_3", length = 2000)
    public String getGdoCouponNoteContent3()
    {
        return gdoCouponNoteContent3;
    }

    public void setGdoCouponNoteContent3(String gdoCouponNoteContent3)
    {
        this.gdoCouponNoteContent3 = gdoCouponNoteContent3;
    }

    @Column(name = "GDO_COUPON_NOTE_IMPORT_4", length = 50)
    public String getGdoCouponNoteImport4()
    {
        return gdoCouponNoteImport4;
    }

    public void setGdoCouponNoteImport4(String gdoCouponNoteImport4)
    {
        this.gdoCouponNoteImport4 = gdoCouponNoteImport4;
    }

    @Column(name = "GDO_COUPON_NOTE_CLASSIFICATION_4", length = 50)
    public String getGdoCouponNoteClassification4()
    {
        return gdoCouponNoteClassification4;
    }

    public void setGdoCouponNoteClassification4(String gdoCouponNoteClassification4)
    {
        this.gdoCouponNoteClassification4 = gdoCouponNoteClassification4;
    }

    @Column(name = "GDO_COUPON_NOTE_CONTENT_4", length = 2000)
    public String getGdoCouponNoteContent4()
    {
        return gdoCouponNoteContent4;
    }

    public void setGdoCouponNoteContent4(String gdoCouponNoteContent4)
    {
        this.gdoCouponNoteContent4 = gdoCouponNoteContent4;
    }

    @Column(name = "GDO_COUPON_NOTE_IMPORT_5", length = 50)
    public String getGdoCouponNoteImport5()
    {
        return gdoCouponNoteImport5;
    }

    public void setGdoCouponNoteImport5(String gdoCouponNoteImport5)
    {
        this.gdoCouponNoteImport5 = gdoCouponNoteImport5;
    }

    @Column(name = "GDO_COUPON_NOTE_CLASSIFICATION_5", length = 50)
    public String getGdoCouponNoteClassification5()
    {
        return gdoCouponNoteClassification5;
    }

    public void setGdoCouponNoteClassification5(String gdoCouponNoteClassification5)
    {
        this.gdoCouponNoteClassification5 = gdoCouponNoteClassification5;
    }

    @Column(name = "GDO_COUPON_NOTE_CONTENT_5", length = 2000)
    public String getGdoCouponNoteContent5()
    {
        return gdoCouponNoteContent5;
    }

    public void setGdoCouponNoteContent5(String gdoCouponNoteContent5)
    {
        this.gdoCouponNoteContent5 = gdoCouponNoteContent5;
    }

    @Column(name = "TB_LINK_DISPLAY")
    public Byte getTbLinkDisplay()
    {
        return tbLinkDisplay;
    }

    public void setTbLinkDisplay(Byte tbLinkDisplay)
    {
        this.tbLinkDisplay = tbLinkDisplay;
    }

    @Column(name = "TB_LINK_OTHER_PLAN")
    public Byte getTbLinkOtherPlan()
    {
        return tbLinkOtherPlan;
    }

    public void setTbLinkOtherPlan(Byte tbLinkOtherPlan)
    {
        this.tbLinkOtherPlan = tbLinkOtherPlan;
    }

    @Column(name = "TB_LINK_PLAN_ID")
    public String getTbLinkPlanId()
    {
        return tbLinkPlanId;
    }

    public void setTbLinkPlanId(String tbLinkPlanId)
    {
        this.tbLinkPlanId = tbLinkPlanId;
    }

    @Column(name = "RANK_CALENDAR_CODE")
    public String getRankCalendarCode()
    {
        return rankCalendarCode;
    }

    public void setRankCalendarCode(String rankCalendarCode)
    {
        this.rankCalendarCode = rankCalendarCode;
    }

    /**
     * accountPlanFlgを取得します。<br />
     *
     * @return accountPlanFlg
     */
    @Column(name = "ACCOUNT_PLAN_FLG")
    public Byte getAccountPlanFlg()
    {
        return accountPlanFlg;
    }

    /**
     * accountPlanFlgを設定します。<br />
     *
     * @param accountPlanFlg accountPlanFlg
     */
    public void setAccountPlanFlg(Byte accountPlanFlg)
    {
        this.accountPlanFlg = accountPlanFlg;
    }

    @Column(name = "USE_DEFAULT_RES_MAIL")
    public Boolean getUseDefaultResMail()
    {
        return useDefaultResMail;
    }

    public void setUseDefaultResMail(Boolean useDefaultResMail)
    {
        this.useDefaultResMail = useDefaultResMail;
    }

    /**
     * usePlanConsumptionTaxRateを取得します。<br />
     *
     * @return usePlanConsumptionTaxRate
     */
    @Column(name = "USE_PLAN_CONSUMPTION_TAX_RATE")
    public Boolean getUsePlanConsumptionTaxRate()
    {
        return usePlanConsumptionTaxRate;
    }

    /**
    * usePlanConsumptionTaxRateを設定します。<br />
    *
    * @param usePlanConsumptionTaxRate usePlanConsumptionTaxRate
    */
    public void setUsePlanConsumptionTaxRate(Boolean usePlanConsumptionTaxRate)
    {
        this.usePlanConsumptionTaxRate = usePlanConsumptionTaxRate;
    }

    /**
    * consumptionTaxRateを取得します。<br />
    *
    * @return consumptionTaxRate
    */
    @Column(name = "CONSUMPTION_TAX_RATE")
    public Short getConsumptionTaxRate()
    {
        return consumptionTaxRate;
    }

    /**
    * consumptionTaxRateを設定します。<br />
    *
    * @param consumptionTaxRate consumptionTaxRate
    */
    public void setConsumptionTaxRate(Short consumptionTaxRate)
    {
        this.consumptionTaxRate = consumptionTaxRate;
    }

    /**
     * mailDomainCheckFlgを取得します。<br />
     *
     * @return mailDomainCheckFlg
     */
    @Column(name = "MAIL_DOMAIN_CHECK_FLG")
    public Boolean getMailDomainCheckFlg()
    {
        return mailDomainCheckFlg;
    }

    /**
     * mailDomainCheckFlgを設定します。<br />
     *
     * @param mailDomainCheckFlg mailDomainCheckFlg
     */
    public void setMailDomainCheckFlg(Boolean mailDomainCheckFlg)
    {
        this.mailDomainCheckFlg = mailDomainCheckFlg;
    }

    /**
     * permissionDomainを取得します。<br />
     *
     * @return permissionDomain
     */
    @Column(name = "PERMISSION_DOMAIN")
    public String getPermissionDomain()
    {
        return permissionDomain;
    }

    /**
     * permissionDomainを設定します。<br />
     *
     * @param permissionDomain permissionDomain
     */
    public void setPermissionDomain(String permissionDomain)
    {
        this.permissionDomain = permissionDomain;
    }

    /**
     * prePaymentRatioを取得します。<br />
     *
     * @return prePaymentRatio
     */
    @Column(name = "PRE_PAYMENT_RATIO")
    public Integer getPrePaymentRatio()
    {
        return prePaymentRatio;
    }

    /**
     * prePaymentRatioを設定します。<br />
     *
     * @param prePaymentRatio prePaymentRatio
     */
    public void setPrePaymentRatio(Integer prePaymentRatio)
    {
        this.prePaymentRatio = prePaymentRatio;
    }

    /**
     * checkInSettingIdを取得します。<br />
     *
     * @return checkInSettingId
     */
    @Column(name = "CHECK_IN_SETTING_ID")
    public Integer getCheckInSettingId()
    {
        return checkInSettingId;
    }

    /**
     * checkInSettingIdを設定します。<br />
     *
     * @param checkInSettingId checkInSettingId
     */
    public void setCheckInSettingId(Integer checkInSettingId)
    {
        this.checkInSettingId = checkInSettingId;
    }

    /**
     * useAccount2Flgを取得します。<br />
     *
     * @return useAccount2Flg
     */
    @Column(name = "USE_ACCOUNT2_FLG")
    public Boolean isUseAccount2Flg()
    {
        return useAccount2Flg;
    }

    /**
     * useAccount2Flgを設定します。<br />
     *
     * @param useAccount2Flg useAccount2Flg
     */
    public void setUseAccount2Flg(Boolean useAccount2Flg)
    {
        this.useAccount2Flg = useAccount2Flg;
    }

    /**
     * gttInvalidFlgを取得します。<br />
     *
     * @return gttInvalidFlg
     */
    @Column(name = "GTT_INVALID_FLG")
    public Boolean getGttInvalidFlg()
    {
        return gttInvalidFlg;
    }

    /**
     * gttInvalidFlgを設定します。<br />
     *
     * @param gttInvalidFlg gttInvalidFlg
     */
    public void setGttInvalidFlg(Boolean gttInvalidFlg)
    {
        this.gttInvalidFlg = gttInvalidFlg;
    }

    /**
     * planSalesAreaFlgを取得します。<br />
     *
     * @return planSalesAreaFlg
     */
    @Column(name = "PLAN_SALES_AREA_FLG")
    public Boolean getPlanSalesAreaFlg()
    {
        return planSalesAreaFlg;
    }

    /**
     * planSalesAreaFlgを設定します。<br />
     *
     * @param planSalesAreaFlg planSalesAreaFlg
     */
    public void setPlanSalesAreaFlg(Boolean planSalesAreaFlg)
    {
        this.planSalesAreaFlg = planSalesAreaFlg;
    }

    /**
     * usePlanCheckTimeを取得します。<br />
     *
     * @return usePlanCheckTime
     */
    @Column(name = "USE_PLAN_CHECK_TIME")
    public Boolean getUsePlanCheckTime()
    {
        return usePlanCheckTime;
    }

    /**
     * usePlanCheckTimeを設定します。<br />
     *
     * @param usePlanCheckTime usePlanCheckTime
     */
    public void setUsePlanCheckTime(Boolean usePlanCheckTime)
    {
        this.usePlanCheckTime = usePlanCheckTime;
    }

    /**
     * displayCheckInを取得します。<br />
     *
     * @return displayCheckIn
     */
    @Column(name = "DISPLAY_CHECK_IN")
    public String getDisplayCheckIn()
    {
        return displayCheckIn;
    }

    /**
     * displayCheckInを設定します。<br />
     *
     * @param displayCheckIn displayCheckIn
     */
    public void setDisplayCheckIn(String displayCheckIn)
    {
        this.displayCheckIn = displayCheckIn;
    }

    /**
     * displayCheckOutを取得します。<br />
     *
     * @return displayCheckOut
     */
    @Column(name = "DISPLAY_CHECK_OUT")
    public String getDisplayCheckOut()
    {
        return displayCheckOut;
    }

    /**
     * displayCheckOutを設定します。<br />
     *
     * @param displayCheckOut displayCheckOut
     */
    public void setDisplayCheckOut(String displayCheckOut)
    {
        this.displayCheckOut = displayCheckOut;
    }

    /**
     * mealFlgを取得します。<br />
     *
     * @return mealFlg
     */
    @Column(name = "MEAL_FLG")
    public Integer getMealFlg()
    {
        return mealFlg;
    }

    /**
     * mealFlgを設定します。<br />
     *
     * @param mealFlg mealFlg
     */
    public void setMealFlg(Integer mealFlg)
    {
        this.mealFlg = mealFlg;
    }

}
