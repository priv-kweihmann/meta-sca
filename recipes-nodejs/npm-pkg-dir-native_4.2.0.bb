SUMMARY = "NPM: pkg-dir"
DESCRIPTION = "Find the root directory of a Node.js project or npm package"
HOMEPAGE = "https://github.com/sindresorhus/pkg-dir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/pkg-dir/-/pkg-dir-4.2.0.tgz"
SRC_URI[md5sum] = "5e6cbcda90ee1b6006cbf5a5945048eb"
SRC_URI[sha256sum] = "a7f4456094d571d70d29f32aa5fa1c738cb8c7087034661078b8678f0153224d"

NPM_PKGNAME = "pkg-dir"

inherit npmhelper
inherit native
