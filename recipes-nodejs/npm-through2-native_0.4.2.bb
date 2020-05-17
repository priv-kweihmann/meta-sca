SUMMARY = "NPM: through2"
DESCRIPTION = "A tiny wrapper around Node streams2 Transform to avoid explicit subclassing noise"
HOMEPAGE = "https://github.com/rvagg/through2"

DEPENDS = "npm-readable-stream-native npm-xtend-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3827423e10328147d44783718699586"

SRC_URI = "https://registry.npmjs.org/through2/-/through2-0.4.2.tgz"
SRC_URI[md5sum] = "964c7cdf217ea0b7be4bf35276038faa"
SRC_URI[sha256sum] = "5ced6c39ca9c3d620436b719765beee2d8fc48dd6d39eafd8f37ad71450d9bc6"

NPM_PKGNAME = "through2"

inherit npmhelper
inherit native
