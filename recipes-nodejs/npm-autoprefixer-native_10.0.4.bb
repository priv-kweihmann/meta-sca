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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.0.4.tgz"
SRC_URI[md5sum] = "cbe88ad69d994ff16014165567fa6833"
SRC_URI[sha256sum] = "27631bbcf9fef31e0d264a0695dc68ce3c0e92ca902f991080c7e2cb4170aa1f"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
