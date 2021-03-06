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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.2.5.tgz"
SRC_URI[md5sum] = "b3d289521d4a16d60e7dba332e70316e"
SRC_URI[sha256sum] = "cbdb71eb202ace597fe2630695bdff7de6e0885b62fb196871ffcd107d5020ba"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
