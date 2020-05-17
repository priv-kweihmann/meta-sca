SUMMARY = "NPM: cspell-dict-scala"
DESCRIPTION = "Scala dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/scala#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

SRC_URI = "https://registry.npmjs.org/cspell-dict-scala/-/cspell-dict-scala-1.0.11.tgz"
SRC_URI[md5sum] = "db894076bc7908bfd89a7a78bd69ca29"
SRC_URI[sha256sum] = "3da053412bf629f3ce04b8e88b8805d745deb30d9a8cbcab63bea5da96d87dfc"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-scala"

inherit npmhelper
inherit native
