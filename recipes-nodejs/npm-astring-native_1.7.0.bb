SUMMARY = "NPM: astring"
DESCRIPTION = "JavaScript code generator from an ESTree-compliant AST."
HOMEPAGE = "https://github.com/davidbonnet/astring#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=092cf85092a220afe2c99f78ddcb7343"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/astring/-/astring-1.7.0.tgz"
SRC_URI[md5sum] = "65e72bfdf1e8b3d85a8c4eb7e41fe085"
SRC_URI[sha256sum] = "5f221f3402e191dc7b588a0835c7bb9ca3e02d04960aa9ffb7ba7ece1fe53854"

NPM_PKGNAME = "astring"

inherit npmhelper
inherit native
