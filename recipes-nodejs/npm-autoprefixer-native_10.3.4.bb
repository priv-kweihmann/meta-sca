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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.3.4.tgz"
SRC_URI[md5sum] = "c83a7a61fa8ff1cc1e2f57cf99ea4a10"
SRC_URI[sha256sum] = "a33f488af6b952f3b3a24d8b1ec815ea017a585cd57292c6f9dc223275e68865"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
