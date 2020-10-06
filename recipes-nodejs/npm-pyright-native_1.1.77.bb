SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.77.tgz"
SRC_URI[md5sum] = "60b2a9c4ad23e637fc07b05038d42957"
SRC_URI[sha256sum] = "35a5565848d668642705adc69776251145207de23c26bfeccbd0d7e4735d6261"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
