SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-8.2.0.tgz"
SRC_URI[md5sum] = "9284a00f3cfaf951692eec601ba11731"
SRC_URI[sha256sum] = "60923110f8c42e9db7ee769a78685bf35847f6b0ce6cdfb809fc9e194c891d49"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
