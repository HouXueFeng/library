package cn.xapi.hou.po;

import java.util.ArrayList;
import java.util.List;

public class BookinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookinfoExample() {
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

        public Criteria andCallnoIsNull() {
            addCriterion("callNO is null");
            return (Criteria) this;
        }

        public Criteria andCallnoIsNotNull() {
            addCriterion("callNO is not null");
            return (Criteria) this;
        }

        public Criteria andCallnoEqualTo(Integer value) {
            addCriterion("callNO =", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoNotEqualTo(Integer value) {
            addCriterion("callNO <>", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoGreaterThan(Integer value) {
            addCriterion("callNO >", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("callNO >=", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoLessThan(Integer value) {
            addCriterion("callNO <", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoLessThanOrEqualTo(Integer value) {
            addCriterion("callNO <=", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoIn(List<Integer> values) {
            addCriterion("callNO in", values, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoNotIn(List<Integer> values) {
            addCriterion("callNO not in", values, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoBetween(Integer value1, Integer value2) {
            addCriterion("callNO between", value1, value2, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoNotBetween(Integer value1, Integer value2) {
            addCriterion("callNO not between", value1, value2, "callno");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNull() {
            addCriterion("bookName is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("bookName is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("bookName =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("bookName <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("bookName >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("bookName >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("bookName <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("bookName <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("bookName like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("bookName not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("bookName in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("bookName not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("bookName between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("bookName not between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBookautherIsNull() {
            addCriterion("bookAuther is null");
            return (Criteria) this;
        }

        public Criteria andBookautherIsNotNull() {
            addCriterion("bookAuther is not null");
            return (Criteria) this;
        }

        public Criteria andBookautherEqualTo(String value) {
            addCriterion("bookAuther =", value, "bookauther");
            return (Criteria) this;
        }

        public Criteria andBookautherNotEqualTo(String value) {
            addCriterion("bookAuther <>", value, "bookauther");
            return (Criteria) this;
        }

        public Criteria andBookautherGreaterThan(String value) {
            addCriterion("bookAuther >", value, "bookauther");
            return (Criteria) this;
        }

        public Criteria andBookautherGreaterThanOrEqualTo(String value) {
            addCriterion("bookAuther >=", value, "bookauther");
            return (Criteria) this;
        }

        public Criteria andBookautherLessThan(String value) {
            addCriterion("bookAuther <", value, "bookauther");
            return (Criteria) this;
        }

        public Criteria andBookautherLessThanOrEqualTo(String value) {
            addCriterion("bookAuther <=", value, "bookauther");
            return (Criteria) this;
        }

        public Criteria andBookautherLike(String value) {
            addCriterion("bookAuther like", value, "bookauther");
            return (Criteria) this;
        }

        public Criteria andBookautherNotLike(String value) {
            addCriterion("bookAuther not like", value, "bookauther");
            return (Criteria) this;
        }

        public Criteria andBookautherIn(List<String> values) {
            addCriterion("bookAuther in", values, "bookauther");
            return (Criteria) this;
        }

        public Criteria andBookautherNotIn(List<String> values) {
            addCriterion("bookAuther not in", values, "bookauther");
            return (Criteria) this;
        }

        public Criteria andBookautherBetween(String value1, String value2) {
            addCriterion("bookAuther between", value1, value2, "bookauther");
            return (Criteria) this;
        }

        public Criteria andBookautherNotBetween(String value1, String value2) {
            addCriterion("bookAuther not between", value1, value2, "bookauther");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andBookpriceIsNull() {
            addCriterion("bookPrice is null");
            return (Criteria) this;
        }

        public Criteria andBookpriceIsNotNull() {
            addCriterion("bookPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBookpriceEqualTo(Double value) {
            addCriterion("bookPrice =", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotEqualTo(Double value) {
            addCriterion("bookPrice <>", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThan(Double value) {
            addCriterion("bookPrice >", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("bookPrice >=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThan(Double value) {
            addCriterion("bookPrice <", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThanOrEqualTo(Double value) {
            addCriterion("bookPrice <=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceIn(List<Double> values) {
            addCriterion("bookPrice in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotIn(List<Double> values) {
            addCriterion("bookPrice not in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceBetween(Double value1, Double value2) {
            addCriterion("bookPrice between", value1, value2, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotBetween(Double value1, Double value2) {
            addCriterion("bookPrice not between", value1, value2, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookobjectIsNull() {
            addCriterion("bookObject is null");
            return (Criteria) this;
        }

        public Criteria andBookobjectIsNotNull() {
            addCriterion("bookObject is not null");
            return (Criteria) this;
        }

        public Criteria andBookobjectEqualTo(String value) {
            addCriterion("bookObject =", value, "bookobject");
            return (Criteria) this;
        }

        public Criteria andBookobjectNotEqualTo(String value) {
            addCriterion("bookObject <>", value, "bookobject");
            return (Criteria) this;
        }

        public Criteria andBookobjectGreaterThan(String value) {
            addCriterion("bookObject >", value, "bookobject");
            return (Criteria) this;
        }

        public Criteria andBookobjectGreaterThanOrEqualTo(String value) {
            addCriterion("bookObject >=", value, "bookobject");
            return (Criteria) this;
        }

        public Criteria andBookobjectLessThan(String value) {
            addCriterion("bookObject <", value, "bookobject");
            return (Criteria) this;
        }

        public Criteria andBookobjectLessThanOrEqualTo(String value) {
            addCriterion("bookObject <=", value, "bookobject");
            return (Criteria) this;
        }

        public Criteria andBookobjectLike(String value) {
            addCriterion("bookObject like", value, "bookobject");
            return (Criteria) this;
        }

        public Criteria andBookobjectNotLike(String value) {
            addCriterion("bookObject not like", value, "bookobject");
            return (Criteria) this;
        }

        public Criteria andBookobjectIn(List<String> values) {
            addCriterion("bookObject in", values, "bookobject");
            return (Criteria) this;
        }

        public Criteria andBookobjectNotIn(List<String> values) {
            addCriterion("bookObject not in", values, "bookobject");
            return (Criteria) this;
        }

        public Criteria andBookobjectBetween(String value1, String value2) {
            addCriterion("bookObject between", value1, value2, "bookobject");
            return (Criteria) this;
        }

        public Criteria andBookobjectNotBetween(String value1, String value2) {
            addCriterion("bookObject not between", value1, value2, "bookobject");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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