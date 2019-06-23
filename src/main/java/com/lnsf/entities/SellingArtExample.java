package com.lnsf.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class SellingArtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellingArtExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAidIsNull() {
            addCriterion("Aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("Aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("Aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("Aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("Aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("Aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("Aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("Aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("Aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("Aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("Aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("describe not between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andSphotoIsNull() {
            addCriterion("sphoto is null");
            return (Criteria) this;
        }

        public Criteria andSphotoIsNotNull() {
            addCriterion("sphoto is not null");
            return (Criteria) this;
        }

        public Criteria andSphotoEqualTo(Integer value) {
            addCriterion("sphoto =", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoNotEqualTo(Integer value) {
            addCriterion("sphoto <>", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoGreaterThan(Integer value) {
            addCriterion("sphoto >", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sphoto >=", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoLessThan(Integer value) {
            addCriterion("sphoto <", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoLessThanOrEqualTo(Integer value) {
            addCriterion("sphoto <=", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoIn(List<Integer> values) {
            addCriterion("sphoto in", values, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoNotIn(List<Integer> values) {
            addCriterion("sphoto not in", values, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoBetween(Integer value1, Integer value2) {
            addCriterion("sphoto between", value1, value2, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoNotBetween(Integer value1, Integer value2) {
            addCriterion("sphoto not between", value1, value2, "sphoto");
            return (Criteria) this;
        }

        public Criteria andInpriceIsNull() {
            addCriterion("inprice is null");
            return (Criteria) this;
        }

        public Criteria andInpriceIsNotNull() {
            addCriterion("inprice is not null");
            return (Criteria) this;
        }

        public Criteria andInpriceEqualTo(Double value) {
            addCriterion("inprice =", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotEqualTo(Double value) {
            addCriterion("inprice <>", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceGreaterThan(Double value) {
            addCriterion("inprice >", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("inprice >=", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceLessThan(Double value) {
            addCriterion("inprice <", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceLessThanOrEqualTo(Double value) {
            addCriterion("inprice <=", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceIn(List<Double> values) {
            addCriterion("inprice in", values, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotIn(List<Double> values) {
            addCriterion("inprice not in", values, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceBetween(Double value1, Double value2) {
            addCriterion("inprice between", value1, value2, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotBetween(Double value1, Double value2) {
            addCriterion("inprice not between", value1, value2, "inprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceIsNull() {
            addCriterion("sellprice is null");
            return (Criteria) this;
        }

        public Criteria andSellpriceIsNotNull() {
            addCriterion("sellprice is not null");
            return (Criteria) this;
        }

        public Criteria andSellpriceEqualTo(Double value) {
            addCriterion("sellprice =", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceNotEqualTo(Double value) {
            addCriterion("sellprice <>", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceGreaterThan(Double value) {
            addCriterion("sellprice >", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sellprice >=", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceLessThan(Double value) {
            addCriterion("sellprice <", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceLessThanOrEqualTo(Double value) {
            addCriterion("sellprice <=", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceIn(List<Double> values) {
            addCriterion("sellprice in", values, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceNotIn(List<Double> values) {
            addCriterion("sellprice not in", values, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceBetween(Double value1, Double value2) {
            addCriterion("sellprice between", value1, value2, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceNotBetween(Double value1, Double value2) {
            addCriterion("sellprice not between", value1, value2, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIsNull() {
            addCriterion("salesvolume is null");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIsNotNull() {
            addCriterion("salesvolume is not null");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeEqualTo(Integer value) {
            addCriterion("salesvolume =", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotEqualTo(Integer value) {
            addCriterion("salesvolume <>", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeGreaterThan(Integer value) {
            addCriterion("salesvolume >", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesvolume >=", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeLessThan(Integer value) {
            addCriterion("salesvolume <", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("salesvolume <=", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIn(List<Integer> values) {
            addCriterion("salesvolume in", values, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotIn(List<Integer> values) {
            addCriterion("salesvolume not in", values, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeBetween(Integer value1, Integer value2) {
            addCriterion("salesvolume between", value1, value2, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("salesvolume not between", value1, value2, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}