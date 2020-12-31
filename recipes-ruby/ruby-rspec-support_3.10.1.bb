SUMMARY = "RubyGem: rspec-support"
DESCRIPTION = "Support utilities for RSpec gems"
HOMEPAGE = "https://github.com/rspec/rspec-support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e4c6d4a0edc4927fd19ea2608a4b5fe5"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "4754e75d9ec8e3303ba71f3ace7b17da"
SRC_URI[sha256sum] = "06a16ee6964a0902d8ce544c917253b5b53cc6ae0c712ecc6fae11e772c389d3"

GEM_NAME = "rspec-support"

inherit rubygems
