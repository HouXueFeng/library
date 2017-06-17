package cn.xapi.hou.po;

import java.util.ArrayList;
import java.util.List;

public class ReaderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReaderinfoExample() {
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

        public Criteria andReadernoIsNull() {
            addCriterion("readerNO is null");
            return (Criteria) this;
        }

        public Criteria andReadernoIsNotNull() {
            addCriterion("readerNO is not null");
            return (Criteria) this;
        }

        public Criteria andReadernoEqualTo(Integer value) {
            addCriterion("readerNO =", value, "readerno");
            return (Criteria) this;
        }

        public Criteria andReadernoNotEqualTo(Integer value) {
            addCriterion("readerNO <>", value, "readerno");
            return (Criteria) this;
        }

        public Criteria andReadernoGreaterThan(Integer value) {
            addCriterion("readerNO >", value, "readerno");
            return (Criteria) this;
        }

        public Criteria andReadernoGreaterThanOrEqualTo(Integer value) {
            addCriterion("readerNO >=", value, "readerno");
            return (Criteria) this;
        }

        public Criteria andReadernoLessThan(Integer value) {
            addCriterion("readerNO <", value, "readerno");
            return (Criteria) this;
        }

        public Criteria andReadernoLessThanOrEqualTo(Integer value) {
            addCriterion("readerNO <=", value, "readerno");
            return (Criteria) this;
        }

        public Criteria andReadernoIn(List<Integer> values) {
            addCriterion("readerNO in", values, "readerno");
            return (Criteria) this;
        }

        public Criteria andReadernoNotIn(List<Integer> values) {
            addCriterion("readerNO not in", values, "readerno");
            return (Criteria) this;
        }

        public Criteria andReadernoBetween(Integer value1, Integer value2) {
            addCriterion("readerNO between", value1, value2, "readerno");
            return (Criteria) this;
        }

        public Criteria andReadernoNotBetween(Integer value1, Integer value2) {
            addCriterion("readerNO not between", value1, value2, "readerno");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordIsNull() {
            addCriterion("readerPassword is null");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordIsNotNull() {
            addCriterion("readerPassword is not null");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordEqualTo(String value) {
            addCriterion("readerPassword =", value, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordNotEqualTo(String value) {
            addCriterion("readerPassword <>", value, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordGreaterThan(String value) {
            addCriterion("readerPassword >", value, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("readerPassword >=", value, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordLessThan(String value) {
            addCriterion("readerPassword <", value, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordLessThanOrEqualTo(String value) {
            addCriterion("readerPassword <=", value, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordLike(String value) {
            addCriterion("readerPassword like", value, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordNotLike(String value) {
            addCriterion("readerPassword not like", value, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordIn(List<String> values) {
            addCriterion("readerPassword in", values, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordNotIn(List<String> values) {
            addCriterion("readerPassword not in", values, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordBetween(String value1, String value2) {
            addCriterion("readerPassword between", value1, value2, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andReaderpasswordNotBetween(String value1, String value2) {
            addCriterion("readerPassword not between", value1, value2, "readerpassword");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andReadernameIsNull() {
            addCriterion("readerName is null");
            return (Criteria) this;
        }

        public Criteria andReadernameIsNotNull() {
            addCriterion("readerName is not null");
            return (Criteria) this;
        }

        public Criteria andReadernameEqualTo(String value) {
            addCriterion("readerName =", value, "readername");
            return (Criteria) this;
        }

        public Criteria andReadernameNotEqualTo(String value) {
            addCriterion("readerName <>", value, "readername");
            return (Criteria) this;
        }

        public Criteria andReadernameGreaterThan(String value) {
            addCriterion("readerName >", value, "readername");
            return (Criteria) this;
        }

        public Criteria andReadernameGreaterThanOrEqualTo(String value) {
            addCriterion("readerName >=", value, "readername");
            return (Criteria) this;
        }

        public Criteria andReadernameLessThan(String value) {
            addCriterion("readerName <", value, "readername");
            return (Criteria) this;
        }

        public Criteria andReadernameLessThanOrEqualTo(String value) {
            addCriterion("readerName <=", value, "readername");
            return (Criteria) this;
        }

        public Criteria andReadernameLike(String value) {
            addCriterion("readerName like", value, "readername");
            return (Criteria) this;
        }

        public Criteria andReadernameNotLike(String value) {
            addCriterion("readerName not like", value, "readername");
            return (Criteria) this;
        }

        public Criteria andReadernameIn(List<String> values) {
            addCriterion("readerName in", values, "readername");
            return (Criteria) this;
        }

        public Criteria andReadernameNotIn(List<String> values) {
            addCriterion("readerName not in", values, "readername");
            return (Criteria) this;
        }

        public Criteria andReadernameBetween(String value1, String value2) {
            addCriterion("readerName between", value1, value2, "readername");
            return (Criteria) this;
        }

        public Criteria andReadernameNotBetween(String value1, String value2) {
            addCriterion("readerName not between", value1, value2, "readername");
            return (Criteria) this;
        }

        public Criteria andReadermajorIsNull() {
            addCriterion("readerMajor is null");
            return (Criteria) this;
        }

        public Criteria andReadermajorIsNotNull() {
            addCriterion("readerMajor is not null");
            return (Criteria) this;
        }

        public Criteria andReadermajorEqualTo(String value) {
            addCriterion("readerMajor =", value, "readermajor");
            return (Criteria) this;
        }

        public Criteria andReadermajorNotEqualTo(String value) {
            addCriterion("readerMajor <>", value, "readermajor");
            return (Criteria) this;
        }

        public Criteria andReadermajorGreaterThan(String value) {
            addCriterion("readerMajor >", value, "readermajor");
            return (Criteria) this;
        }

        public Criteria andReadermajorGreaterThanOrEqualTo(String value) {
            addCriterion("readerMajor >=", value, "readermajor");
            return (Criteria) this;
        }

        public Criteria andReadermajorLessThan(String value) {
            addCriterion("readerMajor <", value, "readermajor");
            return (Criteria) this;
        }

        public Criteria andReadermajorLessThanOrEqualTo(String value) {
            addCriterion("readerMajor <=", value, "readermajor");
            return (Criteria) this;
        }

        public Criteria andReadermajorLike(String value) {
            addCriterion("readerMajor like", value, "readermajor");
            return (Criteria) this;
        }

        public Criteria andReadermajorNotLike(String value) {
            addCriterion("readerMajor not like", value, "readermajor");
            return (Criteria) this;
        }

        public Criteria andReadermajorIn(List<String> values) {
            addCriterion("readerMajor in", values, "readermajor");
            return (Criteria) this;
        }

        public Criteria andReadermajorNotIn(List<String> values) {
            addCriterion("readerMajor not in", values, "readermajor");
            return (Criteria) this;
        }

        public Criteria andReadermajorBetween(String value1, String value2) {
            addCriterion("readerMajor between", value1, value2, "readermajor");
            return (Criteria) this;
        }

        public Criteria andReadermajorNotBetween(String value1, String value2) {
            addCriterion("readerMajor not between", value1, value2, "readermajor");
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