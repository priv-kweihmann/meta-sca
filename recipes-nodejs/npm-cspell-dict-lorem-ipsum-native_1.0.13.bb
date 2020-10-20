SUMMARY = "NPM: cspell-dict-lorem-ipsum"
DESCRIPTION = "Lorem-ipsum dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/lorem-ipsum#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-lorem-ipsum/-/cspell-dict-lorem-ipsum-1.0.13.tgz"
SRC_URI[md5sum] = "929ba0d757111d3f511fc20047795c3e"
SRC_URI[sha256sum] = "332442c3836f54617559400df0bbded02e43bd6bf2e8c9ccdc3b8dc5eae3cb0c"

NPM_PKGNAME = "cspell-dict-lorem-ipsum"

inherit npmhelper
inherit native
