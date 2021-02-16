SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.111.tgz"
SRC_URI[md5sum] = "daba95ee909b0cf0fefe89565c86ad43"
SRC_URI[sha256sum] = "ec2d558e02f8baf43578ef0a11bb40f21b850b729cb6be83835e5bfa6f47f9c1"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
