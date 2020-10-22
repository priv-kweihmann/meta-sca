SUMMARY = "NPM: eslint-config-standard"
DESCRIPTION = "JavaScript Standard Style - ESLint Shareable Config"
HOMEPAGE = "https://github.com/standard/eslint-config-standard"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-config-standard/-/eslint-config-standard-15.0.0.tgz"
SRC_URI[md5sum] = "ce6edf44d52ab3934e9e8f96706abb47"
SRC_URI[sha256sum] = "7872cf6050a40b443e93dbc85c62c9b4967e76c7488535b71c3819d5c67f0359"

NPM_PKGNAME = "eslint-config-standard"

inherit npmhelper
inherit native
