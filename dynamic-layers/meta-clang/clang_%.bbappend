FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

PACKAGECONFIG_class-native += "shared-libs"

SRC_URI += "file://0026-libclang-Use-CMAKE_DL_LIBS-for-deducing-libdl.patch"

# Force lib-dl to flags
OECMAKE_CXX_FLAGS += "-ldl"