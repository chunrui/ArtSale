package com.lnsf.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class AuctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuctionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andStartpriceIsNull() {
            addCriterion("startprice is null");
            return (Criteria) this;
        }

        public Criteria andStartpriceIsNotNull() {
            addCriterion("startprice is not null");
            return (Criteria) this;
        }

        public Criteria andStartpriceEqualTo(Double value) {
            addCriterion("startprice =", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceNotEqualTo(Double value) {
            addCriterion("startprice <>", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceGreaterThan(Double value) {
            addCriterion("startprice >", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("startprice >=", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceLessThan(Double value) {
            addCriterion("startprice <", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceLessThanOrEqualTo(Double value) {
            addCriterion("startprice <=", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceIn(List<Double> values) {
            addCriterion("startprice in", values, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceNotIn(List<Double> values) {
            addCriterion("startprice not in", values, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceBetween(Double value1, Double value2) {
            addCriterion("startprice between", value1, value2, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceNotBetween(Double value1, Double value2) {
            addCriterion("startprice not between", value1, value2, "startprice");
            return (Criteria) this;
        }

        public Criteria andFinalpriceIsNull() {
            addCriterion("Finalprice is null");
            return (Criteria) this;
        }

        public Criteria andFinalpriceIsNotNull() {
            addCriterion("Finalprice is not null");
            return (Criteria) this;
        }

        public Criteria andFinalpriceEqualTo(Double value) {
            addCriterion("Finalprice =", value, "finalprice");
            return (Criteria) this;
        }

        public Criteria andFinalpriceNotEqualTo(Double value) {
            addCriterion("Finalprice <>", value, "finalprice");
            return (Criteria) this;
        }

        public Criteria andFinalpriceGreaterThan(Double value) {
            addCriterion("Finalprice >", value, "finalprice");
            return (Criteria) this;
        }

        public Criteria andFinalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Finalprice >=", value, "finalprice");
            return (Criteria) this;
        }

        public Criteria andFinalpriceLessThan(Double value) {
            addCriterion("Finalprice <", value, "finalprice");
            return (Criteria) this;
        }

        public Criteria andFinalpriceLessThanOrEqualTo(Double value) {
            addCriterion("Finalprice <=", value, "finalprice");
            return (Criteria) this;
        }

        public Criteria andFinalpriceIn(List<Double> values) {
            addCriterion("Finalprice in", values, "finalprice");
            return (Criteria) this;
        }

        public Criteria andFinalpriceNotIn(List<Double> values) {
            addCriterion("Finalprice not in", values, "finalprice");
            return (Criteria) this;
        }

        public Criteria andFinalpriceBetween(Double value1, Double value2) {
            addCriterion("Finalprice between", value1, value2, "finalprice");
            return (Criteria) this;
        }

        public Criteria andFinalpriceNotBetween(Double value1, Double value2) {
            addCriterion("Finalprice not between", value1, value2, "finalprice");
            return (Criteria) this;
        }

        public Criteria andGetuidIsNull() {
            addCriterion("getuid is null");
            return (Criteria) this;
        }

        public Criteria andGetuidIsNotNull() {
            addCriterion("getuid is not null");
            return (Criteria) this;
        }

        public Criteria andGetuidEqualTo(Integer value) {
            addCriterion("getuid =", value, "getuid");
            return (Criteria) this;
        }

        public Criteria andGetuidNotEqualTo(Integer value) {
            addCriterion("getuid <>", value, "getuid");
            return (Criteria) this;
        }

        public Criteria andGetuidGreaterThan(Integer value) {
            addCriterion("getuid >", value, "getuid");
            return (Criteria) this;
        }

        public Criteria andGetuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("getuid >=", value, "getuid");
            return (Criteria) this;
        }

        public Criteria andGetuidLessThan(Integer value) {
            addCriterion("getuid <", value, "getuid");
            return (Criteria) this;
        }

        public Criteria andGetuidLessThanOrEqualTo(Integer value) {
            addCriterion("getuid <=", value, "getuid");
            return (Criteria) this;
        }

        public Criteria andGetuidIn(List<Integer> values) {
            addCriterion("getuid in", values, "getuid");
            return (Criteria) this;
        }

        public Criteria andGetuidNotIn(List<Integer> values) {
            addCriterion("getuid not in", values, "getuid");
            return (Criteria) this;
        }

        public Criteria andGetuidBetween(Integer value1, Integer value2) {
            addCriterion("getuid between", value1, value2, "getuid");
            return (Criteria) this;
        }

        public Criteria andGetuidNotBetween(Integer value1, Integer value2) {
            addCriterion("getuid not between", value1, value2, "getuid");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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