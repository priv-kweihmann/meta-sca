SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.93.tgz"
SRC_URI[md5sum] = "a0c614078f669119a25d8606f6a136f6"
SRC_URI[sha256sum] = "87ab008336d256340b22987fc34ac3ce26c13479426b36e2f8efb05c2b59ccca"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
