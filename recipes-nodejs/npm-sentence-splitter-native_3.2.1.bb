SUMMARY = "NPM: sentence-splitter"
DESCRIPTION = "split {japanese, english} text into sentences."
HOMEPAGE = "https://github.com/azu/sentence-splitter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-concat-stream-native \
           npm-object-values-native \
           npm-structured-source-native \
           npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/sentence-splitter/-/sentence-splitter-3.2.1.tgz"
SRC_URI[md5sum] = "80e3177ff9487668d31e41a72749b3ea"
SRC_URI[sha256sum] = "d83e957bf1212c725911beea43aac3636e1a4a953b443f1d105611d386e31020"

NPM_PKGNAME = "sentence-splitter"

inherit npmhelper
inherit native
