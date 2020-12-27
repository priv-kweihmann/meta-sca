SUMMARY = "NPM: unified-message-control"
DESCRIPTION = "Enable, disable, and ignore messages from unified processors"
HOMEPAGE = "https://github.com/unifiedjs/unified-message-control#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-unist-util-visit-native \
           npm-vfile-location-native"

SRC_URI = "https://registry.npmjs.org/unified-message-control/-/unified-message-control-3.0.2.tgz"
SRC_URI[md5sum] = "1919e2c09c6e3655722a04f788256066"
SRC_URI[sha256sum] = "55f9a7348cc64bd348910f360669c8ef245510c8bf5b2cab5d2aa1c903e51f35"

NPM_PKGNAME = "unified-message-control"

inherit npmhelper
inherit native
