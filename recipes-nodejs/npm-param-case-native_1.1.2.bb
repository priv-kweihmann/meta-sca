SUMMARY = "NPM: param-case"
DESCRIPTION = "Param case a string"
HOMEPAGE = "https://github.com/blakeembrey/param-case"

DEPENDS = "npm-sentence-case-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

SRC_URI = "https://registry.npmjs.org/param-case/-/param-case-1.1.2.tgz"
SRC_URI[md5sum] = "d9f11a2f14835c85df216d5cacfc5433"
SRC_URI[sha256sum] = "1544959a20b8890bc573be7831e4b67a0d4d20d2e6e9a53796c62fede8e614bc"

NPM_PKGNAME = "param-case"

inherit npmhelper
inherit native
