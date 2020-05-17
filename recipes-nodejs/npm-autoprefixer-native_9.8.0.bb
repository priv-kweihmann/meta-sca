SUMMARY = "NPM: autoprefixer"
DESCRIPTION = "Parse CSS and add vendor prefixes to CSS rules using values from the Can I Use website"
HOMEPAGE = "https://github.com/postcss/autoprefixer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-browserslist-native \
           npm-caniuse-lite-native \
           npm-chalk-native \
           npm-normalize-range-native \
           npm-num2fraction-native \
           npm-postcss-native \
           npm-postcss-value-parser-native"

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-9.8.0.tgz"
SRC_URI[md5sum] = "07dd4a2066a1b072050e9dd7225a553e"
SRC_URI[sha256sum] = "6e30e53a0b19ecdacc495c268fc496adc119b2c8cc148aecd0bd97c4e695b8c1"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
