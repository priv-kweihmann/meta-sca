SUMMARY = "NPM: onetime"
DESCRIPTION = "Ensure a function is only called once"
HOMEPAGE = "https://github.com/sindresorhus/onetime#readme"

DEPENDS = "npm-mimic-fn-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/onetime/-/onetime-5.1.0.tgz"
SRC_URI[md5sum] = "281b544cc4c7b8ce9d67d1f9313fbc39"
SRC_URI[sha256sum] = "14312d032f6f8181aae534042583bc109aac1c91225b6059e83ab747ccaa1ff4"

NPM_PKGNAME = "onetime"

inherit npmhelper
inherit native
