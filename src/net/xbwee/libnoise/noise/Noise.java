/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.xbwee.libnoise.noise;

public class Noise {
  public static void LatLonToXYZ(double lat, double lon, double[] x, double[] y, double[] z) {
    NoiseJNI.LatLonToXYZ(lat, lon, x, y, z);
  }

  public static double GradientCoherentNoise3D(double x, double y, double z, int seed, NoiseQuality noiseQuality) {
    return NoiseJNI.GradientCoherentNoise3D__SWIG_0(x, y, z, seed, noiseQuality.swigValue());
  }

  public static double GradientCoherentNoise3D(double x, double y, double z, int seed) {
    return NoiseJNI.GradientCoherentNoise3D__SWIG_1(x, y, z, seed);
  }

  public static double GradientCoherentNoise3D(double x, double y, double z) {
    return NoiseJNI.GradientCoherentNoise3D__SWIG_2(x, y, z);
  }

  public static double GradientNoise3D(double fx, double fy, double fz, int ix, int iy, int iz, int seed) {
    return NoiseJNI.GradientNoise3D__SWIG_0(fx, fy, fz, ix, iy, iz, seed);
  }

  public static double GradientNoise3D(double fx, double fy, double fz, int ix, int iy, int iz) {
    return NoiseJNI.GradientNoise3D__SWIG_1(fx, fy, fz, ix, iy, iz);
  }

  public static int IntValueNoise3D(int x, int y, int z, int seed) {
    return NoiseJNI.IntValueNoise3D__SWIG_0(x, y, z, seed);
  }

  public static int IntValueNoise3D(int x, int y, int z) {
    return NoiseJNI.IntValueNoise3D__SWIG_1(x, y, z);
  }

  public static double MakeInt32Range(double n) {
    return NoiseJNI.MakeInt32Range(n);
  }

  public static double ValueCoherentNoise3D(double x, double y, double z, int seed, NoiseQuality noiseQuality) {
    return NoiseJNI.ValueCoherentNoise3D__SWIG_0(x, y, z, seed, noiseQuality.swigValue());
  }

  public static double ValueCoherentNoise3D(double x, double y, double z, int seed) {
    return NoiseJNI.ValueCoherentNoise3D__SWIG_1(x, y, z, seed);
  }

  public static double ValueCoherentNoise3D(double x, double y, double z) {
    return NoiseJNI.ValueCoherentNoise3D__SWIG_2(x, y, z);
  }

  public static double ValueNoise3D(int x, int y, int z, int seed) {
    return NoiseJNI.ValueNoise3D__SWIG_0(x, y, z, seed);
  }

  public static double ValueNoise3D(int x, int y, int z) {
    return NoiseJNI.ValueNoise3D__SWIG_1(x, y, z);
  }

}
