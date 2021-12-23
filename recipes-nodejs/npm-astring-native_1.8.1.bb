SUMMARY = "NPM: astring"
DESCRIPTION = "JavaScript code generator from an ESTree-compliant AST."
HOMEPAGE = "https://github.com/davidbonnet/astring#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=092cf85092a220afe2c99f78ddcb7343"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/astring/-/astring-1.8.1.tgz"
SRC_URI[md5sum] = "d087138c1ed9d1f0b4c8cb1b650eb3dc"
SRC_URI[sha256sum] = "3143a3d323f93b3d286f76bc1c5f1f97fab7f38dc0db6f5a7ec07c62acd6e051"

NPM_PKGNAME = "astring"

inherit npmhelper
inherit native
