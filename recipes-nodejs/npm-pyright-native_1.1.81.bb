SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.81.tgz"
SRC_URI[md5sum] = "6a3a439ab76ffcbddf01f2f77b9a2263"
SRC_URI[sha256sum] = "e842c5ab5bfc1777efdf56aca6c325fcef50b0232943178474ae7d2d931c51ac"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
