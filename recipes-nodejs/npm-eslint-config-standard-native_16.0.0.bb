SUMMARY = "NPM: eslint-config-standard"
DESCRIPTION = "JavaScript Standard Style - ESLint Shareable Config"
HOMEPAGE = "https://github.com/standard/eslint-config-standard"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-config-standard/-/eslint-config-standard-16.0.0.tgz"
SRC_URI[md5sum] = "908618eaccd30ff385bbd783a7446f26"
SRC_URI[sha256sum] = "a6fbbdeb15e54a3d4897b2d607d5b7e5854caedb25e4360028af9e6f507bf43d"

NPM_PKGNAME = "eslint-config-standard"

inherit npmhelper
inherit native
