SUMMARY = "NPM: http-signature"
DESCRIPTION = "Reference implementation of Joyent's HTTP Signature scheme."
HOMEPAGE = "https://github.com/joyent/node-http-signature/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc"

DEPENDS = "npm-assert-plus-native \
           npm-jsprim-native \
           npm-sshpk-native"

SRC_URI = "https://registry.npmjs.org/http-signature/-/http-signature-1.3.4.tgz"
SRC_URI[md5sum] = "953999940c6cd65380658a08b0cba014"
SRC_URI[sha256sum] = "e04b72a789d6861d612e44909f48885845afd0b0700df79baa240f0fb2b67d4a"

NPM_PKGNAME = "http-signature"

inherit npmhelper
inherit native
