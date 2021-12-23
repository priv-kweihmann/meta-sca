SUMMARY = "NPM: pg-formatter"
DESCRIPTION = "PostgreSQL SQL syntax beautifier."
HOMEPAGE = "https://github.com/gajus/pg-formatter#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8517dd2c21499c923c69fdca10d63d87"

DEPENDS = "npm-shell-quote-native \
           npm-yargs-native"

SRC_URI = "https://registry.npmjs.org/pg-formatter/-/pg-formatter-1.3.0.tgz"
SRC_URI[md5sum] = "d037c1fe949c32909855d6217eb79d76"
SRC_URI[sha256sum] = "357be02e113e8bab8408b6b3ccb24faa14928b23df65b8ba7aef5258cc56c14e"

NPM_PKGNAME = "pg-formatter"

inherit npmhelper
inherit native
