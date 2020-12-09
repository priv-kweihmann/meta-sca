SUMMARY = "NPM: cacheable-lookup"
DESCRIPTION = "A cacheable dns.lookup(…) that respects the TTL"
HOMEPAGE = "https://github.com/szmarczak/cacheable-lookup#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a0ab677f942ddc394168925c5a9328"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cacheable-lookup/-/cacheable-lookup-5.0.4.tgz"
SRC_URI[md5sum] = "7cd45f3ff7916273469804970bce3338"
SRC_URI[sha256sum] = "2419abfe06ca5bbcd4afd5aadaeab449083dbb6668a6c15c9564953bdaf1868c"

NPM_PKGNAME = "cacheable-lookup"

inherit npmhelper
inherit native
