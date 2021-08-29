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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.3.3.tgz"
SRC_URI[md5sum] = "6dd1a85c6ed94c36080e217b8b73a38e"
SRC_URI[sha256sum] = "abf00a18941e2af5a862ae5dc65de1f717f2a906571e944d1ea05154cbb869dc"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
