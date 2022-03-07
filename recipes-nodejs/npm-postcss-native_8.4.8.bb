SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-nanoid-native \
           npm-picocolors-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.4.8.tgz"
SRC_URI[md5sum] = "eab49a0a816a62112ca3c3ae189f2f3e"
SRC_URI[sha256sum] = "0fcad5a4493f823b5a162d709ef7745015fd308303f9eeaad19058ef246855e0"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
