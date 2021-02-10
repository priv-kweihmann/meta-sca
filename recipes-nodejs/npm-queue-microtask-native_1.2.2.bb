SUMMARY = "NPM: queue-microtask"
DESCRIPTION = "fast, tiny `queueMicrotask` shim for modern engines"
HOMEPAGE = "https://github.com/feross/queue-microtask"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/queue-microtask/-/queue-microtask-1.2.2.tgz"
SRC_URI[md5sum] = "bfa07918479da59a8ea8bd9c804ba014"
SRC_URI[sha256sum] = "ac803d70b5d2737cead6f54aaf86b4ef1656c4ffea590928e18474eeb7fd0197"

NPM_PKGNAME = "queue-microtask"

inherit npmhelper
inherit native
