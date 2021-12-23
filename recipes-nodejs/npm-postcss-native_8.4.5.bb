SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-nanoid-native \
           npm-picocolors-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.4.5.tgz"
SRC_URI[md5sum] = "bb76e4e69e59626ca940b325b727ea1b"
SRC_URI[sha256sum] = "572bfcfcc0606e4657f9052e78de0cc3f5b2e11672b54446be4aa3904d659626"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
