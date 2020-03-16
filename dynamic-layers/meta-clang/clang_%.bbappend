FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

PACKAGECONFIG_class-native += "shared-libs"

# Force lib-dl to flags
OECMAKE_CXX_FLAGS += "-ldl"
