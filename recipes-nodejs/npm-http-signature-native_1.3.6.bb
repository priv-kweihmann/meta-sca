SUMMARY = "NPM: http-signature"
DESCRIPTION = "Reference implementation of Joyent's HTTP Signature scheme."
HOMEPAGE = "https://github.com/joyent/node-http-signature/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc"

DEPENDS = "npm-assert-plus-native \
           npm-jsprim-native \
           npm-sshpk-native"

SRC_URI = "https://registry.npmjs.org/http-signature/-/http-signature-1.3.6.tgz"
SRC_URI[md5sum] = "0020615fc4a5b6f227e8bf5c0ff2f3aa"
SRC_URI[sha256sum] = "4e011d05dcef0582e90883c59db4b988bbbdaca8c425c6b534058766f070defe"

NPM_PKGNAME = "http-signature"

inherit npmhelper
inherit native
