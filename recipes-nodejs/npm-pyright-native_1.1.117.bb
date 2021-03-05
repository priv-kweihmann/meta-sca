SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.117.tgz"
SRC_URI[md5sum] = "980acb63b4ceec18922a455f3e6dd340"
SRC_URI[sha256sum] = "78592f4cf7ada4c661ae1e3f64125cbbc7b7cd2fc2fde1dd16ccb50e8c34d722"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
