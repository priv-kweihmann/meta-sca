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
           npm-eslint-plugin-standard-native \
           npm-standard-engine-native"

SRC_URI = "https://registry.npmjs.org/standard/-/standard-15.0.0.tgz"
SRC_URI[md5sum] = "cec1b7a55b02bf29d188ea06f20692f7"
SRC_URI[sha256sum] = "0fb24911ffd46981388b88bcf9ea6bc7f6bb983e13faf201f41eac2453d70e0d"

NPM_PKGNAME = "standard"

inherit npmhelper
inherit native
