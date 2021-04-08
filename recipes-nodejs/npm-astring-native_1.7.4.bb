SUMMARY = "NPM: astring"
DESCRIPTION = "JavaScript code generator from an ESTree-compliant AST."
HOMEPAGE = "https://github.com/davidbonnet/astring#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=092cf85092a220afe2c99f78ddcb7343"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/astring/-/astring-1.7.4.tgz"
SRC_URI[md5sum] = "ca9860c50d61ea2ba037c49a8dc7a26b"
SRC_URI[sha256sum] = "bf102f462561f555a1020360a8df11c8455943ac2f8ce21d925472c1a6d7b21c"

NPM_PKGNAME = "astring"

inherit npmhelper
inherit native
