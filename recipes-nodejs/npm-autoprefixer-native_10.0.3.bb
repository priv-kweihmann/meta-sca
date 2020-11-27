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

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-10.0.3.tgz"
SRC_URI[md5sum] = "afd6046ae261e20bef624373ab5e385e"
SRC_URI[sha256sum] = "0f4089eb0cca9462413bd83d44a065e88d803ccad013d1bdfeb0e5f8d80dc3f0"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
