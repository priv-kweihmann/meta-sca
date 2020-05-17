SUMMARY = "NPM: cspell-dict-lorem-ipsum"
DESCRIPTION = "Lorem-ipsum dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/lorem-ipsum#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

SRC_URI = "https://registry.npmjs.org/cspell-dict-lorem-ipsum/-/cspell-dict-lorem-ipsum-1.0.10.tgz"
SRC_URI[md5sum] = "99de297ea16e013fcb69415ace7936dd"
SRC_URI[sha256sum] = "b2848b02619329c8c333b6e35ffcf0e2e42626d739b0b8ff4ad33692b192efe9"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-lorem-ipsum"

inherit npmhelper
inherit native
