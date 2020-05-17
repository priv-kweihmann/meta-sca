SUMMARY = "NPM: postcss-safe-parser"
DESCRIPTION = "Fault-tolerant CSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-safe-parser#readme"

DEPENDS = "npm-postcss-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

SRC_URI = "https://registry.npmjs.org/postcss-safe-parser/-/postcss-safe-parser-4.0.2.tgz"
SRC_URI[md5sum] = "09e7e43f70ededee2e1ef4951fed5bf6"
SRC_URI[sha256sum] = "32262beec27c8f896fd9f87887a103ab65f82cb0a6c2d358fe0051a4c50c43dd"

NPM_PKGNAME = "postcss-safe-parser"

inherit npmhelper
inherit native
