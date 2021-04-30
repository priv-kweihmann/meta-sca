SUMMARY = "NPM: @types/repeat-string"
DESCRIPTION = "TypeScript definitions for repeat-string"
HOMEPAGE = "https://github.com/jonschlinkert/repeat-string"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/repeat-string/-/repeat-string-1.6.0.tgz"
SRC_URI[md5sum] = "e891af4cd9aaf0ea2b2fc69665bbe243"
SRC_URI[sha256sum] = "6643c9e9471cd74b7f21ecf61968890c9d806593727af78cbce34016ad14a5d3"

NPM_PKGNAME = "@types/repeat-string"

inherit npmhelper
inherit native

S = "${WORKDIR}/repeat-string"
