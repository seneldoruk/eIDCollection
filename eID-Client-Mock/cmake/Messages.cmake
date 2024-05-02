message(STATUS "CMAKE_INSTALL_PREFIX: ${CMAKE_INSTALL_PREFIX}")
message(STATUS "CMAKE_BUILD_TYPE: ${CMAKE_BUILD_TYPE}")
message(STATUS "CMAKE_PREFIX_PATH: ${CMAKE_PREFIX_PATH}")
message(STATUS "CMAKE_INCLUDE_PATH: ${CMAKE_INCLUDE_PATH}")
message(STATUS "CMAKE_LIBRARY_PATH: ${CMAKE_LIBRARY_PATH}")
message(STATUS "CMAKE_SYSTEM_PREFIX_PATH: ${CMAKE_SYSTEM_PREFIX_PATH}")
message(STATUS "CMAKE_SYSTEM_INCLUDE_PATH: ${CMAKE_SYSTEM_INCLUDE_PATH}")
message(STATUS "CMAKE_VERSION: ${CMAKE_VERSION}")
if(APPLE)
	message(STATUS "CMAKE_OSX_SYSROOT: ${CMAKE_OSX_SYSROOT}")
	message(STATUS "CMAKE_OSX_DEPLOYMENT_TARGET: ${CMAKE_OSX_DEPLOYMENT_TARGET}")
endif()
message(STATUS "CMAKE_SYSTEM_PROCESSOR: ${CMAKE_SYSTEM_PROCESSOR}")
message(STATUS "CMAKE_CXX_SIMULATE_ID: ${CMAKE_CXX_SIMULATE_ID}")

if(ANDROID)
	message(STATUS "CMAKE_ANDROID_NDK: ${CMAKE_ANDROID_NDK}")
	message(STATUS "CMAKE_ANDROID_NDK_TOOLCHAIN_HOST_TAG: ${CMAKE_ANDROID_NDK_TOOLCHAIN_HOST_TAG}")
	message(STATUS "CMAKE_ANDROID_ARCH_ABI: ${CMAKE_ANDROID_ARCH_ABI}")
	message(STATUS "CMAKE_SYSTEM_VERSION: ${CMAKE_SYSTEM_VERSION}")
	message(STATUS "CMAKE_ANDROID_NDK_TOOLCHAIN_VERSION: ${CMAKE_ANDROID_NDK_TOOLCHAIN_VERSION}")
	message(STATUS "CMAKE_CXX_ANDROID_TOOLCHAIN_MACHINE: ${CMAKE_CXX_ANDROID_TOOLCHAIN_MACHINE}")

	message(STATUS "ANDROID_SDK: ${ANDROID_SDK}")
	message(STATUS "ANDROID_BUILD_TOOLS_REVISION: ${ANDROID_BUILD_TOOLS_REVISION}")

	message(STATUS "ANDROID_NDK_REVISION: ${ANDROID_NDK_REVISION}")
endif()


message(STATUS "BUILD_SHARED_LIBS: ${BUILD_SHARED_LIBS}")