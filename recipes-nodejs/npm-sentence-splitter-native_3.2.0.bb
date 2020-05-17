SUMMARY = "NPM: sentence-splitter"
DESCRIPTION = "split {japanese, english} text into sentences."
HOMEPAGE = "https://github.com/azu/sentence-splitter"

DEPENDS = "npm-concat-stream-native npm-object.values-native npm-structured-source-native npm-textlint-ast-node-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

SRC_URI = "https://registry.npmjs.org/sentence-splitter/-/sentence-splitter-3.2.0.tgz"
SRC_URI[md5sum] = "472a4b6fc439d7d5ace4dc59ce1dd3fe"
SRC_URI[sha256sum] = "6b5c266e6c47c6231d44cbb0015ee870df5ac229d55d63e431b85fb1ee11a606"

NPM_PKGNAME = "sentence-splitter"

inherit npmhelper
inherit native
