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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.2.1.tgz"
SRC_URI[md5sum] = "e07e7aab8b655ca5c383ff2c8b12f6a2"
SRC_URI[sha256sum] = "8ba947e8971d56e309953d86e501e10977b8a4c9f81e28f0d40aadb87e6d9402"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
