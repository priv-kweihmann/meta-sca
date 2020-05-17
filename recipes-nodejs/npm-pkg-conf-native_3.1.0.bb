SUMMARY = "NPM: pkg-conf"
DESCRIPTION = "Get namespaced config from the closest package.json"
HOMEPAGE = "https://github.com/sindresorhus/pkg-conf#readme"

DEPENDS = "npm-find-up-native npm-load-json-file-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/pkg-conf/-/pkg-conf-3.1.0.tgz"
SRC_URI[md5sum] = "203fea73ee9e3c5a4ed373a4fc5875ad"
SRC_URI[sha256sum] = "4672b03064d759879cc101a42b8175f3be9081e3ba739e9f7ae5e69c14762ed3"

NPM_PKGNAME = "pkg-conf"

inherit npmhelper
inherit native
