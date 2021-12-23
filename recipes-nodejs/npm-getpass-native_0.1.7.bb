SUMMARY = "NPM: getpass"
DESCRIPTION = "getpass for node.js"
HOMEPAGE = "https://github.com/arekinath/node-getpass#readme"

DEPENDS = "npm-assert-plus-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc"

SRC_URI = "https://registry.npmjs.org/getpass/-/getpass-0.1.7.tgz"
SRC_URI[md5sum] = "32d7ddf970d9ed3e525fe1b2425f942d"
SRC_URI[sha256sum] = "8f0312ba10766d6c13bf71bae5168ca26191f6eed5c47ac5fa7c4df85b3ed445"

S = "${WORKDIR}/package"

NPM_PKGNAME = "getpass"

inherit npmhelper
inherit native
