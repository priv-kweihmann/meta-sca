SUMMARY = "NPM: cspell-dict-lorem-ipsum"
DESCRIPTION = "Lorem-ipsum dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/lorem-ipsum#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-lorem-ipsum/-/cspell-dict-lorem-ipsum-1.0.12.tgz"
SRC_URI[md5sum] = "4cb03af4f23c660c772b235565b4e886"
SRC_URI[sha256sum] = "398055a7a4a891b4ed460027bb56a2be1377f64cc249dedd29da36ad480f86dd"

NPM_PKGNAME = "cspell-dict-lorem-ipsum"

inherit npmhelper
inherit native
