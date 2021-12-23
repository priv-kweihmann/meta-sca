SUMMARY = "NPM: queue-microtask"
DESCRIPTION = "fast, tiny `queueMicrotask` shim for modern engines"
HOMEPAGE = "https://github.com/feross/queue-microtask"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/queue-microtask/-/queue-microtask-1.2.3.tgz"
SRC_URI[md5sum] = "8a62daae67a615b3f97c843906e875dd"
SRC_URI[sha256sum] = "ffaf0a20a201865e143aa27e57a83bf69a75547729a65cd3180bcba4f0f29ecd"

NPM_PKGNAME = "queue-microtask"

inherit npmhelper
inherit native
