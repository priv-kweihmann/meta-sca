SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.115.tgz"
SRC_URI[md5sum] = "76dcf17e2fb13f61c0cd66053c380bf6"
SRC_URI[sha256sum] = "9e30e0ac483c60eec1d1c97b24e9640d4c8365dffbe08fdb99a8639b7adbc239"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
