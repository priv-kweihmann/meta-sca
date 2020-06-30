SUMMARY = "NPM: through2"
DESCRIPTION = "A tiny wrapper around Node.js streams.Transform (Streams2/3) to avoid explicit subclassing noise"
HOMEPAGE = "https://github.com/rvagg/through2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=86fc40a92fe89e4ec72daa6fab2f9c21"

DEPENDS = "npm-readable-stream-native"

SRC_URI = "https://registry.npmjs.org/through2/-/through2-4.0.2.tgz"
SRC_URI[md5sum] = "5a33f63029fad1e25b5e1994987aa854"
SRC_URI[sha256sum] = "0dde217e77a92736898095350498159a9a7265703f716683699c46ed5862f775"

NPM_PKGNAME = "through2"

inherit npmhelper
inherit native
