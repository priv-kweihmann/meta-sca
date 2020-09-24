SUMMARY = "NPM: http-signature"
DESCRIPTION = "Reference implementation of Joyent's HTTP Signature scheme."
HOMEPAGE = "https://github.com/joyent/node-http-signature/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc"

DEPENDS = "npm-assert-plus-native \
           npm-jsprim-native \
           npm-sshpk-native"

SRC_URI = "https://registry.npmjs.org/http-signature/-/http-signature-1.3.5.tgz"
SRC_URI[md5sum] = "3ec360fb44d22ad0153c1bcf02c02a44"
SRC_URI[sha256sum] = "ddb60396916dafa1b3b942ac814d2ea4cbfd3a120f95875d43cfb9defef7236b"

NPM_PKGNAME = "http-signature"

inherit npmhelper
inherit native
