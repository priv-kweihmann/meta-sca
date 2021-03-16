SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.121.tgz"
SRC_URI[md5sum] = "6a508609a47f4867dd5aa76f43ee2096"
SRC_URI[sha256sum] = "dc65c1a47cecb222878757dd84599d3efabea8b4968395f224900eab5e6a951c"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
