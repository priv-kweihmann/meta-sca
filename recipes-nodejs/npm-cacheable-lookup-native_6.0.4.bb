SUMMARY = "NPM: cacheable-lookup"
DESCRIPTION = "A cacheable dns.lookup(…) that respects TTL"
HOMEPAGE = "https://github.com/szmarczak/cacheable-lookup#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a0ab677f942ddc394168925c5a9328"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cacheable-lookup/-/cacheable-lookup-6.0.4.tgz"
SRC_URI[md5sum] = "dfd47e4395c3df11cca1d0f30ebbbb63"
SRC_URI[sha256sum] = "a274ba297176479c192bcf93801f5ff1a25e453aaeed109531d4c774d2e4684c"

NPM_PKGNAME = "cacheable-lookup"

inherit npmhelper
inherit native
