cmake_minimum_required(VERSION 3.0)

project( noiseutils VERSION 1.0.0 )


include_directories( ${LIBNOISE_ROOT_DIR}/include/ )

set( SOURCE_FILES noiseutils.cpp )

add_library( noiseutils STATIC ${SOURCE_FILES} )


# install(TARGETS 
#         noiseutils
#         DESTINATION 
#         ${CMAKE_INSTALL_PREFIX}/lib)
# install(FILES 
#         ${PROJECT_SOURCE_DIR}/noiseutils.h 
#         DESTINATION 
#         ${CMAKE_INSTALL_PREFIX}/include/noiseutils)


