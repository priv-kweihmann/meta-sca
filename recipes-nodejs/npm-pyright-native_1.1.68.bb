SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.68.tgz"
SRC_URI[md5sum] = "ffac5586ba8ccc03dff2121b0b6b2aff"
SRC_URI[sha256sum] = "79afe1f7f4d0a4473632416ee5c6ddc2bf99e9b608f70dd24cc2ba56a965e1b5"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
