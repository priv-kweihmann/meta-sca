FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

python __anonymous() {
    _patch = "file://0026-libclang-Use-CMAKE_DL_LIBS-for-deducing-libdl.patch"
    if _patch not in d.getVar("SRC_URI").split(" "):
        d.appendVar("SRC_URI", " " + _patch)
}

PACKAGECONFIG_class-native += "shared-libs"

# Force lib-dl to flags
OECMAKE_CXX_FLAGS += "-ldl"