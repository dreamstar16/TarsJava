// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.quickstart.server.testapp;

import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.annotation.*;
import com.qq.tars.common.support.Holder;

@Servant
public interface HelloServant {

	 String hello(@TarsMethodParameter(name="no")int no, @TarsMethodParameter(name="name")String name);

	 int helloJson(@TarsMethodParameter(name="tie")TestInfo tie, @TarsHolder(name="otie") Holder<TestInfoEx> otie);
}
