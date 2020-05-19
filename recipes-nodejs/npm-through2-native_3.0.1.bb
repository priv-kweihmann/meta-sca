SUMMARY = "NPM: through2"
DESCRIPTION = "A tiny wrapper around Node.js streams.Transform (Streams2/3) to avoid explicit subclassing noise"
HOMEPAGE = "https://github.com/rvagg/through2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=86fc40a92fe89e4ec72daa6fab2f9c21"

DEPENDS = "npm-readable-stream-native"

SRC_URI = "https://registry.npmjs.org/through2/-/through2-3.0.1.tgz"
SRC_URI[md5sum] = "988e1f9636fc22d4b70594bf37bfa243"
SRC_URI[sha256sum] = "88f8213f75231dd1f228086abfc08be2e048f793d3bc4f0217b12d612ae7bdec"

NPM_PKGNAME = "through2"

inherit npmhelper
inherit native
