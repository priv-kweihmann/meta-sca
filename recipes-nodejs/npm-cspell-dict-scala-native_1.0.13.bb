SUMMARY = "NPM: cspell-dict-scala"
DESCRIPTION = "Scala dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/scala#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-scala/-/cspell-dict-scala-1.0.13.tgz"
SRC_URI[md5sum] = "6254d46163dca58c28fcca405c87bba6"
SRC_URI[sha256sum] = "5f3da434a0b532074de9a39df112d5eaf9bb6c8235103882ef622494793a90eb"

NPM_PKGNAME = "cspell-dict-scala"

inherit npmhelper
inherit native
