SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.3.4.tgz"
SRC_URI[md5sum] = "d077f3ae4eeab16f335525956d698cfb"
SRC_URI[sha256sum] = "85eceec4041e54d33b5d83668ecb32a3674c81d050c0593c8c2f4cdfb8f25301"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
