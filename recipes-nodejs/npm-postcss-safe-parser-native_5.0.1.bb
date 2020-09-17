SUMMARY = "NPM: postcss-safe-parser"
DESCRIPTION = "Fault-tolerant CSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-safe-parser#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-safe-parser/-/postcss-safe-parser-5.0.1.tgz"
SRC_URI[md5sum] = "02d99d8c3727aea7d5879f064f05ab91"
SRC_URI[sha256sum] = "9c056bc15454230e22ee9eed212cd05f25c2fbb5a21a0e6753096f593b76e253"

NPM_PKGNAME = "postcss-safe-parser"

inherit npmhelper
inherit native
