SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.0.16.tgz"
SRC_URI[md5sum] = "441adbcbec19e104816df65c74089cea"
SRC_URI[sha256sum] = "8b560ce8c3fe228a68d7d2c4078fa0a950c253a22fe116625629f1e2949a597a"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
