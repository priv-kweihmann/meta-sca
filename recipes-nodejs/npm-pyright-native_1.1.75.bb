SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.75.tgz"
SRC_URI[md5sum] = "3d64244b3e2f47d8c3e662cda06c8f48"
SRC_URI[sha256sum] = "1be13ca332779cad207de5e4f368fac837824d5114d885ad8cdbdf2d33a618c7"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
