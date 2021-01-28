SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.106.tgz"
SRC_URI[md5sum] = "a40c8a05cdfcb528fc4087c6d07d3db3"
SRC_URI[sha256sum] = "e958b939ffa52f86edc7d1c1ed55b9bc0d126e13725eca46df394e460d3aa37c"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
