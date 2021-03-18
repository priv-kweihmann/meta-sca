SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.122.tgz"
SRC_URI[md5sum] = "8f1acc75c2ea929a88b17680f89117bf"
SRC_URI[sha256sum] = "0a1b4d24ff641d8a3d55b45e7da5bc12f224ce7ced12d85fb60fd5f4910d9b3e"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
