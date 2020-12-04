SUMMARY = "NPM: upper-case-first"
DESCRIPTION = "Transforms the string with the first character in upper cased"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/upper-case-first#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/upper-case-first/-/upper-case-first-2.0.2.tgz"
SRC_URI[md5sum] = "9a2e640f4b08f3e1bbe84cc9494bbdd1"
SRC_URI[sha256sum] = "dd15922c1c717dceb71248930043b4d36c6b98274e610813b9acbcac6e1f1b91"

NPM_PKGNAME = "upper-case-first"

inherit npmhelper
inherit native
