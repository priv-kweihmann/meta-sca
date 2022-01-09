SUMMARY = "NPM: sshpk"
DESCRIPTION = "A library for finding and using SSH public keys"
HOMEPAGE = "https://github.com/arekinath/node-sshpk#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc"

DEPENDS = "npm-asn1-native \
           npm-assert-plus-native \
           npm-bcrypt-pbkdf-native \
           npm-dashdash-native \
           npm-ecc-jsbn-native \
           npm-getpass-native \
           npm-jsbn-native \
           npm-safer-buffer-native \
           npm-tweetnacl-native"

SRC_URI = "https://registry.npmjs.org/sshpk/-/sshpk-1.17.0.tgz"
SRC_URI[md5sum] = "6f2452a859ddec68aafd428c65966989"
SRC_URI[sha256sum] = "7bab3838aba6583c53caa391c970a0a7595913401bfd284c0451aa8e040158f2"

NPM_PKGNAME = "sshpk"

inherit npmhelper
inherit native
