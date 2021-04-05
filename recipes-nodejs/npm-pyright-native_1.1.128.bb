SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.128.tgz"
SRC_URI[md5sum] = "6a29d99a5ae3bcc13db9c1526ef659a1"
SRC_URI[sha256sum] = "bfe192a55ce0199f446c3260bcd2ba272919edaada015812894c845306062c62"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
