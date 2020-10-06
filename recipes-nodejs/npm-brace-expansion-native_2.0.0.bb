SUMMARY = "NPM: brace-expansion"
DESCRIPTION = "Brace expansion as known from sh/bash"
HOMEPAGE = "https://github.com/juliangruber/brace-expansion"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec"

DEPENDS = "npm-balanced-match-native"

SRC_URI = "https://registry.npmjs.org/brace-expansion/-/brace-expansion-2.0.0.tgz"
SRC_URI[md5sum] = "87536ffa693f574afd1663c9f76a0429"
SRC_URI[sha256sum] = "f7306891fbed999f7be4e29e30e8c61d0a2743fb95f18e8df420e3a42e3ad55a"

NPM_PKGNAME = "brace-expansion"

inherit npmhelper
inherit native
