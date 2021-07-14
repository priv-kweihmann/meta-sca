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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.3.1.tgz"
SRC_URI[md5sum] = "38c04726a3c99365566da5a14730ea98"
SRC_URI[sha256sum] = "89fef3bf0503419e7934110321e33ddf24ac25a6d071f49c01c6d518c3ffd958"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
