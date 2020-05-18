SUMMARY = "NPM: through2"
DESCRIPTION = "A tiny wrapper around Node streams2 Transform to avoid explicit subclassing noise"
HOMEPAGE = "https://github.com/rvagg/through2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=86fc40a92fe89e4ec72daa6fab2f9c21"

DEPENDS = "npm-readable-stream-native \
           npm-xtend-native"

SRC_URI = "https://registry.npmjs.org/through2/-/through2-2.0.5.tgz"
SRC_URI[md5sum] = "1851ab1a4a590a094057537cb8b26060"
SRC_URI[sha256sum] = "9da7074faffd6a71ebb9387e5f7833158d7b3b174b05dc92d9c77f2a56a9c3b9"

NPM_PKGNAME = "through2"

inherit npmhelper
inherit native
