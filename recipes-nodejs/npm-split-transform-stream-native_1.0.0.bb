SUMMARY = "NPM: split-transform-stream"
DESCRIPTION = "A combination of through2 and split with a straightforward interface."
HOMEPAGE = "https://github.com/alessioalex/split-transform-stream#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=35;md5=24cb9b8f5d5504f9a02d741c769907c6"

DEPENDS = "npm-pump-chain-native \
           npm-split-native \
           npm-through2-native"

SRC_URI = "https://registry.npmjs.org/split-transform-stream/-/split-transform-stream-1.0.0.tgz"
SRC_URI[md5sum] = "367e7edbd706c2552fbaf11ae42b6395"
SRC_URI[sha256sum] = "fd2c94cae4a1c2bbe6f6756e818d09a2647a145c2ffc3ed4f9436931cc7fff90"

NPM_PKGNAME = "split-transform-stream"

inherit npmhelper
inherit native
