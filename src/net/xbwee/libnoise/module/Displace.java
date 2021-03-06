/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.xbwee.libnoise.module;

import net.xbwee.libnoise.noise.NoiseQuality;

public class Displace extends Module {
  private transient long swigCPtr;

  public Displace(long cPtr, boolean cMemoryOwn) {
    super(NoiseModuleJNI.Displace_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Displace obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NoiseModuleJNI.delete_Displace(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Displace() {
    this(NoiseModuleJNI.new_Displace(), true);
  }

  public int GetSourceModuleCount() {
    return NoiseModuleJNI.Displace_GetSourceModuleCount(swigCPtr, this);
  }

  public double GetValue(double x, double y, double z) {
    return NoiseModuleJNI.Displace_GetValue(swigCPtr, this, x, y, z);
  }

  public Module GetXDisplaceModule() {
    return new Module(NoiseModuleJNI.Displace_GetXDisplaceModule(swigCPtr, this), false);
  }

  public Module GetYDisplaceModule() {
    return new Module(NoiseModuleJNI.Displace_GetYDisplaceModule(swigCPtr, this), false);
  }

  public Module GetZDisplaceModule() {
    return new Module(NoiseModuleJNI.Displace_GetZDisplaceModule(swigCPtr, this), false);
  }

  public void SetDisplaceModules(Module xDisplaceModule, Module yDisplaceModule, Module zDisplaceModule) {
    NoiseModuleJNI.Displace_SetDisplaceModules(swigCPtr, this, Module.getCPtr(xDisplaceModule), xDisplaceModule, Module.getCPtr(yDisplaceModule), yDisplaceModule, Module.getCPtr(zDisplaceModule), zDisplaceModule);
  }

  public void SetXDisplaceModule(Module xDisplaceModule) {
    NoiseModuleJNI.Displace_SetXDisplaceModule(swigCPtr, this, Module.getCPtr(xDisplaceModule), xDisplaceModule);
  }

  public void SetYDisplaceModule(Module yDisplaceModule) {
    NoiseModuleJNI.Displace_SetYDisplaceModule(swigCPtr, this, Module.getCPtr(yDisplaceModule), yDisplaceModule);
  }

  public void SetZDisplaceModule(Module zDisplaceModule) {
    NoiseModuleJNI.Displace_SetZDisplaceModule(swigCPtr, this, Module.getCPtr(zDisplaceModule), zDisplaceModule);
  }

}
