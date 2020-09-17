SUMMARY = "NPM: sugarss"
DESCRIPTION = "Indent-based CSS syntax for PostCSS"
HOMEPAGE = "https://github.com/postcss/sugarss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4134d402e7331fd1e7d9f294aa26def4"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/sugarss/-/sugarss-3.0.0.tgz"
SRC_URI[md5sum] = "427c5f23f60ff6563a3b8f63535ed80b"
SRC_URI[sha256sum] = "76c8707a281c072430951035c067d996eb2738afbab62d41de0d057c2db2cc64"

NPM_PKGNAME = "sugarss"

inherit npmhelper
inherit native
