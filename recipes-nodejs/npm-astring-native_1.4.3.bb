SUMMARY = "NPM: astring"
DESCRIPTION = "JavaScript code generator from an ESTree-compliant AST."
HOMEPAGE = "https://github.com/davidbonnet/astring#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=092cf85092a220afe2c99f78ddcb7343"

SRC_URI = "https://registry.npmjs.org/astring/-/astring-1.4.3.tgz"
SRC_URI[md5sum] = "37cf4dba993a737cf26d5bbe4ab37ba4"
SRC_URI[sha256sum] = "e742e40eca0cef7973c4519c1018f2a06dbb22c389159c71f354633f533a1e26"

NPM_PKGNAME = "astring"

inherit npmhelper
inherit native
