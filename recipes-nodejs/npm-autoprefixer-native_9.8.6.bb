SUMMARY = "NPM: autoprefixer"
DESCRIPTION = "Parse CSS and add vendor prefixes to CSS rules using values from the Can I Use website"
HOMEPAGE = "https://github.com/postcss/autoprefixer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-browserslist-native \
           npm-caniuse-lite-native \
           npm-colorette-native \
           npm-normalize-range-native \
           npm-num2fraction-native \
           npm-postcss-native \
           npm-postcss-value-parser-native"

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-9.8.6.tgz"
SRC_URI[md5sum] = "2801705d121c608d59f13f4a1967ecea"
SRC_URI[sha256sum] = "285f01d1836951cf6ccbdedaef62879f96d9144f67b0b09a40b6e82d4ad648b8"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
