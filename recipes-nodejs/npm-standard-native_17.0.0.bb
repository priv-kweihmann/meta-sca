SUMMARY = "NPM: standard"
DESCRIPTION = "JavaScript Standard Style"
HOMEPAGE = "https://standardjs.com"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = "npm-eslint-config-standard-jsx-native \
           npm-eslint-config-standard-native \
           npm-eslint-native \
           npm-eslint-plugin-import-native \
           npm-eslint-plugin-n-native \
           npm-eslint-plugin-promise-native \
           npm-eslint-plugin-react-native \
           npm-standard-engine-native"

SRC_URI = "https://registry.npmjs.org/standard/-/standard-17.0.0.tgz"
SRC_URI[md5sum] = "a3348a845006b1ab276e8e53300da936"
SRC_URI[sha256sum] = "af6ceb9e3d9a61b0ea80ca64164773f7c0b090e04e844a665958ebb03726e79c"

NPM_PKGNAME = "standard"

inherit npmhelper
inherit native
