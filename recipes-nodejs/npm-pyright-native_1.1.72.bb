SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.72.tgz"
SRC_URI[md5sum] = "f0d24a9a6a23b9d048fbdcceddcec1f3"
SRC_URI[sha256sum] = "b08754a0c5a29b3015d9ec9bb42d3192ec427f7961b2f5b5d34579eb6d516550"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
