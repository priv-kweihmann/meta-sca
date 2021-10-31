SUMMARY = "NPM: autoprefixer"
DESCRIPTION = "Parse CSS and add vendor prefixes to CSS rules using values from the Can I Use website"
HOMEPAGE = "https://github.com/postcss/autoprefixer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-browserslist-native \
           npm-caniuse-lite-native \
           npm-fraction.js-native \
           npm-normalize-range-native \
           npm-picocolors-native \
           npm-postcss-value-parser-native"

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.4.0.tgz"
SRC_URI[md5sum] = "e7fadcfe824eb44d8017ea4108a17a01"
SRC_URI[sha256sum] = "f195747da2fbb2bcd66fa0720b38ff3d36daa79ce1a992726f52132b7429baef"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
