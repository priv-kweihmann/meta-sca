SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.108.tgz"
SRC_URI[md5sum] = "03a2f40a6ce4f0385ab8a122e8985b3d"
SRC_URI[sha256sum] = "4d77433df12ff680fd6ba26e922841aa401bf925bb634c818495a0aabe2cf859"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
