SUMMARY = "NPM: postcss-less"
DESCRIPTION = "LESS parser for PostCSS"
HOMEPAGE = "https://github.com/shellscape/postcss-less"

DEPENDS = "npm-postcss-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0241caf92f040ee6f8c5a1e1f7892698"

SRC_URI = "https://registry.npmjs.org/postcss-less/-/postcss-less-3.1.4.tgz"
SRC_URI[md5sum] = "694da46ebc3fd878fc58e72f43608e2a"
SRC_URI[sha256sum] = "7da71ae8241847beeafcc033c262728cfdd75d27071bb382c68e3ab1bc0d63b8"

NPM_PKGNAME = "postcss-less"

inherit npmhelper
inherit native
