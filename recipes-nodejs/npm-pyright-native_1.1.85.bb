SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.85.tgz"
SRC_URI[md5sum] = "910f1f4d80d99e36b5802eda66df9b34"
SRC_URI[sha256sum] = "bfb5fba78b0097a4076a93dd16c549d6a4a2c6c233c21ccf13cc7fe4a0439281"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
