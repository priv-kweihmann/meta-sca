SUMMARY = "NPM: textlint-plugin-html"
DESCRIPTION = "textlint HTML processsor plugin."
HOMEPAGE = "https://github.com/textlint/textlint-plugin-html"

DEPENDS = "npm-hast-native npm-structured-source-native npm-traverse-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

SRC_URI = "https://registry.npmjs.org/textlint-plugin-html/-/textlint-plugin-html-0.2.0.tgz"
SRC_URI[md5sum] = "6508f251d616cf54b99282d065ca28b0"
SRC_URI[sha256sum] = "5e13f5f0cd0a1f435345203f55e3c4686b89cb602eec1d379c3fd01f8c802e4b"

NPM_PKGNAME = "textlint-plugin-html"

inherit npmhelper
inherit native
