SUMMARY = "NPM: cacheable-lookup"
DESCRIPTION = "A cacheable dns.lookup(…) that respects TTL"
HOMEPAGE = "https://github.com/szmarczak/cacheable-lookup#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a0ab677f942ddc394168925c5a9328"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cacheable-lookup/-/cacheable-lookup-6.0.2.tgz"
SRC_URI[md5sum] = "5763204ef62d638795370ccda07e2810"
SRC_URI[sha256sum] = "a08e124fd2492cca19f6f629472229d7485b7f16dc3334ca07bbe6af4b134d96"

NPM_PKGNAME = "cacheable-lookup"

inherit npmhelper
inherit native
