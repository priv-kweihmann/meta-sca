SUMMARY = "NPM: registry-url"
DESCRIPTION = "Get the set npm registry URL"
HOMEPAGE = "https://github.com/sindresorhus/registry-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-rc-native"

SRC_URI = "https://registry.npmjs.org/registry-url/-/registry-url-5.1.0.tgz"
SRC_URI[md5sum] = "ae8c08d018ca710448dc14f7af530265"
SRC_URI[sha256sum] = "339f03230280fae8034fe490d21e3b13a169f39c00b75d17d751d1a8990d5a9c"

NPM_PKGNAME = "registry-url"

inherit npmhelper
inherit native
