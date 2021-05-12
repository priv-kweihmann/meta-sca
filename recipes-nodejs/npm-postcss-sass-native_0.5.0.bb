SUMMARY = "NPM: postcss-sass"
DESCRIPTION = "A Sass parser for PostCSS, using gonzales-pe."
HOMEPAGE = "https://github.com/AleshaOleg/postcss-sass"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da310059f1fc8bbdc432568d374fcefa"

DEPENDS = "npm-gonzales-pe-native \
           npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-sass/-/postcss-sass-0.5.0.tgz"
SRC_URI[md5sum] = "4b394a76b12916e99cc4ba13cd1d9d3a"
SRC_URI[sha256sum] = "913af84bdd0581950c9f8b4e5fff5907447b0d7c83d008ffdb772501d385a697"

NPM_PKGNAME = "postcss-sass"

inherit npmhelper
inherit native
