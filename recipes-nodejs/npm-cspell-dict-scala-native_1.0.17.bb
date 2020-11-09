SUMMARY = "NPM: cspell-dict-scala"
DESCRIPTION = "Scala dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/scala#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-scala/-/cspell-dict-scala-1.0.17.tgz"
SRC_URI[md5sum] = "a70e90174d7ba02a62898e4dd9af4cfa"
SRC_URI[sha256sum] = "881e8794885c6276536bfcb833f70d34fa5b0e98fd71d3a111c17dcc00d8d0dc"

NPM_PKGNAME = "cspell-dict-scala"

inherit npmhelper
inherit native
