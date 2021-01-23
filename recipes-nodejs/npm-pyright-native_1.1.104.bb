SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.104.tgz"
SRC_URI[md5sum] = "343e064af3c5c950b2f977bafa4c1f5e"
SRC_URI[sha256sum] = "19b70ca7eb28d9284c987199e2a08073015bd3c505e9185fe544b8c26846b25c"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
