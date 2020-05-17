SUMMARY = "NPM: execall"
DESCRIPTION = "Find multiple RegExp matches in a string"
HOMEPAGE = "https://github.com/sindresorhus/execall#readme"

DEPENDS = "npm-clone-regexp-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/execall/-/execall-2.0.0.tgz"
SRC_URI[md5sum] = "47497421b6f452388543a17f89d63c2b"
SRC_URI[sha256sum] = "2a34f00d27fe4228a6ebbe9f145b6ae6484af0231f58c8786e1bb5e6e74e28aa"

NPM_PKGNAME = "execall"

inherit npmhelper
inherit native
