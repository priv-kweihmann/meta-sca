SUMMARY = "NPM: rfdc"
DESCRIPTION = "Really Fast Deep Clone"
HOMEPAGE = "https://github.com/davidmarkclements/rfdc#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc2ea1f4c58a804909742c8eadede5ea"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/rfdc/-/rfdc-1.3.0.tgz"
SRC_URI[md5sum] = "83cd773d1eca69b8d049fa9bb643e007"
SRC_URI[sha256sum] = "d2a8a0606c532cfc201dda15aee08f9790152dcd82e72f870ccee54feeb702ff"

NPM_PKGNAME = "rfdc"

inherit npmhelper
inherit native
