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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.0.1.tgz"
SRC_URI[md5sum] = "7b838b13f3a66f9e287108e396d8100f"
SRC_URI[sha256sum] = "2721361e197aa71c7a14a2db29eb807a30c1c4a63f110b18a1d81079378b8ea3"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
