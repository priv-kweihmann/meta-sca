SUMMARY = "NPM: cacheable-lookup"
DESCRIPTION = "A cacheable dns.lookup(…) that respects the TTL"
HOMEPAGE = "https://github.com/szmarczak/cacheable-lookup#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a0ab677f942ddc394168925c5a9328"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cacheable-lookup/-/cacheable-lookup-5.0.3.tgz"
SRC_URI[md5sum] = "4e625043370a71ff8cf7c4d855d19696"
SRC_URI[sha256sum] = "42816cace1ca316fdd58dc376642c4d02eecc609be981f0a5ae855f2c89f36f1"

NPM_PKGNAME = "cacheable-lookup"

inherit npmhelper
inherit native
