SUMMARY = "NPM: sentence-splitter"
DESCRIPTION = "split {japanese, english} text into sentences."
HOMEPAGE = "https://github.com/azu/sentence-splitter"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-concat-stream-native \
           npm-object-values-native \
           npm-structured-source-native \
           npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/sentence-splitter/-/sentence-splitter-3.2.2.tgz"
SRC_URI[md5sum] = "52870de189c9c7fbdeef97c2ccc2a3a5"
SRC_URI[sha256sum] = "369a9289c9d896adb539fc159d799aeda822eb81284a6f7c5aa1c207d9cb8f50"

NPM_PKGNAME = "sentence-splitter"

inherit npmhelper
inherit native
