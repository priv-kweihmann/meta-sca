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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-9.8.5.tgz"
SRC_URI[md5sum] = "def5618b95ca3b3573bac4e02e2733fc"
SRC_URI[sha256sum] = "76e3b844339009f6602f19e46b86f0b84b98c3725ef31c3dbb19d240137b23cb"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
