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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.0.2.tgz"
SRC_URI[md5sum] = "2aa307ab6eedcc35fd5eb0a64d56d62b"
SRC_URI[sha256sum] = "161d78d5965dc63d8495143e12ca287a42ba8decadcae842f691c3626f02a825"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
