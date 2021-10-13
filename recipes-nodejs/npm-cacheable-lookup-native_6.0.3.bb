SUMMARY = "NPM: cacheable-lookup"
DESCRIPTION = "A cacheable dns.lookup(…) that respects TTL"
HOMEPAGE = "https://github.com/szmarczak/cacheable-lookup#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a0ab677f942ddc394168925c5a9328"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cacheable-lookup/-/cacheable-lookup-6.0.3.tgz"
SRC_URI[md5sum] = "0b9690be0f81cbad617c9c5bb3a94116"
SRC_URI[sha256sum] = "aa8d5bc3df5b7b52d9b13f8f2584d93bea690794d6c1b1fe72b6939721cf9e26"

NPM_PKGNAME = "cacheable-lookup"

inherit npmhelper
inherit native
