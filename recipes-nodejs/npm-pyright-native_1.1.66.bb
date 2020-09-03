SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.66.tgz"
SRC_URI[md5sum] = "2f603d5c435172f2c3f3ffdc36a9ecd6"
SRC_URI[sha256sum] = "1a2300c106d3a310177e5e61d70036d375c14bb0a7971a9d53c4b2e6f1dfc5a0"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
