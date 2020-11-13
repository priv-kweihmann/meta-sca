SUMMARY = "NPM: standard"
DESCRIPTION = "JavaScript Standard Style"
HOMEPAGE = "https://standardjs.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = "npm-eslint-config-standard-jsx-native \
           npm-eslint-config-standard-native \
           npm-eslint-native \
           npm-eslint-plugin-import-native \
           npm-eslint-plugin-node-native \
           npm-eslint-plugin-promise-native \
           npm-eslint-plugin-react-native \
           npm-standard-engine-native"

SRC_URI = "https://registry.npmjs.org/standard/-/standard-16.0.2.tgz"
SRC_URI[md5sum] = "b59ffc5a379eb4eb1ff7d70be6956e72"
SRC_URI[sha256sum] = "9bdcb44f0c67551bcc6741b13c446793de1ae4b9ea095d438743c3a00958df0e"

NPM_PKGNAME = "standard"

inherit npmhelper
inherit native
