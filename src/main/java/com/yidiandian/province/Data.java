package com.yidiandian.province;

import com.yidiandian.entity.*;
import com.yidiandian.utils.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/27 18:07
 * @Email: 15290810931@163.com
 */
public class Data {

    public static OmpActivity buildOmpActivityData(){
        OmpActivity ompActivity = new OmpActivity();
        ompActivity.setSHEET(buildSheetList());
        return ompActivity;
    }

    private static List<SheetRecord> buildSheetList(){
        List<SheetRecord> sheetList = new ArrayList<>();
        sheetList.add(sheetRecord());
        return sheetList;
    }

    public static SheetRecord sheetRecord(){
        SheetRecord sheetRecord = new SheetRecord();
        sheetRecord.setHEADER( buildHeader() );
        sheetRecord.setITEM( buildItemList() );
        return sheetRecord;
    }

    public static Header buildHeader(){
        Header header = new Header();
        header.setAreaId(String.valueOf(260000));
        header.setCategoryId(String.valueOf(2));
        header.setChangeMode(String.valueOf(1));

        //String date1 = DateUtils.getDateFormat1();
        header.setCheckDate("20190719155940");

        header.setChecker( String.valueOf(80777326) );
        header.setCustType( "ALL" );
        header.setDmSheetId( "1" );//☆☆☆☆☆☆☆☆☆
        header.setEditDate( "20190719155921");
        header.setEditor( "凤凰小哥哥" );

        //String date2 = DateUtils.getDateFormat2();
        header.setEndDate("20190730");

      //  String date3 = DateUtils.getDateFormat3();

        header.setEndTime( "235959" );
        header.setExecuteTime("235959");
        header.setFdMode( 1 );
        header.setFlag(String.valueOf( 100 ));
        header.setIsEmpty( String.valueOf(0 ));
        header.setMbPriceFlag( String.valueOf(0) );
        header.setNmPriceFlag( String.valueOf( 1 ) );
        header.setNote( "凤凰小哥哥" );
        header.setOperator( String.valueOf( 80777326 ) );
        header.setOrderFlag(String.valueOf( 0 ));
        header.setPhKey( "1639472862095359948" );
        header.setPlanId( "0" );
        header.setPopLevel( "0" );
        header.setPri( "9014" );
        header.setPrintCount( "0" );
        header.setPromNo( "2002184614" );
        header.setRefSheetId( "1907196002203000751" );
        header.setRefSheetType( "6002203" );
        header.setRuleNo( "2002184614" );
        header.setSdFlag( "0001" );
        header.setSheetCancelFlag( "Y" );
        header.setSheetId( "93622019071946636" );
        header.setShopId( "9362" );
        header.setStartDate(  "20190720"  );
        header.setStartTime( "000000" );
        header.setUpdType( "000" );
        header.setWsPriceFlag( "0" );
        return header;
    }

