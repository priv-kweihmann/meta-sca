SUMMARY = "NPM: cspell-dict-lorem-ipsum"
DESCRIPTION = "Lorem-ipsum dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/lorem-ipsum#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-lorem-ipsum/-/cspell-dict-lorem-ipsum-1.0.14.tgz"
SRC_URI[md5sum] = "57490b6459f276baeff0a0c2fe58942b"
SRC_URI[sha256sum] = "b459a1e080494927b3def5a457acac65ee4a839071cacc1d591fc0620e2286fe"

NPM_PKGNAME = "cspell-dict-lorem-ipsum"

inherit npmhelper
inherit native
