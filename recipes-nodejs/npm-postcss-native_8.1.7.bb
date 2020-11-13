SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-line-column-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.1.7.tgz"
SRC_URI[md5sum] = "ff1399a2425e73a240060d842d6543e4"
SRC_URI[sha256sum] = "0cab82fd946fc1bcd8b0bac51fcaeaca11207353947363876e19d071ffa0f9ac"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
