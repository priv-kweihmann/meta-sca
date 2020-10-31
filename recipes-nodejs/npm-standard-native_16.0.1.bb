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

SRC_URI = "https://registry.npmjs.org/standard/-/standard-16.0.1.tgz"
SRC_URI[md5sum] = "51e562b7da1a2bc64c85fc06d894b5d7"
SRC_URI[sha256sum] = "0341c7b20ae0668c1ecf988df9fa19ae03b54719360c8b1a456ad4a8c9e02799"

NPM_PKGNAME = "standard"

inherit npmhelper
inherit native
