SUMMARY = "NPM: cacheable-lookup"
DESCRIPTION = "A cacheable dns.lookup(…) that respects the TTL"
HOMEPAGE = "https://github.com/szmarczak/cacheable-lookup#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a0ab677f942ddc394168925c5a9328"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cacheable-lookup/-/cacheable-lookup-6.0.1.tgz"
SRC_URI[md5sum] = "5db4d9b00e765f96414f3972e388e8e6"
SRC_URI[sha256sum] = "759d9d66ad019ac9044dc67e0a1f8bb06d4f43bc55b748d04fb4c7da1d943da2"

NPM_PKGNAME = "cacheable-lookup"

inherit npmhelper
inherit native
