package com.calculator.service;

public class CalculatorServiceImplProxy implements com.calculator.service.CalculatorServiceImpl {
  private String _endpoint = null;
  private com.calculator.service.CalculatorServiceImpl calculatorServiceImpl = null;
  
  public CalculatorServiceImplProxy() {
    _initCalculatorServiceImplProxy();
  }
  
  public CalculatorServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorServiceImplProxy();
  }
  
  private void _initCalculatorServiceImplProxy() {
    try {
      calculatorServiceImpl = (new com.calculator.service.CalculatorServiceImplServiceLocator()).getCalculatorServiceImpl();
      if (calculatorServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculatorServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculatorServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculatorServiceImpl != null)
      ((javax.xml.rpc.Stub)calculatorServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.calculator.service.CalculatorServiceImpl getCalculatorServiceImpl() {
    if (calculatorServiceImpl == null)
      _initCalculatorServiceImplProxy();
    return calculatorServiceImpl;
  }
  
  public int addValue(int a, int b) throws java.rmi.RemoteException{
    if (calculatorServiceImpl == null)
      _initCalculatorServiceImplProxy();
    return calculatorServiceImpl.addValue(a, b);
  }
  
  public int subtractValue(int a, int b) throws java.rmi.RemoteException{
    if (calculatorServiceImpl == null)
      _initCalculatorServiceImplProxy();
    return calculatorServiceImpl.subtractValue(a, b);
  }
  
  public int multiplyValue(int a, int b) throws java.rmi.RemoteException{
    if (calculatorServiceImpl == null)
      _initCalculatorServiceImplProxy();
    return calculatorServiceImpl.multiplyValue(a, b);
  }
  
  
}