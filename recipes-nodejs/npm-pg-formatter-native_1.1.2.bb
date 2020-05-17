SUMMARY = "NPM: pg-formatter"
DESCRIPTION = "PostgreSQL SQL syntax beautifier."
HOMEPAGE = "https://github.com/gajus/pg-formatter#readme"

DEPENDS = "npm-shell-quote-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8517dd2c21499c923c69fdca10d63d87"

SRC_URI = "https://registry.npmjs.org/pg-formatter/-/pg-formatter-1.1.2.tgz"
SRC_URI[md5sum] = "c17c339e63fbcfe599f88bdc05b662b9"
SRC_URI[sha256sum] = "286a29024e8febbd5ae1dde991b7e4915e0b46226f7e9d6ab472c9d6746220c8"

NPM_PKGNAME = "pg-formatter"

inherit npmhelper
inherit native
