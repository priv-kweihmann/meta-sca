SUMMARY = "NPM: stream-combiner"
DESCRIPTION = "[![npm version](https://img.shields.io/npm/v/stream-combiner.svg)](https://npmjs.org/package/stream-combiner)  [![Travis CI](https://travis-ci.org/dominictarr/stream-combiner.svg)](https://travis-ci.org/dominictarr/stream-combiner)"
HOMEPAGE = "https://github.com/dominictarr/stream-combiner"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6a4d0fd1bedfc3135e80ba0a71c0f84"

DEPENDS = "npm-duplexer-native \
           npm-through-native"

SRC_URI = "https://registry.npmjs.org/stream-combiner/-/stream-combiner-0.2.2.tgz"
SRC_URI[md5sum] = "ef632c54807e7bd7dea83c90c5201c43"
SRC_URI[sha256sum] = "99efd168fb3695365920d57d9f9f7407ce58d7b3669824ed299d6e165b387e33"

NPM_PKGNAME = "stream-combiner"

inherit npmhelper
inherit native
