SUMMARY = "NPM: pg-formatter"
DESCRIPTION = "PostgreSQL SQL syntax beautifier."
HOMEPAGE = "https://github.com/gajus/pg-formatter#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8517dd2c21499c923c69fdca10d63d87"

DEPENDS = "npm-shell-quote-native"

SRC_URI = "https://registry.npmjs.org/pg-formatter/-/pg-formatter-1.2.0.tgz"
SRC_URI[md5sum] = "711b1ed2071e7ecb6b948ccdaa2ca216"
SRC_URI[sha256sum] = "18d15cd9e7993ffdbfeeaf4b23af9f917ee787d584de471883e524ee65d5f98b"

NPM_PKGNAME = "pg-formatter"

inherit npmhelper
inherit native
