SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-nanoid-native \
           npm-picocolors-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.4.11.tgz"
SRC_URI[md5sum] = "2a61580b67f1d643408e97ce0528a1bf"
SRC_URI[sha256sum] = "9f589686289d464ad1f827df8ec3537a596a873b99cd89b5cb3bcaf0172b3356"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
