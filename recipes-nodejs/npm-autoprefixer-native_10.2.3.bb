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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.2.3.tgz"
SRC_URI[md5sum] = "c34ab69fa27cac4cef15feff8d3d4e5d"
SRC_URI[sha256sum] = "efeba3884ab51d98719c1b965e37148fb73d6bc6659ce1e3a0a3b50ef20857e1"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
