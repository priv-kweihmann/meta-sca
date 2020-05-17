SUMMARY = "NPM: no-case"
DESCRIPTION = "Transform into a lower cased string with spaces between words"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/no-case#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-lower-case-native \
           npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/no-case/-/no-case-3.0.3.tgz"
SRC_URI[md5sum] = "0a1c508b4f1a6e271970bc770dc031eb"
SRC_URI[sha256sum] = "5642d8b06b429fd8455aba9d4aa778c70a55550c839a30b94218c57b5dba6c02"

NPM_PKGNAME = "no-case"

inherit npmhelper
inherit native
