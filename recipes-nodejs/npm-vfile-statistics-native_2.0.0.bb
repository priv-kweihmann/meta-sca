SUMMARY = "NPM: vfile-statistics"
DESCRIPTION = "vfile utility to count messages per category: failures, warnings, etc"
HOMEPAGE = "https://github.com/vfile/vfile-statistics#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/vfile-statistics/-/vfile-statistics-2.0.0.tgz"
SRC_URI[md5sum] = "f29e74685ea95970151e1ea90f2e0cce"
SRC_URI[sha256sum] = "e3381284892fae2b3eb3b34908e40f8f695f9b7c68a329f28afa1fd328a07433"

NPM_PKGNAME = "vfile-statistics"

inherit npmhelper
inherit native
