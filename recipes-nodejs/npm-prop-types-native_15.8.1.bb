SUMMARY = "NPM: prop-types"
DESCRIPTION = "Runtime type checking for React props and similar objects."
HOMEPAGE = "https://facebook.github.io/react/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94f0d486b3ba1dd568004dc5cccd32bc"

DEPENDS = "npm-loose-envify-native \
           npm-object-assign-native \
           npm-react-is-native"

SRC_URI = "https://registry.npmjs.org/prop-types/-/prop-types-15.8.1.tgz"
SRC_URI[md5sum] = "d5c4d407a8f308545c0d76b229e1f4be"
SRC_URI[sha256sum] = "1c739eb05d8a462c286a4e9dd02f2ce5485c6fa3529244e9ff9b13a3671aa557"

NPM_PKGNAME = "prop-types"

inherit npmhelper
inherit native
