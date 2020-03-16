FILESEXTRAPATHS_prepend := "${THISDIR}/clang:"

CLANGPATCHES += "\
    file://0026-libclang-Use-CMAKE_DL_LIBS-for-deducing-libdl.patch \
"
