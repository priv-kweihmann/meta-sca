SUMMARY = "NPM: astring"
DESCRIPTION = "JavaScript code generator from an ESTree-compliant AST."
HOMEPAGE = "https://github.com/davidbonnet/astring#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=092cf85092a220afe2c99f78ddcb7343"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/astring/-/astring-1.6.0.tgz"
SRC_URI[md5sum] = "1ff28fdaf07a1104d44d7b32b0d606ce"
SRC_URI[sha256sum] = "09a84bdee2626870055c84603ce2543b299da43b0ca7402c9e8bbe086baa2cb6"

NPM_PKGNAME = "astring"

inherit npmhelper
inherit native
