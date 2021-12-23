SUMMARY = "NPM: sshpk"
DESCRIPTION = "A library for finding and using SSH public keys"
HOMEPAGE = "https://github.com/arekinath/node-sshpk#readme"

DEPENDS = "npm-asn1-native npm-assert-plus-native npm-bcrypt-pbkdf-native npm-dashdash-native npm-ecc-jsbn-native npm-getpass-native npm-jsbn-native npm-safer-buffer-native npm-tweetnacl-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc"

SRC_URI = "https://registry.npmjs.org/sshpk/-/sshpk-1.16.1.tgz"
SRC_URI[md5sum] = "37ca447c8240cb57a9a7cf01e54c2f43"
SRC_URI[sha256sum] = "5c4adda13e7ac814c9668bd3d495e3292f4b5d041f181bf5bbd092dd5d2b0839"

S = "${WORKDIR}/package"

NPM_PKGNAME = "sshpk"

inherit npmhelper
inherit native
