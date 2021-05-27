SUMMARY = "NPM: autoprefixer"
DESCRIPTION = "Parse CSS and add vendor prefixes to CSS rules using values from the Can I Use website"
HOMEPAGE = "https://github.com/postcss/autoprefixer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-browserslist-native \
           npm-caniuse-lite-native \
           npm-colorette-native \
           npm-fraction.js-native \
           npm-normalize-range-native \
           npm-postcss-value-parser-native"

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.2.6.tgz"
SRC_URI[md5sum] = "6ed9c3da3f266c28c04b153cb1ad06b8"
SRC_URI[sha256sum] = "5b63692c0ef3d0aa5cc14402b21a66a2b29c13b01fbf246449d5be4a2e56d7e5"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
