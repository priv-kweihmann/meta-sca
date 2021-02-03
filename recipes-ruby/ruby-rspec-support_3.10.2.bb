SUMMARY = "RubyGem: rspec-support"
DESCRIPTION = "Support utilities for RSpec gems"
HOMEPAGE = "https://github.com/rspec/rspec-support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e4c6d4a0edc4927fd19ea2608a4b5fe5"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "00c08161019a7f7ff0525dc960153500"
SRC_URI[sha256sum] = "74315f89069fbaf2a710e2117340373b77ee45eceb026de87e0cad9dd5154596"

GEM_NAME = "rspec-support"

inherit rubygems
