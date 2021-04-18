SUMMARY = "RubyGem: connection_pool"
DESCRIPTION = "Generic connection pool for Ruby"
HOMEPAGE = "https://github.com/mperham/connection_pool"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52789255e9a79d4ae4a5ab6831d80fd1"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "498bdfe245ece1c2025fd3727a3dc7e3"
SRC_URI[sha256sum] = "13a8fc3921ce4df8e04fb65f1037251decb08d74757b41163688bd1c1feccd39"

GEM_NAME = "connection_pool"

inherit rubygems
