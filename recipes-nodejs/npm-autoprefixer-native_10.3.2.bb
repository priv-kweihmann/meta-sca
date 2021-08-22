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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.3.2.tgz"
SRC_URI[md5sum] = "11c731a115c48029dcf8df594a4dfc0f"
SRC_URI[sha256sum] = "d29239a984c954bb730588d6337526e5d9dca00f3fd96e48e5b6ba6a2f424668"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
