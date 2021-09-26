SUMMARY = "NPM: autoprefixer"
DESCRIPTION = "Parse CSS and add vendor prefixes to CSS rules using values from the Can I Use website"
HOMEPAGE = "https://github.com/postcss/autoprefixer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-browserslist-native \
           npm-caniuse-lite-native \
           npm-fraction.js-native \
           npm-nanocolors-native \
           npm-normalize-range-native \
           npm-postcss-value-parser-native"

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.3.5.tgz"
SRC_URI[md5sum] = "024140fbce547bd54adc010ac7b4f6af"
SRC_URI[sha256sum] = "269d54a7ec80eff076816c5fc5caf5f1702986b5f8cb3da5659891ceab695cfa"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
