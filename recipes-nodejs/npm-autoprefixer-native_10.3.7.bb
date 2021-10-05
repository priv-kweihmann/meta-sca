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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.3.7.tgz"
SRC_URI[md5sum] = "0900175f3d997481c0c59d6cdbb9af6a"
SRC_URI[sha256sum] = "c15014654f6a06bef1474ad92d00657a413cb4ae3c31b0ed5d581e063eaeda1c"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
