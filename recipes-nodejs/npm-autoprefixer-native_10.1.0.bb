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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.1.0.tgz"
SRC_URI[md5sum] = "4f79fb17ad40831e87b4e14c37c4acb5"
SRC_URI[sha256sum] = "d7efb8c79fe581f50e9f7d67e6ef51729db60c9971aaaf9380761379d545afa4"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
