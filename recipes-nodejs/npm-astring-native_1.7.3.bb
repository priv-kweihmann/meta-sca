SUMMARY = "NPM: astring"
DESCRIPTION = "JavaScript code generator from an ESTree-compliant AST."
HOMEPAGE = "https://github.com/davidbonnet/astring#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=092cf85092a220afe2c99f78ddcb7343"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/astring/-/astring-1.7.3.tgz"
SRC_URI[md5sum] = "1ad73dec0b98778e498621d65a68ae54"
SRC_URI[sha256sum] = "5b41c0e87221190cf59f3011db1bccda40ba8305c2a1bbd2e4bdb0508392466a"

NPM_PKGNAME = "astring"

inherit npmhelper
inherit native
