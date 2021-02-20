SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.113.tgz"
SRC_URI[md5sum] = "7308ad3e71685adf159082474613746b"
SRC_URI[sha256sum] = "c00212573fe2327bcdaf1eba9f79aed76cbb80de1515c3209693df54956297f3"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
