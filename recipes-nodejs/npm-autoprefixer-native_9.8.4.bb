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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-9.8.4.tgz"
SRC_URI[md5sum] = "12009acf906a9ca7f4b0f5be294c8cbd"
SRC_URI[sha256sum] = "43fad76bfe4e4ec088c0292558e89b915492dad734720c22385dc99473fd8a4c"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
