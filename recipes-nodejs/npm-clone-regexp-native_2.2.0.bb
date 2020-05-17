SUMMARY = "NPM: clone-regexp"
DESCRIPTION = "Clone and modify a RegExp instance"
HOMEPAGE = "https://github.com/sindresorhus/clone-regexp#readme"

DEPENDS = "npm-is-regexp-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/clone-regexp/-/clone-regexp-2.2.0.tgz"
SRC_URI[md5sum] = "1718066d048c732d05f5bbb7e58fb28d"
SRC_URI[sha256sum] = "e5edd6c07d0fd771539da7320111df74b901d016656e18dba79f36a620dfc07f"

NPM_PKGNAME = "clone-regexp"

inherit npmhelper
inherit native
