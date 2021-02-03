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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.2.4.tgz"
SRC_URI[md5sum] = "4552081b4d238b8c57337b8b1c5cd9df"
SRC_URI[sha256sum] = "6bb248cc93e68a7a6d7b3645b0e49cbad896afda996cf475b63c7a4bf8a94867"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
