SUMMARY = "NPM: cspell-dict-java"
DESCRIPTION = "Java dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/java#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-java/-/cspell-dict-java-1.0.13.tgz"
SRC_URI[md5sum] = "8972ef7d210929160b06c25cfaadbc49"
SRC_URI[sha256sum] = "849a981553d297f911655f54c408162f31154e834739bd077d94e6e702cfe079"

NPM_PKGNAME = "cspell-dict-java"

inherit npmhelper
inherit native
