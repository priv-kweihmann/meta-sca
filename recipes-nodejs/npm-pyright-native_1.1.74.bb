SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.74.tgz"
SRC_URI[md5sum] = "a0edcff123bea255a4b0548760f15ae9"
SRC_URI[sha256sum] = "a32d4f8c966747788518f81d4b50304d07de22eb9a810486a7a3f8a70de4d8ad"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
