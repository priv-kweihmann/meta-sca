SUMMARY = "NPM: astring"
DESCRIPTION = "JavaScript code generator from an ESTree-compliant AST."
HOMEPAGE = "https://github.com/davidbonnet/astring#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=092cf85092a220afe2c99f78ddcb7343"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/astring/-/astring-1.5.1.tgz"
SRC_URI[md5sum] = "94768e0999441cb5177c9b7ae2f0e646"
SRC_URI[sha256sum] = "f46018d1cd60ffe3232e26be142500e28a7ccd52cacc8dec365c009dd69a8929"

NPM_PKGNAME = "astring"

inherit npmhelper
inherit native
