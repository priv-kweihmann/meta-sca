SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.86.tgz"
SRC_URI[md5sum] = "d95883ab3f17c677cd432dac47cb1c41"
SRC_URI[sha256sum] = "07764a0850630f763c1249c281b7354e26426af5e855b1bce07dc45df2d27de1"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
