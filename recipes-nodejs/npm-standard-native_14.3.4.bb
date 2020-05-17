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

SRC_URI = "https://registry.npmjs.org/standard/-/standard-14.3.4.tgz"
SRC_URI[md5sum] = "2dca46c6a53f76ff081b4ab61394f3ef"
SRC_URI[sha256sum] = "e48274aaecf872ac30009a70129bbffdf299955ce7830e64110419457e3802f7"

NPM_PKGNAME = "standard"

inherit npmhelper
inherit native
