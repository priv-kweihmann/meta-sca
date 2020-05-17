SUMMARY = "NPM: brace-expansion"
DESCRIPTION = "Brace expansion as known from sh/bash"
HOMEPAGE = "https://github.com/juliangruber/brace-expansion"

DEPENDS = "npm-balanced-match-native npm-concat-map-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec"

SRC_URI = "https://registry.npmjs.org/brace-expansion/-/brace-expansion-1.1.11.tgz"
SRC_URI[md5sum] = "02822e3db48e8c5b844fa309fa2cc56b"
SRC_URI[sha256sum] = "84bd645925eb665a04c19c66eb9da8499d9c17d0d62b4b979d085dcae99695da"

S = "${WORKDIR}/package"

NPM_PKGNAME = "brace-expansion"

inherit npmhelper
inherit native
