SUMMARY = "NPM: stream-combiner"
DESCRIPTION = "<img src=https://secure.travis-ci.org/dominictarr/stream-combiner.png?branch=master>"
HOMEPAGE = "https://github.com/dominictarr/stream-combiner"

DEPENDS = "npm-duplexer-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6a4d0fd1bedfc3135e80ba0a71c0f84"

SRC_URI = "https://registry.npmjs.org/stream-combiner/-/stream-combiner-0.0.4.tgz"
SRC_URI[md5sum] = "e05b8db2f5283cb2517952c6f8d353e1"
SRC_URI[sha256sum] = "94c833174d0e1f4bcd8040239c151aa27bc07b37688f579024ff3cc6617c0bf4"

NPM_PKGNAME = "stream-combiner"

inherit npmhelper
inherit native
