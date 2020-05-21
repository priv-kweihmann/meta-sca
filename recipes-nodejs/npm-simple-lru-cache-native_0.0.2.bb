SUMMARY = "NPM: simple-lru-cache"
DESCRIPTION = "node-simple-lru-cache ====================="
HOMEPAGE = "https://github.com/geisbruch/node-simple-lru-cache"

LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c38eccb8acd88c71e334405d972f483"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/simple-lru-cache/-/simple-lru-cache-0.0.2.tgz"
SRC_URI[md5sum] = "35f3a5f7eef0af58de3672a29b197597"
SRC_URI[sha256sum] = "8e0032431715e5b9ff88f50c943748bc43b91e64185a647ed53be3767cdf2950"

NPM_PKGNAME = "simple-lru-cache"

inherit npmhelper
inherit native
