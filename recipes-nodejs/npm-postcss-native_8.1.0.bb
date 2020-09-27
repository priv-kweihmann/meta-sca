SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-line-column-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.1.0.tgz"
SRC_URI[md5sum] = "6914f5946077890867eb09683cc05a2e"
SRC_URI[sha256sum] = "41990066eede679469d4ef0721ffc51f3cedaee7a4e35990b4d0afcbf802a460"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
