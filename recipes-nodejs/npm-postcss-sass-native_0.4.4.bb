SUMMARY = "NPM: postcss-sass"
DESCRIPTION = "A Sass parser for PostCSS, using gonzales-pe."
HOMEPAGE = "https://github.com/AleshaOleg/postcss-sass"

DEPENDS = "npm-gonzales-pe-native npm-postcss-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da310059f1fc8bbdc432568d374fcefa"

SRC_URI = "https://registry.npmjs.org/postcss-sass/-/postcss-sass-0.4.4.tgz"
SRC_URI[md5sum] = "dffeea4e5f0163fef6e79cd467b8f9dc"
SRC_URI[sha256sum] = "09994a0ff3445bd7c1ebfe7255458828038e4472b3f5c3a5257416f06ed28c87"

NPM_PKGNAME = "postcss-sass"

inherit npmhelper
inherit native
