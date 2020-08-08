SUMMARY = "NPM: cspell-dict-scala"
DESCRIPTION = "Scala dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/scala#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-scala/-/cspell-dict-scala-1.0.12.tgz"
SRC_URI[md5sum] = "211e8f32d8fcdee071f88d4e8cdd12ac"
SRC_URI[sha256sum] = "3c0110302ed8ad92b02d474eaddf388ffa069e40bc6a22705a4e074927c1b867"

NPM_PKGNAME = "cspell-dict-scala"

inherit npmhelper
inherit native
