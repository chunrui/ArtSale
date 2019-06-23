package com.lnsf.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class ResourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourcesExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRnameIsNull() {
            addCriterion("rname is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("rname is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("rname =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("rname <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("rname >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("rname >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("rname <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("rname <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("rname like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("rname not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("rname in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("rname not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("rname between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("rname not between", value1, value2, "rname");
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

        public Criteria andShowtimeIsNull() {
            addCriterion("showtime is null");
            return (Criteria) this;
        }

        public Criteria andShowtimeIsNotNull() {
            addCriterion("showtime is not null");
            return (Criteria) this;
        }

        public Criteria andShowtimeEqualTo(Date value) {
            addCriterion("showtime =", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeNotEqualTo(Date value) {
            addCriterion("showtime <>", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeGreaterThan(Date value) {
            addCriterion("showtime >", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("showtime >=", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeLessThan(Date value) {
            addCriterion("showtime <", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeLessThanOrEqualTo(Date value) {
            addCriterion("showtime <=", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeIn(List<Date> values) {
            addCriterion("showtime in", values, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeNotIn(List<Date> values) {
            addCriterion("showtime not in", values, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeBetween(Date value1, Date value2) {
            addCriterion("showtime between", value1, value2, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeNotBetween(Date value1, Date value2) {
            addCriterion("showtime not between", value1, value2, "showtime");
            return (Criteria) this;
        }

        public Criteria andRphotoIsNull() {
            addCriterion("rphoto is null");
            return (Criteria) this;
        }

        public Criteria andRphotoIsNotNull() {
            addCriterion("rphoto is not null");
            return (Criteria) this;
        }

        public Criteria andRphotoEqualTo(Integer value) {
            addCriterion("rphoto =", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoNotEqualTo(Integer value) {
            addCriterion("rphoto <>", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoGreaterThan(Integer value) {
            addCriterion("rphoto >", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("rphoto >=", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoLessThan(Integer value) {
            addCriterion("rphoto <", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoLessThanOrEqualTo(Integer value) {
            addCriterion("rphoto <=", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoIn(List<Integer> values) {
            addCriterion("rphoto in", values, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoNotIn(List<Integer> values) {
            addCriterion("rphoto not in", values, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoBetween(Integer value1, Integer value2) {
            addCriterion("rphoto between", value1, value2, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoNotBetween(Integer value1, Integer value2) {
            addCriterion("rphoto not between", value1, value2, "rphoto");
            return (Criteria) this;
        }

        public Criteria andPointpraiseIsNull() {
            addCriterion("pointpraise is null");
            return (Criteria) this;
        }

        public Criteria andPointpraiseIsNotNull() {
            addCriterion("pointpraise is not null");
            return (Criteria) this;
        }

        public Criteria andPointpraiseEqualTo(Integer value) {
            addCriterion("pointpraise =", value, "pointpraise");
            return (Criteria) this;
        }

        public Criteria andPointpraiseNotEqualTo(Integer value) {
            addCriterion("pointpraise <>", value, "pointpraise");
            return (Criteria) this;
        }

        public Criteria andPointpraiseGreaterThan(Integer value) {
            addCriterion("pointpraise >", value, "pointpraise");
            return (Criteria) this;
        }

        public Criteria andPointpraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("pointpraise >=", value, "pointpraise");
            return (Criteria) this;
        }

        public Criteria andPointpraiseLessThan(Integer value) {
            addCriterion("pointpraise <", value, "pointpraise");
            return (Criteria) this;
        }

        public Criteria andPointpraiseLessThanOrEqualTo(Integer value) {
            addCriterion("pointpraise <=", value, "pointpraise");
            return (Criteria) this;
        }

        public Criteria andPointpraiseIn(List<Integer> values) {
            addCriterion("pointpraise in", values, "pointpraise");
            return (Criteria) this;
        }

        public Criteria andPointpraiseNotIn(List<Integer> values) {
            addCriterion("pointpraise not in", values, "pointpraise");
            return (Criteria) this;
        }

        public Criteria andPointpraiseBetween(Integer value1, Integer value2) {
            addCriterion("pointpraise between", value1, value2, "pointpraise");
            return (Criteria) this;
        }

        public Criteria andPointpraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("pointpraise not between", value1, value2, "pointpraise");
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