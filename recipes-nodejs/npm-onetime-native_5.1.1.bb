SUMMARY = "NPM: onetime"
DESCRIPTION = "Ensure a function is only called once"
HOMEPAGE = "https://github.com/sindresorhus/onetime#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/onetime/-/onetime-5.1.1.tgz"
SRC_URI[md5sum] = "d1779142b27120fd5f43a474a90be553"
SRC_URI[sha256sum] = "4d50a04ea961468c89a26ffcdaeb22ad7113a909c4879227b6c274c4c78893c0"

NPM_PKGNAME = "onetime"

inherit npmhelper
inherit native
