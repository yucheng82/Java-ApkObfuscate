package com.tencent.cc;

import org.objectweb.asm.tree.MethodNode;

/**
 * @author VinceXie vince.xie@qq.com
 * @version 2014-5-29 下午3:32:46
 * State
 */
public class Caller {

	/**
	 * 调用的类
	 */
	public MClassNode classNode;
	
	/**
	 * 调用的方法
	 */
	public MethodNode methodNode;
	
	
	public Caller(MClassNode mClassNode,MethodNode methodNode)
	{
		this.classNode=mClassNode;
		this.methodNode=methodNode;
	}
}
