SUMMARY = "NPM: cacheable-lookup"
DESCRIPTION = "A cacheable dns.lookup(…) that respects the TTL"
HOMEPAGE = "https://github.com/szmarczak/cacheable-lookup#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a0ab677f942ddc394168925c5a9328"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cacheable-lookup/-/cacheable-lookup-6.0.0.tgz"
SRC_URI[md5sum] = "42369c6c7c1acd3e923728e3b1a700f9"
SRC_URI[sha256sum] = "dbbe2927fe8297e664a1fcc18d0b2eef4fe5542503359d3e2016b2a626c7f29e"

NPM_PKGNAME = "cacheable-lookup"

inherit npmhelper
inherit native
