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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.2.0.tgz"
SRC_URI[md5sum] = "0e67c49846e1c60295ade17a628beb40"
SRC_URI[sha256sum] = "db9f7b72ef32961535fb6bc32090ea0426e91209286dc6e237ed3fd78c4e208a"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
