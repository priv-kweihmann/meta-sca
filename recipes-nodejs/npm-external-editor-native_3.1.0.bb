SUMMARY = "NPM: external-editor"
DESCRIPTION = "Edit a string with the users preferred text editor using $VISUAL or $ENVIRONMENT"
HOMEPAGE = "https://github.com/mrkmg/node-external-editor#readme"

DEPENDS = "npm-chardet-native npm-iconv-lite-native npm-tmp-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23452ab17e6bbce5c3b52f15efb4a78b"

SRC_URI = "https://registry.npmjs.org/external-editor/-/external-editor-3.1.0.tgz"
SRC_URI[md5sum] = "4abfde2e8a01372bae558949d9b26b05"
SRC_URI[sha256sum] = "c66f80f10acedf85b466bf6b8848e4ab74edd6e00e18c4840fa585fffd229a90"

NPM_PKGNAME = "external-editor"

inherit npmhelper
inherit native