    private static List<ITEM> buildItemList(){
        List<ITEM> items = new ArrayList<>(  );
        ITEM item1 = new ITEM();
        item1.setAlloCateRate( BigDecimal.valueOf( 1 ) );
        item1.setCancelFlag( "N" );
        item1.setCatCode( "13490205" );
        item1.setCostTaxRate( "0" );
        item1.setDisAmt( BigDecimal.valueOf( 10 ) );
        item1.setDisRate( BigDecimal.valueOf( 0.8876 ) );
        item1.setDmFlag( "1" );
        item1.setGoodsId( "1007139" );
        item1.setIsPromFlag( 2 );
        item1.setLimitFlag( 0 );
        item1.setLimitQty( 0 );
        item1.setNewCost( BigDecimal.valueOf( 67 ) );
        item1.setNewMPrice1( BigDecimal.valueOf( 0 ) );
        item1.setNewMPrice2( BigDecimal.valueOf( 0 ) );
        item1.setNewMPrice3( BigDecimal.valueOf( 0 ) );
        item1.setNewPrice( BigDecimal.valueOf( 79 ) );
        item1.setNewWPrice( BigDecimal.valueOf( 0 ) );
        item1.setOldCost( BigDecimal.valueOf( 71.2 ) );
        item1.setOldMPrice1( BigDecimal.valueOf( 0 ) );
        item1.setOldMPrice2( BigDecimal.valueOf( 0 ) );
        item1.setOldMPrice3( BigDecimal.valueOf( 0 ) );
        item1.setOldPrice( BigDecimal.valueOf( 89 ) );
        item1.setOldWPrice( BigDecimal.valueOf( 0 ) );
        item1.setPhKey( "1639472871533560395" );
        item1.setPopJoinModel( "Y" );
        item1.setPopSetModel( "1" );
        item1.setPpCode( "825" );
        item1.setPrcMode("1");
        item1.setPromFund( BigDecimal.valueOf( 0 ) );
        item1.setSaleTaxRate( "0" );
        item1.setSeqId( 1287365257 );
        item1.setSheetId( "93622019071946636" );
        item1.setSupId( "" );
        item1.setVenDerId( "" );

        ITEM item2 = new ITEM();
        item2.setAlloCateRate( BigDecimal.valueOf( 1 ) );
        item2.setCancelFlag( "N" );
        item2.setCatCode( "13490404" );
        item2.setCostTaxRate( "0" );
        item2.setDisAmt( BigDecimal.valueOf( 120 ) );
        item2.setDisRate( BigDecimal.valueOf( 0.6992 ) );
        item2.setDmFlag( "1" );
        item2.setGoodsId( "820852" );
        item2.setIsPromFlag( 2 );
        item2.setLimitFlag( 0 );
        item2.setLimitQty( 0 );
        item2.setNewCost( BigDecimal.valueOf( 233.1 ) );
        item2.setNewMPrice1( BigDecimal.valueOf( 0 ) );
        item2.setNewMPrice2( BigDecimal.valueOf( 0 ) );
        item2.setNewMPrice3( BigDecimal.valueOf( 0 ) );
        item2.setNewPrice( BigDecimal.valueOf( 279 ) );
        item2.setNewWPrice( BigDecimal.valueOf( 0 ) );
        item2.setOldCost( BigDecimal.valueOf( 279.3 ) );
        item2.setOldMPrice1( BigDecimal.valueOf( 0 ) );
        item2.setOldMPrice2( BigDecimal.valueOf( 0 ) );
        item2.setOldMPrice3( BigDecimal.valueOf( 0 ) );
        item2.setOldPrice( BigDecimal.valueOf( 399 ) );
        item2.setOldWPrice( BigDecimal.valueOf( 0 ) );
        item2.setPhKey( "1639472871533561072" );
        item2.setPopJoinModel( "Y" );
        item2.setPopSetModel( "1" );
        item2.setPpCode( "82501" );
        item2.setPrcMode("1");
        item2.setPromFund( BigDecimal.valueOf( 0 ) );
        item2.setSaleTaxRate( "0" );
        item2.setSeqId( 1287365257 );
        item2.setSheetId( "93622019071946636" );
        item2.setSupId( "" );
        item2.setVenDerId( "" );

        ITEM item3 = new ITEM();
        item3.setAlloCateRate( BigDecimal.valueOf( 1 ) );
        item3.setCancelFlag( "N" );
        item3.setCatCode( "13490107" );
        item3.setCostTaxRate( "0" );
        item3.setDisAmt( BigDecimal.valueOf( 20 ) );
        item3.setDisRate( BigDecimal.valueOf( 0.9472 ) );
        item3.setDmFlag( "1" );
        item3.setGoodsId( "1041992" );
        item3.setIsPromFlag( 2 );
        item3.setLimitFlag( 0 );
        item3.setLimitQty( 0 );
        item3.setNewCost( BigDecimal.valueOf( 293 ) );
        item3.setNewMPrice1( BigDecimal.valueOf( 0 ) );
        item3.setNewMPrice2( BigDecimal.valueOf( 0 ) );
        item3.setNewMPrice3( BigDecimal.valueOf( 0 ) );
        item3.setNewPrice( BigDecimal.valueOf( 359 ) );
        item3.setNewWPrice( BigDecimal.valueOf( 0 ) );
        item3.setOldCost( BigDecimal.valueOf( 303 ) );
        item3.setOldMPrice1( BigDecimal.valueOf( 0 ) );
        item3.setOldMPrice2( BigDecimal.valueOf( 0 ) );
        item3.setOldMPrice3( BigDecimal.valueOf( 0 ) );
        item3.setOldPrice( BigDecimal.valueOf( 379 ) );
        item3.setOldWPrice( BigDecimal.valueOf( 0 ) );
        item3.setPhKey( "1639472871533562535" );
        item3.setPopJoinModel( "Y" );
        item3.setPopSetModel( "1" );
        item3.setPpCode( "82501" );
        item3.setPrcMode("1");
        item3.setPromFund( BigDecimal.valueOf( 0 ) );
        item3.setSaleTaxRate( "0" );
        item3.setSeqId( 1287365259 );
        item3.setSheetId( "93622019071946636" );
        item3.setSupId( "" );
        item3.setVenDerId( "" );

        items.add(item1);
        items.add(item2);
        items.add( item3 );

        return items;
    }


/*    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("HHmmss");
        System.out.println("得到的时间："+df.format( new Date() ));
    }*/






}
