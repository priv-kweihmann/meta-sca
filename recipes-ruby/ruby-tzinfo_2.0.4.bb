SUMMARY = "RubyGem: tzinfo"
DESCRIPTION = "TZInfo provides access to time zone data and allows times to be converted using time zone rules."
HOMEPAGE = "https://tzinfo.github.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7a23b7bc3769392321d91780fe51a4e"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-concurrent-ruby"

SRC_URI[md5sum] = "64689a72ca22a4ed855a32ce97f313e0"
SRC_URI[sha256sum] = "9fd0906c2409f729e90c78695e1001fa28f2fa72faa5ad2f6074c3e44e2f1783"

GEM_NAME = "tzinfo"

inherit rubygems
