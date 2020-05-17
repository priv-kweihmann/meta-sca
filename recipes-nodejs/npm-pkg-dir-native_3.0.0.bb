SUMMARY = "NPM: pkg-dir"
DESCRIPTION = "Find the root directory of a Node.js project or npm package"
HOMEPAGE = "https://github.com/sindresorhus/pkg-dir#readme"

DEPENDS = "npm-find-up-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/pkg-dir/-/pkg-dir-3.0.0.tgz"
SRC_URI[md5sum] = "fe41288c61d6cf9d89b1eef4d6b02d9a"
SRC_URI[sha256sum] = "3d14f7cff4bb7e1630c2810152235b3b0b86052800ff04f0140a32ca4aa2c93f"

NPM_PKGNAME = "pkg-dir"

inherit npmhelper
inherit native
