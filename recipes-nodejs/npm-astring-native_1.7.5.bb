SUMMARY = "NPM: astring"
DESCRIPTION = "JavaScript code generator from an ESTree-compliant AST."
HOMEPAGE = "https://github.com/davidbonnet/astring#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=092cf85092a220afe2c99f78ddcb7343"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/astring/-/astring-1.7.5.tgz"
SRC_URI[md5sum] = "e0442769bcfd80a28e98d4650c5c4087"
SRC_URI[sha256sum] = "70033c1b7be96d27c4639ef5e9796f672ce8910641c409fb85173ec9a9df4131"

NPM_PKGNAME = "astring"

inherit npmhelper
inherit native
