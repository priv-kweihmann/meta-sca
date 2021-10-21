SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-nanoid-native \
           npm-picocolors-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.3.10.tgz"
SRC_URI[md5sum] = "e19d2fe7e3a07720f25e40a8e33b1730"
SRC_URI[sha256sum] = "280b6023111f387ac5b93c84158e3ba56d0ca79fcdc9f4d6e7f4ebdd02adda94"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
