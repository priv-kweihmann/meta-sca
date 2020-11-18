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

SRC_URI = "https://registry.npmjs.org/standard/-/standard-16.0.3.tgz"
SRC_URI[md5sum] = "bcd0932892bf9babbda7f5ac03df7602"
SRC_URI[sha256sum] = "de6b46fa05f308f7d819f08eb3eb927e403d3f6422d225d0aac88ef0b3ae0df1"

NPM_PKGNAME = "standard"

inherit npmhelper
inherit native
