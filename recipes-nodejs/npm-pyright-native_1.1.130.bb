SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.130.tgz"
SRC_URI[md5sum] = "53149b0e416585c8c389c2c95e4d7718"
SRC_URI[sha256sum] = "8cfe57a2a435609a24bc9bc27b92f9ef6616da7c85ff8e4e517229da76192131"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
