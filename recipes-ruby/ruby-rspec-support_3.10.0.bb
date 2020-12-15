SUMMARY = "RubyGem: rspec-support"
DESCRIPTION = "Support utilities for RSpec gems"
HOMEPAGE = "https://github.com/rspec/rspec-support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e4c6d4a0edc4927fd19ea2608a4b5fe5"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "f88a15747a5e9b9f19e89541b9ab6b1f"
SRC_URI[sha256sum] = "9f4e11812aaeaa991a128437d3398583f876906f0b9cf1de9125b26f22121648"

GEM_NAME = "rspec-support"

inherit rubygems
