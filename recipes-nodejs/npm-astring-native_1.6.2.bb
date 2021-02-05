SUMMARY = "NPM: astring"
DESCRIPTION = "JavaScript code generator from an ESTree-compliant AST."
HOMEPAGE = "https://github.com/davidbonnet/astring#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=092cf85092a220afe2c99f78ddcb7343"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/astring/-/astring-1.6.2.tgz"
SRC_URI[md5sum] = "f5530025f9c3dd5395464269dd711d60"
SRC_URI[sha256sum] = "10fff99dca912b63e4ed7c8260ca8bddcfcb440644e65088a241737e26170b97"

NPM_PKGNAME = "astring"

inherit npmhelper
inherit native
