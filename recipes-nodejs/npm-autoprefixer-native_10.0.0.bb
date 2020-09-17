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
           npm-postcss-value-parser-native"

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.0.0.tgz"
SRC_URI[md5sum] = "d8fe014c179963b0c68b0b202ecf77f1"
SRC_URI[sha256sum] = "566686caede670c12139d3c8ef9bd7ddb0bcc35a6211982358fbb5a2a98f59dd"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
