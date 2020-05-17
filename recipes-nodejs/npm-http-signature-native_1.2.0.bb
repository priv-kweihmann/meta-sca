SUMMARY = "NPM: http-signature"
DESCRIPTION = "Reference implementation of Joyent's HTTP Signature scheme."
HOMEPAGE = "https://github.com/joyent/node-http-signature/"

DEPENDS = "npm-assert-plus-native npm-jsprim-native npm-sshpk-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc"

SRC_URI = "https://registry.npmjs.org/http-signature/-/http-signature-1.2.0.tgz"
SRC_URI[md5sum] = "263b67bf9ae18003ee513825bfedcce7"
SRC_URI[sha256sum] = "66be6d6fddeaf39acc4fb1437af28ff6a0401a740c479f183718f649d03205f9"

S = "${WORKDIR}/package"

NPM_PKGNAME = "http-signature"

inherit npmhelper
inherit native
