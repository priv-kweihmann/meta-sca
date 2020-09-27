SUMMARY = "NPM: postcss-safe-parser"
DESCRIPTION = "Fault-tolerant CSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-safe-parser#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-safe-parser/-/postcss-safe-parser-5.0.2.tgz"
SRC_URI[md5sum] = "1d8177080618755d8e653381e0845055"
SRC_URI[sha256sum] = "0744d1e932840b4db5e2af9c6ba9dccc10399592de1405d44da36ddcbd63829f"

NPM_PKGNAME = "postcss-safe-parser"

inherit npmhelper
inherit native
